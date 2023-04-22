package k20230406;

import java.util.Scanner;

public class ScannerTest2 {
	
 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("continue? y/n");
//	 아래가 오류인 이유는 next는 str이기 때문입ㄴ
//	 char confirm = scanner.next();
//	 System.out.println(confirm);
	 char confirm = scanner.next().charAt(0);
//	 next()의 결과 값에서 charAt(0) 즉, 가장 앞의 문자를 읽어오겠단소리임.
	 System.out.println(confirm);
	 
	 
	 
}
	
}
