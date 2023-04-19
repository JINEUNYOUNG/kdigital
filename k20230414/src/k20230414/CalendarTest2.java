package k20230414;

import java.util.Date;
import java.util.Scanner;

public class CalendarTest2 {
	
	
	public static void main(String[] args) {
		
//	MyCalendar calendar = new MyCalendar();
//	System.out.println(calendar.isLeapYear(2023));
	System.out.println(MyCalendar.isLeapYear(2023));  //★★★★static은 new없이 바로 점찍으면 불러올수있다.
	
	
//▼ 달력을 출력할 년, 월을 입력받는다.
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("이번달(1), 특정달(2): ");
	int confirm = scanner.nextInt();
		
	int year, month;
	if (confirm == 1) {
		Date date = new Date();
		year = date.getYear()+1900;
		month = date.getMonth()+1;
		
	} else {
	
	System.out.println("달력을 출력할 년, 월을 입력하세요: ");
		year = scanner.nextInt();
		month = scanner.nextInt();
	}
	
	System.out.println("========================");
	System.out.printf("         %4d년%2d월\n", year , month);
	System.out.println("========================");
	System.out.println(" 일 월 화 수 목 금 토 ");
	System.out.println("========================");
	
	for (int i=1; i<=MyCalendar.weekDay(year, month, 1); i++) {
		System.out.print("    ");
	}										//1월의 요일만큼 4번 띄워쓰기해줌
	
	for (int i=1; i<=MyCalendar.lastDay(year, month);i++) {
		System.out.printf(" %2d", i);
		if (MyCalendar.weekDay(year, month, i)==6 && i != MyCalendar.lastDay(year,month)) {   //i가 토요일(6)이고 그달의 마지막 날짜가 아니면 줄바꿈
			System.out.println();
		}
	}
		
	}
}

		
			
	
