
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="com.tjoeun.MyCalendar.MyCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>만년 달력</title>


<link rel="icon" href="favicon.ico">

<style type="text/css">
	tr{height: 70px;
	
	text-align: right;
	vertical-align: top;
	}
	th {
	font-size : 20pt;
	width:100px;
	text-align: center;
	vertical-align: middle;
	}
	
	th#sun {
	color:red;
	}
	
	th#sat {
	color:blue;
	}
	th#next {
	font-size:10pt;
	}
	th#title {
	font-size: 25pt;
	font-family:D2Coding;
	font-weight: bold;
	color:purple;
	}

	td.sun {
	color:red;
	}
	
	td.sat {
	color:blue;
	}
	
	
</style>
</head>
<body>

	<%
	//달력메소드 테스트
	//   out.println(MyCalendar.isLeapYear(2023));
	//   out.println(MyCalendar.lastDay(2023,5));
	//   out.println(MyCalendar.totalDay(2023,5,1));
	//   out.println(MyCalendar.weekDay(2023,5,1));

	//컴퓨터의 년, 월을 얻어온다 

	//	Date date = new Date();
	//	int year = date.getYear() + 1900;
	//	int month = date.getMonth() + 1;

	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH) + 1;
	//	out.println(year + "년" + month + "월");
	
	try{
	year = Integer.parseInt(request.getParameter("year"));
	month = Integer.parseInt(request.getParameter("month"));
	
	if(month>=13) {
		year++;
		month=1;
	} else if(month <=0) {
		year--;
		month=12;
	}
	} catch (NumberFormatException e) {}
	
	
%>
	<table width="700" border="1" align="center" cellpadding="5"cellspacing="0">
		<tr>
		<th id="next">
			<a href="?year=<%=year%>&month=<%=month-1%>">이전달</a>
		</th>
			<th id="title" colspan="5">
				<%=year%>년 <%=month %>월
			</th>
					<th id="next">
			<a href="?year=<%=year%>&month=<%=month+1%>">다음달</a>
		</th>
		</tr>
		<tr>
			<th id="sun">일</th>
			<th>월</th>
			<th>화</th>
			<th>수</th>
			<th>목</th>
			<th>금</th>
			<th id="sat">토</th>
		</tr>
		<tr>
			<%
			
			for (int i=0; i<MyCalendar.weekDay(year, month, 1); i++) {
			out.println("<td>&nbsp;</td>");
			}
			
			for(int i=1;i<=MyCalendar.lastDay(year,month);i++) {
				if(MyCalendar.weekDay(year, month, i)==0){
				out.println("<td class='sun'>"+i+"</td>");
				} else if (MyCalendar.weekDay(year, month, i)==6){
					out.println("<td class='sat'>"+i+"</td>");
				}
				 else {out.println("<td>"+i+"</td>");
			}
				if (MyCalendar.weekDay(year, month, i)==6) {
					out.println("</tr><tr>");
				}
			}

	  //출력한 날짜가 토요일이면 줄을 바꿈 
%>
		</tr>

	</table>

</body>
</html>