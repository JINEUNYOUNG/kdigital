<%@page import="java.util.StringTokenizer"%>
<%@page import="com.tjoeun.onLinePoll.PollRead"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표하기</title>
<link rel="icon" href="favicon.ico">

</head>
<body>
	<%
	//out.println(application.getRealPath("/")+"poll.txt<br>");
	String filepath = application.getRealPath("/") + "poll.txt";
	ArrayList<String> poll = PollRead.pollread(filepath);
	//out.println(poll);
	//for (String str : poll) {
	//	out.println(str+"<br>");
	//}

	int itemCount = 0;

	itemCount = (poll.size() - 1) / 2;

	//out.println(itemCount+"<br>");
	%>
	<form action="pollWrite.jsp" method="post">
	<table border="1" width="500" align="center" cellspacing="0" cellpadding="5">
		<tr>
			<!-- 줄 -->
			<th>
				<!-- 칸, 표의 첫줄을 구성(굵게 및 가운데정렬) --> <!--
<% 
out.println(poll.get(0));
%>
--> <%=poll.get(0)%>

			</th>


		</tr>
		<%
		for (int i = 0; i < itemCount; i++) {
		%>
		<tr>
			<td><input type="radio" name="poll" value="<%=i%>"> <%=poll.get(i+1)%>
			</td>
		</tr>
		<%
		}
		%>
		<tr>
			<td align="center"><input type="submit" value="투표하기"> 
			<input type="button" value="결과보기" onclick="location.href='pollResult.jsp'">
			</td>
		</tr>

	</table>
</form>



</body>
</html>