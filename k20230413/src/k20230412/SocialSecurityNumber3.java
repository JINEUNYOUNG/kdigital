package k20230412;

import java.util.Scanner;

public class SocialSecurityNumber3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호를쓰세요");
		String jumin = scanner.nextLine().trim();
		

//		1. 각자리 숫자에 가중치를 곱한 값의 합계를 계산
		
		String check = "234567892345"; //가중치
		int sum = 0;
		for (int i=0; i<12; i++) {
			sum += Integer.parseInt(jumin.charAt(i)+"") * Integer.parseInt(check.charAt(i)+"");
		} 
		System.out.println(sum);
		
//		2. 곱한 값의 합계를 11로 나눈 나머지를 계산해서 11에서 뺀다.
//		3. 11에서 뺀 값이 2자리 숫자면 10의자리는 버리고 1의자리를 취한다.
		
		int result = (11 - sum % 11) %10;
		

//		4. 결과가 마지막자리와 같으면 정상.
		
		if (result == jumin.charAt(12) - 48) {
			System.out.println("정상");
		}	else {
			System.out.println("오류");
		}
		
		
	}
}
