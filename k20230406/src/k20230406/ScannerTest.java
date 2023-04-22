package k20230406;

import java.util.Scanner;

public class ScannerTest {

	
//	변수: 프로그램에서 처리할 데이터(상수)를 기억하는 기억장소를 말한다.
//	사용하기 전에 반드시 초기화해야한다.
//	=는 우측을 좌측에 넣겠단 소리 ==같다 
	
	public static void main(String[] args) {
		
		int num;
		num = 100;
		System.out.println(num);
		
		
//	클래스이름 객체이름 = new 생성자();
	Scanner scanner = new Scanner(System.in);
	String addr  = scanner.nextLine();
	String name = scanner.nextLine();
	int age = scanner.nextInt();
	System.out.println(name+addr+"에 삽니다.");
	System.out.println(name+"내년에"+(age+1)+"살인디");
	
//	next() 한 단어 입력 띄워쓰기 있으면 그전까지 입력
//	nextLine() 한 줄 입력 문자열.
//	스캐너로 입력된 내용이 바로 변수에 저장되는 것이 아니고 
//	임시 기억장소에 저장 된 후 읽어들이는 메소드가 실행될 떄 변수에 들어간다 
	
	

//	 scanner.nextLine() 으로 키보드 버퍼를 없애는 것 잊지 않기...
//	 nextLine은 엔터키를 읽어들이기 때문에
	}
}
