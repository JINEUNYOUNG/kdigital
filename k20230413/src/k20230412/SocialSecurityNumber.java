package k20230412;

import java.util.Scanner;

public class SocialSecurityNumber {

	public static void main(String[] args) {
		
//		1. 각자리 숫자에 가중치를 곱한 값의 합계를 계산
//		2. 곱한 값의 합계를 11로 나눈 나머지를 계산해서 11에서 뺀다.
//		3. 11에서 뺀 값이 2자리 숫자면 10의자리는 버리고 1의자리를 취한다.
//		4. 결과가 마지막자리와 같으면 정상.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호를쓰세요");
		String jumin = scanner.nextLine().trim();
		System.out.println(jumin.charAt(6));
		System.out.println((int)jumin.charAt(6)); //결과값은 아스키코드로 나옴
		
		if (jumin.charAt(6) =='1' || jumin.charAt(6) == 3) {  //숫자와 문자는 아스키코드에서 다르다. 숫자1 문자1은 다르다. 
			System.out.println("남자");
			
		} else {
			System.out.println("여자");
		}
		
		
	}
}
