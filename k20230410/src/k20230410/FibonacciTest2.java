package k20230410;


import java.util.Arrays;
import java.util.Scanner;

public class FibonacciTest2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치 수열의 합계를 계산할 함수를 입력하세요. ");
		int n = scanner.nextInt();
		
		int[] fibo = new int[n];   //피보배열을 만듬
		System.out.println(Arrays.toString(fibo));
		System.out.println("배열의 크기: "+fibo.length);
		
		fibo[0] = 1;
		fibo[1] = 1;
		int y = 2;
		
		for (int k=3; k<=n; k++) {
 		    fibo[k - 1] = fibo[k - 3] + fibo[k - 2];
 		    y += fibo[k - 1];
		
		}  

	    System.out.println(Arrays.toString(fibo));	
		
		System.out.println("피보나치 수열의 " +n + "번째 항 까지의 합계 : "+y);

		for (int i = 0 ; i < fibo.length ; i++) {
			if (i > 0) {
				System.out.print("+");
			}
			System.out.print(fibo[i]);  
			}
	}
}
