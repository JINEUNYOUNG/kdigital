package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMain {

	
	public static void main(String[] args) {
		
//		MemoVO memo1 = new MemoVO("조승연","0825","1등입니다.");
//		MemoVO memo2 = new MemoVO("조승연","0825","1등입니다.");
//		MemoVO memo3 = new MemoVO("조승연","0825","1등입니다.");
//		MemoVO memo4 = new MemoVO("조승연","0825","1등입니다.");
//		
//		System.out.println(memo1);
//		System.out.println(memo2);
//		System.out.println(memo3);
//		System.out.println(memo4);
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
		
		while (menu != 5) {  //5가 아닌 동안만 돌린다.
		
		
			while (true) {
			System.out.println("======================================");
			System.out.println("1. 입력 2. 목록보기 3. 수정 4. 삭제 5. 종료");
			System.out.println("======================================");
			System.out.println("원하는 메뉴를 입력하세요:");
			menu = scanner.nextInt();
			if (menu >= 1 && menu <= 5) {
				break;
			}
			System.out.println("메뉴는 1~5 사이로 입력하세요.");
	
			}
			
	//		여기를 지나왔으면 menu에는 1~5사이의 정수가 입력되었다는 의미.
			
			switch(menu) {
				case 1:
					insert(); 
	//				데이터를 저장하는 메소드를 실행 한다.
					break;
				case 2: 
	//				데이터 목록을 출력하는 메소드를 실행 한다.
					break;
				case 3: 
	//				데이터를 수정하는 메소드를 실행 한다.
					break;
				case 4: 
	//				데이터를 삭제하는 메소드를 실행 한다.
					break;
				case 5: 
	//				데이터를 종료하는 메소드를 실행 한다.
					break;
			}
				
			
		}
		System.out.println("!프로그램을 종료합니다!");
		
	}
	
//	키보드로 이름, 비밀번호, 메모를 입력받아 memovo 클래스 객체에 저장하고 arraylist에 저장하는 메소드를 호출하는 메소드
	private static void insert() {
	
}
	
}