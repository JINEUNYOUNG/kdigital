package k20230412;

import java.util.Scanner;

public class CalendarTest {
	
		
//	▼ 년을 받아 윤년 평년을 판단하는 메소드 isLeapYear
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;   
	}
	
//	▼ 년, 월을 받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year, int month) {
		int[] m =  {31,0,31,30,31,30,31,31,30,31,30,31};
//	2월은 가변적이니 확정지어준다. (맞으면 29 아니면 28)
		m[1] = isLeapYear(year)? 29 : 28;
		return m[month-1];
		
	}
//	▼ 년, 월, 일을 받아 1년 1월 1일부터 지난 날짜의 합계를 리턴하는 메소드 
	public static int totalDay(int year, int month, int day) {
		int sum = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;  //전년까지의 일자
		for (int i=1; i<month; i++) {									// 전달까지의 일자. (1월일시 month-1은 오류 나므로 i로 돌려줌)
			sum += lastDay(year, i);
		}
		
		return sum+day;
		
	}
	
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) %7;
	}
	
		public static void main(String[] args) {
			
//		static메소드는  static에만 접근할 수 있다
			
//			System.out.println(isLeapYear(2023));
//			System.out.println(lastDay(2023,2));
//			System.out.println(totalDay(2023,4,13)%7);
//			System.out.println(weekDay(2023,4,13));
			
			
//	▼ 달력을 출력할 년, 월을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("달력을 출력할 년, 월을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		System.out.println("========================");
		System.out.printf("         %4d년%2d월\n", year , month);
		System.out.println("========================");
		System.out.println(" 일 월 화 수 목 금 토 ");
		System.out.println("========================");
		
		for (int i=1; i<=weekDay(year, month, 1); i++) {
			System.out.print("    ");
		}										//1월의 요일만큼 4번 띄워쓰기해줌
		
		for (int i=1; i<=lastDay(year, month);i++) {
			System.out.printf(" %2d ", i);
			if (weekDay(year, month, i)==6 && i != lastDay(year,month)) {   //i가 토요일(6)이고 그달의 마지막 날짜가 아니면 줄바꿈
				System.out.println();
			}
		}
			
	}

}
