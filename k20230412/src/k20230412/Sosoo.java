package k20230412;

import java.util.Scanner;

public class Sosoo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인가 판단할 숫자를 입력하세요: ");
		int n = scanner.nextInt();

		// 모든 수는 1로 나눠 떨어지기 때문에 2부터 떨어질 때 까지 나눠본다. 
		int i;
		for (i=2; i<=n; i++) { //n보다 작은 모든 정수를 대상으로 
			if (n%i ==0) {  //2부터 나눠봤을때 나머지가 0이다. 
				break;      //소수인가 판단하려고 탈출한다. 
			}
		}
		
		
		//소수인가 판단한다.
		
		if (n == i) {
			System.out.print(n+"은(는) 소수입니다.");
			
		} else {
			System.out.println(n+"은(는) 소수가 아닙니다. ");
			
		}
	}
	
}
