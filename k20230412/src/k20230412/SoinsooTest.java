package k20230412;

import java.util.Scanner;

public class SoinsooTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("소인수 분해할 숫자를 입력하세요.");
			int n = scanner.nextInt();
			if(n < 2) {
				break;
			}
//			 소인수분해 20개를 저장하게
			
			int[] s = new int[20];
			int number = n;
			int c = 0;
//			나눠지는게 본인밖에 없으면 소인수분해 c = s배열의 인덱스, 소인수의 갯수
			
			while (true) {
				int k = 2; //소인수분해 시작하는 숫자. 2부터
				
				while (true) {
					int r = n % k; //n에서 2를 나눈 나머지가 r
					if (r==0) {    //나머지가 없으면 
						break;
					}
					k++;
				}
//			 	s배열에 소인수분해를 넣어준다.
				s[c++] = k;
//				다음 소인수를 얻기위해 n에 n을 k로 나눈 몫을 넣어준다.
				n /= k;
				if (n == 1) {
					break;
				}
					
//				n이 소수면 소수라고 출력하고 아니면 분해된 소인수를 출력한다.	
			}
				
			 if (c==1) { //소수니?
				 System.out.println("소수입니다.");
			 } else {    //소인수분해됀걸 보여줌
				 System.out.print(number + "=");
				 for (int y=0; y<c-1; y++) {
					 System.out.print(s[y]+"*");
				 }
				 System.out.println(s[c-1]);
			 }
		}
			System.out.print("프로그램 종료");
		
	}	
}		