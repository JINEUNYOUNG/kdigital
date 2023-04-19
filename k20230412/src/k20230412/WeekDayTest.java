package k20230412;

import java.util.Scanner;

public class WeekDayTest {

	public static void main(String[] args) {
		
//		요일을 계산할 년, 월, 일을 입력받기
//		서기 1년 1월 1일 부터 요일을 계산하기 위해 입력한 날짜까지 지난 날짜수를 계산한다.
//		요일을 출력한다.
//		계산된 날짜를 7로 나눈 나머지가 0이면 일요일, 1이면 월요일...5면 금요일, 6이면 토요일이다.
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 계산할 년, 월, 일?.: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();

//		int sum = (year -1) * 365;
//		for (int i=1; i<year; i++) {
//			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) { //연도를 4로 나눠 딱 떨어지고 100에 떨어지지않거나 400에 나눠떨어지면 윤년
//				sum++;
//			}
//		} 
		
		int sum = (year - 1) * 365 + (year-1) / 4 - (year-1) / 100 + (year-1) / 400;
		
//		for (int i=1; i<month; i++) {
//			switch (i) {
//				case 2: //2월일때 
//					sum += year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ? 29 : 28; //만족하면 29를 더하고 아니면 28을 더해줄거임
//					break;			
//				case 4: case 6: case 9: case 11: //짧은달
//					sum += 30;
//				default: //긴달
//					sum += 31;
//					break;
//					
//			}			
//		}
		
//		각 달의 마지막 날짜를 기억하는 배열을 선언한다.
		int[] m = {31,0,31,30,31,30,31,31,30,31,30,31};
//		2월의 마지막 날짜를 확정한다.
		m[1] = year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ? 29 : 28;
		for (int i=1; i<month; i++) {
			sum += m[i-1];
		}
		
//		전달 까지 지난 날짜에 일을 더한다.
		sum += day;
		

		System.out.println(sum);	
		System.out.println(sum % 7);		
			
//		요일을 출력한다.
		switch (sum % 7) {
			case 0 :
				System.out.println("일요일");
				break;
			case 1 :
				System.out.println("월요일");
				break;
			case 2 :
				System.out.println("화요일");
				break;
			case 3 :
				System.out.println("수요일");
				break;
			case 4 :
				System.out.println("목요일");
				break;
			case 5 :
				System.out.println("금요일");
				break;
			case 6 :
				System.out.println("토요일");
				break;
			
		}
		String[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.println(week[sum % 7]);
				
	}
	
}

