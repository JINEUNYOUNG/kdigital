package k20230411;

import java.util.Scanner;

public class EuclidTest2 {

	public static void main(String[] args) {
// 최대공약수 최소공배수를 계산할 숫자 2개를 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int r = 1;
		
		int big, small;
		if (a>b) {
			big = a;
			small = b;
			
		} else {
			big = b;
			small = a;
			
		}
//  	입력받은 숫자의 크기에 따라서 나눗셈을 실행하는 횟수가 다르므로 무한루프를 돌려서 처리	
		
		while(r>0) {
			r = big % small;
			big = small;
			small = r;
			
		}
		
		int l = a * b / big;
		System.out.printf("최대공약수 %d, 최소공배수 %d",big,l);
		
		
		

	}
}
