<%@page import="com.tjoeun.onLinePoll.PollWrite"%>
<%@page import="com.tjoeun.onLinePoll.PollRead"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- pollRead에서 넘어오는 투표항목을 받아 득표수를 증가시켜 텍스트파일에 저장한다 -->

	<%

//post방식으로 데이터가 넘어올때 한글 깨짐을 방지해야함
	request.setCharacterEncoding("UTF-8");
	String temp = request.getParameter("poll");
//out.println(temp);
//에러체크
//1. null또는 공백이 아닌가? 제대로 넘어왔나 => 반드시 null검사부터!
	if (temp != null && temp.trim().length() != 0) {
//2. 넘어온 데이터가 숫자인가?
		try{ 
			int result = Integer.parseInt(temp);
			
			String filepath = application.getRealPath("/") + "poll.txt";
			ArrayList<String> poll = PollRead.pollread(filepath);
			int itemCount = (poll.size() -1)/2;
			
			if (result >= 1 && result <= itemCount) {
				int index = result + itemCount;
				result = Integer.parseInt(poll.get(index))+1;
				poll.set(index,result+"");
				out.println(poll);
				
				PollWrite.pollwrite(filepath, poll);
				response.sendRedirect("pollResult.jsp");
				
			}
	
				//투표한 항목의 득표수를 1 증가시켜 텍스트 파일에 저장한다. 
				//1. INDEX:득표 수를 1증가시킬 위치를 계산한다. 
				//2. 1증가시킨다. 
				//3. 1증가된 득표수를 다시 poll(arraylist)로 반환한다 
				//4. arraylist에 저장된 데이터를텍스트 파일에 저장하는 메소드를 실행한다. 
				//5. 투표 결과보기 페이지로 넘겨준다. 
				
			 else {
				out.println("<script>");
				out.println("alert('투표데이터가 정상범위가 아닙니다.')");
				out.println("location.href='PollRead.jsp'");
				out.println("</script>");
		}
//오류메시지 출력 하고 pollread.jsp로 돌려보낸다.
		} catch (NumberFormatException e) {
			out.println("<script>");
			out.println("alert('투표데이터가 숫자가아닙니다.')");
			out.println("location.href='PollRead.jsp'");
			out.println("</script>");
		}
	} else {   out.println("<script>");
	   out.println("alert('투표하세요')");
	   out.println("location.href='pollRead.jsp'");
	   out.println("</script>");
}

//		response.sendRedirect("PollRead.jsp");
//		왜 위의 jsp코드를 치면 경고창이 막히는가? 
//	   	한 jsp파일에 서버용스크립트(jsp)와 클라이언트용스크립트(javascript)를 모두 사용한 경우 코딩 순서와는 무관하게
//		서버용스크립트가 먼저 실행되고 난 후 클라이언트용 스크립트가 실행된다.
	





%>

</body>
</html>