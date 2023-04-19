package k20230412;

import java.util.Date;
import java.util.Scanner;

public class SocialSecurityNumber2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호를쓰세요");
		String jumin = scanner.nextLine().trim();
		
		System.out.println(jumin.substring(0,2));
		System.out.println(jumin.charAt(0));
		System.out.println(jumin.charAt(1));
		int year = (jumin.charAt(0) - '0' ) *10 + (jumin.charAt(1) - 48)	; 
		System.out.println(year); //숫자로변환하려면 문자 0을 빼주던지 48을 빼주던지
		
		year = Integer.parseInt(jumin.substring(0,2)); 
		//Integer.parseInt() 인수로 지정한 문자열을 정수로.
		//Double.parseDouble() 인수로 지정한 문자열을 정수로.
		//Boolean.parseBoolean() 인수로 지정한 문자열을 정수로.
		
		System.out.println(year);
		System.out.println(Integer.parseInt('1'+""));  //문자1을 숫자1로
		
//		if (jumin.charAt(6) <= '2') {
//			year += 1900;
//		
//		} else {
//			year += 2000;
//			
//		}

		year += jumin.charAt(6) <= '2' ? 1900 : 2000; // 삼항연산자 
		System.out.println(year);
		
//		컴퓨터의 날짜데이터를 얻어와서 년도만 꺼내기
		Date date = new Date();
		System.out.println(date.getYear()+1900);  //1900더하는거 잊지말기 //현재년도
		
		
	}
}
