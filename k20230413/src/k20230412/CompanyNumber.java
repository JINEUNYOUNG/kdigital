package k20230412;

import java.util.Scanner;

public class CompanyNumber {

	public static void main(String[] args) {
	
		
//		1. 각자리 숫자에 가중치를 곱한 값의 합계를 계산 (137137135)
//		2. 8번째 자리까지는 곱한 결과에서 1의자리만 취해 합계를 구함
//		3. 합계에 9번째 자리는 곱한 결과에서 두자리를 취함 
//		4. 위의 합계에 마지막 자리를 더한 값이 10의 배수면 정상.

		Scanner scanner = new Scanner(System.in);
		System.out.println("사업자번호를쓰세요");
		String sa = scanner.nextLine().trim();
		

		
		String check = "137137135"; //가중치
		int sum = 0;
		
//		1. 각자리 숫자에 가중치를 곱한 값의 합계를 계산 (137137135)

//		2. 8번째 자리까지는 곱한 결과에서 1의자리만 취해 합계를 구함
		
		for (int i=0; i<9; i++) {
			sum += Integer.parseInt(sa.charAt(i)+"") * Integer.parseInt(check.charAt(i)+"") % 10;
		}
		
//		3. 합계에 9번째 자리는 곱한 결과에서 두자리를 취함 
		sum += Integer.parseInt(sa.charAt(8)+"") * Integer.parseInt(check.charAt(8)+"") / 10;
		System.out.println(sum);
		
//		4. 위의 합계에 마지막 자리를 더한 값이 10의 배수면 정상.
		
		sum+=sa.charAt(9) - 48;
		
		System.out.println(sum % 10 == 0 ? "정상" : "오류");
		
	}
}
