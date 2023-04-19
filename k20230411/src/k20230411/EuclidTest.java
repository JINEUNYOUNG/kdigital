package k20230411;

import java.util.Scanner;

public class EuclidTest {

	public static void main(String[] args) {
// 최대공약수 최소공배수를 계산할 숫자 2개를 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int big, small;
		if (a>b) {
			big = a;
			small = b;
			
		} else {
			big = b;
			small = a;
			
		}
//  	입력받은 숫자의 크기에 따라서 나눗셈을 실행하는 횟수가 다르므로 무한루프를 돌려서 처리	
		
		while(true) {
			int r = big % small ; 
			if (r==0) {
				break;
			}
			big = small;
			small = r;
		}
		
// 		최대공약수와 최소공배수를 출력한다.
		System.out.printf("최대공약수: %d, 최소공배수:%d\n", small, a*b/small);
		
		

	}
}
