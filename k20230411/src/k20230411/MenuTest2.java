package k20230411;

import java.util.Scanner;

public class MenuTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int menu;
		
		while (true) { //무한루프를 빠져나갈수있는 조건과 break를 이용할 것.
		do {
			System.out.println("-------------------------------------------");
			System.out.println(" 1. 입력 2. 목록보기 3. 수정 4. 삭제 5. 종료");
			System.out.println("-------------------------------------------");
			System.out.println("원하는 메뉴를 입력하세요: ");
			menu = scanner.nextInt();
	
		} while (menu < 1 && menu > 5);
		switch (menu) {
			case 1:
				System.out.println("입력");
				break;
			case 2:
				System.out.println("목록보기");
				break;
			case 3:
				System.out.println("수정");
				break;
			case 4:
				System.out.println("삭제");
				break;
				/*
			case 5:	
				System.out.println("종료합니다.");
				System.exit(0); //프로그램강제종료
				break;
				*/
		}
		if (menu ==5) {
			break;
		}
		}
		System.out.println("종료합니다.");
	}
}