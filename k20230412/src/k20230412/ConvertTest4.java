package k20230412;

import java.util.Scanner;

public class ConvertTest4 {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("16진수로 변환할 10진수를 입력하세요.: ");
			int dec = scanner.nextInt();
			System.out.print("변환할 진법을 입력하세요.: ");
			int n = scanner.nextInt();
			int number = dec;
			int[] bin = new int[8];
			int index = 0;
			
			while (true) {
				int m = dec / n;
				int r = dec % n;
				bin[index++] = r;
				if (m==0) {
					break;
				}
				dec=m;  
			}
			
			
			char[] h = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
			System.out.print(number + "를 16진수로 변한하면 ");
			for (int i=index - 1; i>=0; i--) {
				System.out.print(h[bin[i]]);
			}
			System.out.print("입니다.");
		}
	}