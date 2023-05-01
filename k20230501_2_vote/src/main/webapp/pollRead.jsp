<%@page import="k20230501_2_vote.PollRead"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표하기</title>
</head>
<body>
	<%
	String filepath = application.getRealPath("/" + "poll.txt");

	ArrayList<String> poll = PollRead.pollRead(filepath);

	//for (String str : poll) {
	//	out.println(str+"<br>");}

	int itemCount = (poll.size() - 1) / 2;
	//out.println(itemCount + "<br>");
	%>
<form action="pollWrite.jsp" method="post">
	<table border="1" width="500" align="center" cellspacing="0" cellpadding="5">
		<tr>
			<th><%=poll.get(0)%></th>
		</tr>
		<%
		for (int i = 1; i <= itemCount; i++) {
		%>
		<tr>
			<td>
			<input type="radio" name ="poll" value = "<%=i%>">  <!-- 값을 넘겨줌 -->
			<%=poll.get(i)%>           <!--돌아가며 구단이름 적어줌  -->
			</td>
		</tr>
		<%
		}
		%>
		<tr>
		<td align="center">
			<input type="submit" value ="투표하기">
			<input type="button" value ="결과보기" onclick="location.href='pollResult.jsp'" >
			</td>
			</tr>
			
	</table>


</form>

</body>
</html>