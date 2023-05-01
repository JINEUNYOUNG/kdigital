<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- HTML 주석입니다. Ctrl+Shift+/ 삭제는 \ -->
<%-- JSP 주석입니다. JSP요소는 HTML주석으로 주석 설정이 되지 않음  --%>
<%-- 
	<%@ ~ %> 디렉티브 : 대부분 자동 import와 같이 설정에 관련 된 정보를 적는다
	<%! ~ %> 선언부 : 프로그램에서 사용할 변수나 메소드를 정의한다 => java파일로 뽑아내서 사용 
	<%= ~ %> 표현식 : 변수에 저장된 결과나 연산 결과를 출력한다 => EL(${~})로 대체해서 사용
	<% ~ %> 스크립트릿 : 일반 JSP코드를 적는다 => JSTL로 대체해서 사용
--%>


<!DOCTYPE html>

<html>
<head>
<meta charset = "UTF-8">
<title>HI</title>
</head>
<body>
<!--
	HTML은 스페이스바 1칸, 엔터키는 줄변경X 
	2칸 이상 띄우려면 &nbsp; 이게 한 칸 <br> 이게 줄바꿈 
  -->
myInfo&nbsp;&nbsp;&nbsp;입<br><br><br>니다.

<% 
out.print("출력할 내용<br>");
out.print("출력할 내용<br>");
out.print(application.getRealPath("/"));
%>
<!-- 
현재 페이지에 입력한 데이터를 특정 페이지로 전송하려면 전송할 데이터를 입력하는 코드를 <form> ~ </form>사이에 작성
action 속성은 전송(type="submit")버튼이 클릭되면 form에 입력한 데이터를 가지고 넘어갈 jsp페이지 이름을 쓴다. 
아무것도 안쓰거나 "?"만 입력하면 현재 페이지를 의미함 
method 속성은 action페이지로 데이터가 전송될 때 정보가 url 창에 표시되는 여부를 지정한다.
기본값은 "get" : 전송되는 데이터가 url창에 표시됨
"post" 표시되지않음
-->

<form action = "myInfoOK.jsp" method="post">
<label>이름: <input type = "text" name="name"></label><br>
<label>아이디: <input type = "text" name="id"></label><br>
<label>비밀번호: <input type = "password" name="password"></label><br>
<label>나이: <input type = "text" name="age"></label><br>

<fieldset style="width: 120px;">
	<legend>성별</legend>
	<input type="radio"name = "gender"value="남자" >남자
	<input type="radio"name = "gender"value="여자"checked="checked">여자
</fieldset><br>

<fieldset style="width: 180px;">
	<legend>취미</legend>
<input type="checkbox" name = "hobbies"value="등산"checked="checked">등산
<input type="checkbox" name = "hobbies"value="바둑">바둑
<input type="checkbox" name = "hobbies"value="낚시"checked="checked">낚시
</fieldset><br>


<!-- 콤보상자 만들기 -->
<select name="trip" style="width: 200px; height:30px">
<option>괌</option>
<option selected="selected">말레이시아</option>
<option>대한민국</option>
<option>일본</option>
<option>코타키나발루</option>
<option>대만</option>
<option>하와이</option>

</select>

<!-- 목록상자 만들기 -->
<select name="travel" style="width: 200px" multiple="multiple" size="7">
<option>괌</option>
<option>말레이시아</option>
<option>대한민국</option>
<option>일본</option>
<option>코타키나발루</option>
<option>대만</option>
<option>하와이</option>

</select><br>

<textarea rows="10" cols="60" name="content" style="resize: none; ">여기다가 쓰면 들어갑니다.</textarea>

<input type = "submit" value = "정보보기"> 
<input type = "reset" value = "다시쓰기"> 
<input type = "button" value = "버튼1" onclick = "alert('꺄~~')"> 
<button>
버튼2
</button>
<button type = "submit">정보보기2</button>
<button type = "reset">다시쓰기2</button>
<button type = "button" onclick = "alert('오오!!!!')">버튼3</button>

</form>

</body>
</html>