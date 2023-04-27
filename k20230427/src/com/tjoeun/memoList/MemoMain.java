package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMain {

	public static void main(String[] args) {

//		MemoVO memo1 = new MemoVO("홍길동", "1111", "1등 입니다.");
//		System.out.println(memo1);
//		MemoVO memo2 = new MemoVO("임꺽정", "2222", "2등 입니다.");
//		System.out.println(memo2);
//		MemoVO memo3 = new MemoVO("장길산", "3333", "3등 입니다.");
//		System.out.println(memo3);

		Scanner scanner = new Scanner(System.in);
		int menu = 0;

		while (menu != 5) {
			while (true) {
				System.out.println("============================================");
				System.out.println(" 1.입력  2.목록보기  3.수정  4.삭제  5.종료 ");
				System.out.println("============================================");
				System.out.print("원하는 메뉴를 입력하세요: ");
				menu = scanner.nextInt();
				if (menu >= 1 && menu <= 5) {
					break;
				}
				System.out.println("메뉴는 1 ~ 5 사이로 입력해야 합니다.");
			}
//		 	여기까지 왔다면 menu에는 1 ~ 5 사이의 정수가 입력되었다는 의미이다.
			switch (menu) {
			case 1:
				MemoService.insert();
				break;
			case 2:
				MemoService.select();
				break;
			case 3:
				MemoService.update();
				break;
			case 4:
				MemoService.delete();
				break;
			}
		}
		System.out.println("프로그램을 종료합니다. 바이바이~~~~~");

	}

}