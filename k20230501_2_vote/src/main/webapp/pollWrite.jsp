<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	request.setCharacterEncoding("UTF-8");
	String temp = request.getParameter("poll");
//	out.println(temp);

	if (temp != null && temp.length() != 0) {
		
	} else {
		out.println("<script>");
		out.println("alert('투표해주세ㅇ이...')");
		out.println("location.href='pollRead.jsp'");
		out.println("</script>");
		
//		response.sendRedirect("pollRead.jsp"); //서버용 클라이언트 우선합니다~ 
	}
%>

</body>
</html>