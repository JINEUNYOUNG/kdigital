package k20230411;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertTest3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("16진수로 변환할 10진수를 입력하세요: ");
		int dec = scanner.nextInt();
		int number = dec;
		
		int[] bin = new int[8]; // 결과를 기억할 배열을 선언. 0으로 초기화됨.
		int index = 0; //배열의 인덱스. 
		
		//입력되는 10진수의 크기에 따라 반복횟수가 달라지므로, 무한루프 사용. 
		
		while (true) {
			int m = dec / 16; //16로 나눈 몫
			int r = dec % 16;
			bin[index++] = r; //나머지를 배열에 넣어준다. 그리고 1증가된다. //index에는 값이 들어간 배열만 저장된다.
			
			if (m == 0) {
				break;
			}
			
			dec = m;
			
		}
		
		// 16진수의 각 자리 숫자를 기억하는 배열을 선언한다.
		char[] h = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		
		
		for (int i=index-1;i>=0;i--) {   //index를 이용해 값이 들어간 자리만 출력할 수 있다. 
			System.out.print(h[bin[i]]); //****** 값 바꿔치기 가넝 
		}
		System.out.println("입니다.");
		
		
	}
}
