<%@page import="java.text.DecimalFormat"%>
<%@page import="com.tjoeun.onLinePoll.PollRead"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과보기</title>
<link rel="icon" href="favicon.ico">

<meta http-equiv="refresh" content="1; url='?'">
</head>
<body>

	<%
	String filepath = application.getRealPath("/") + "poll.txt";
	ArrayList<String> poll = PollRead.pollread(filepath);
	int itemCount = (poll.size() - 1) / 2;

	//전체투표수에서 득표수를 나눠주면 득표율 
	int sum = 0;
	for (int i = itemCount + 1; i < poll.size(); i++) {
		sum += Integer.parseInt(poll.get(i));
	}

	DecimalFormat df1 = new DecimalFormat("#,##0표"); //득표수
	DecimalFormat df2 = new DecimalFormat("0.00"); //득표율
	%>
	<table border="1" width="500" align="center" cellspacing="0"
		cellpadding="5">
		<tr>
			<th colspan="2"><%=poll.get(0)%></th>
		</tr>
		<tr>
			<td align="right" colspan="2">총투표수 : <%=df1.format(sum)%>
			</td>
		</tr>
		<%
		for (int i = 1; i <=itemCount; i++) {
			int pyo = Integer.parseInt(poll.get(i+itemCount));
			double per = (double) pyo / sum;
		%>
		<tr>
			<td width="100">
			<%=poll.get(i)%>(<%=df1.format(pyo)%>)</td>
			<td>개수
			<hr size="10" color="7FFD2" width="<%=400*per%>" align="left">
			</td>
		</tr>
		<%
	}
%>
		<tr>
			<td align="center" colspan="2">
			<input type="button" value="다시투표하기" onclick="location.href='PollRead.jsp'">
			</td>
		</tr>
	</table>
</body>
</html>