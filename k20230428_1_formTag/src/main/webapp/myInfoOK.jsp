<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

OK입니다

<%

// 주석입니다. request.getParameter() 메소드로 이전페이지에서 submit 버튼이 클릭되면 넘어오는 데이터를 받는다. 
// 무조건 문자열 형태로 넘어온다. String 
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
out.println(name + "님 안녕하세요<br>");
String id = request.getParameter("id");
out.println(name + "님의 id는 "+id+"입니다.<br>");
String password = request.getParameter("password");
out.println(name + "님의 password는 "+password+"입니다.<br>");
try {
	int age = Integer.parseInt(request.getParameter("age"));
	out.println(name + "님은 올해"+age+"살 입니다.<br>"); //20
	out.println(name + "님은 내년"+(age+1)+"살 입니다.<br>"); 
} catch (NumberFormatException e) {
	out.println("잘못된 나이가 입력되었습니다.<br>");
	out.println("<script>");
	out.println("alert('잘못된 나이가 입력되었습니다.')");
	out.println("</script>");

}
String gender = request.getParameter("gender");
out.println(name + "님의 성별은 "+ gender +"입니다.<br>");

String[] hobbies = request.getParameterValues("hobbies");
out.println(name + "님의 취미는 ");
try {
	for (int i=0;i<hobbies.length;i++) {
	out.println(hobbies[i]+" ");
	}
	out.println("입니다<br>");
} catch (NullPointerException e) {
	out.println(" 없습니다.<br>");
	
}
	
String trip = request.getParameter("trip");
out.println(name + "님은 "+trip+"에 가고싶어합니다.<br>");
	
String[] travel = request.getParameterValues("travel");
out.println(name + "님이 가본 국가는 ");
	for (int i=0;i<travel.length;i++) {
	out.println(travel[i]+" ");
	}
	out.println("입니다.<br>");
} catch (NullPointerException e) {
	out.println(" 없습니다.<br>");

	String content = request.getParameter("content");
	/* 태그사용 가능, 줄바꿈 불가능 */
	out.println(content + "<br>");
	
	/* 태그사용 불가능, 줄바꿈 불가능 */
	out.println(content.replace("<", "&lt;").replace(">", "&gt;") + "<br>");

	/* 태그사용 가능, 줄바꿈 가능 */
	out.println(content.replace("\r\n", "<br>") + "<br>");
	
	/* 태그사용 가능, 줄바꿈 불가능 */
	out.println(content.replace("<", "&lt;").replace(">", "&gt;").replace("\r\n", "<br>") + "<br>");
	
	
%>

</body>
</html>