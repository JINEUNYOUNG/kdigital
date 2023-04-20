
package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMain {

	private static MemoList memoList = new MemoList();

	public static void main(String[] args) {

//		▼ 메뉴창 띄우기 
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while (menu != 7) { // 5가 아닌 동안만 돌린다.

			while (true) {
				System.out.println("============================================================");
				System.out.println("1.입력 2.목록보기 3.수정 4.삭제 5.파일로 저장 6.파일에서 읽기 7.종료");
				System.out.println("============================================================");
				System.out.println("원하는 메뉴를 입력하세요:");
				menu = scanner.nextInt();
				if (menu >= 1 && menu <= 7) {
					break;
				}
				System.out.println("메뉴는 1~7 사이로 입력하세요.");
			}

//			▼ 번호에 따라서 메서드를 실행한다. 
			switch (menu) {
			case 1:
				insert();
				break;
			case 2:
				System.out.println(memoList);
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				fileWrite();
//					데이터를 파일로저장하는 메소드를 실행 한다.
				break;
			case 6:
				fileRead();
				break;
			case 7:
				break;
			}

		}
		System.out.println("!프로그램을 종료합니다!");
	}

//		▼키보드로 텍스트 파일 이름을 입력받아 MemoList 클래스의 memoList ArrayList에 저장된 데이터를
//		텍스트 파일로 저장하는 메소드를 실행하는 메소드 
	private static void fileWrite() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("저장할 텍스트 파일을 적으세요: ");
		String filename = scanner.nextLine().trim();

		memoList.writeMemo(filename);

	}

//		▼키보드로 텍스트 파일이름을 입력받아 MemoList클래스의 memoList ArrayList에 저장하는
//		메소드를 실행하는 메소드 
	private static void fileRead() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("내용을 가져올 텍스트 파일 이름을 적으세요: ");
		String filename = scanner.nextLine().trim();

		memoList.readMemo(filename);

	}

	private static void update() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("수정할 글 번호를 입력하세요.:");
		int idx = scanner.nextInt();

		MemoVO original = memoList.selectMemo(idx);

		if (original == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println("수정할 글이 맞습니까?");
			System.out.println(original);

			System.out.println("이 글의 비밀번호를 입력하세요.");
			scanner.nextLine(); // ★★★★★★★★★★★★★키보드 버퍼를 비워버림=읽어버림.
			String password = scanner.nextLine().trim(); // nextline는 엔터키를 인식해버림

//			수정하기 위해 입력한 비번 vs 수정한 글의 비번 비교

			if (password.equals(original.getPassword())) {
				System.out.println("수정할 메모를 입력하세요.");
				String memo = scanner.nextLine().trim();
				memoList.updateMemo(idx); // updateMemo라는 메소드를 실행해라.
				System.out.println(idx + "번 글 수정완료!!!");

			} else {
				System.out.println("!비밀번호 불일치!");
			}
		}

	}

//		Q.키보드로 삭제할 글 번호를 받아 1건을 얻어와 화면에 표시하고 비밀번호를 입력받아 
//		memoList라는 ArrayList에 저장된 글 1건을 삭제한다.
	private static void delete() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 글 번호를 입력하세요.:");
		int idx = scanner.nextInt();

//		memoList라는 ArrayList에 저장 된 글 1건을 얻어오는 메소드를 실행하고 얻어온 결과를 MemoVO 객체에 저장한다.

		MemoVO original = memoList.selectMemo(idx);

//		삭제할 글번호에 글이 존재하면 글을 확인하고 삭제하고 존재하면 존재하지않는다는 메시지.

		if (original == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println("삭제할 글이 맞습니까?");
			System.out.println(original);

			System.out.println("이 글의 비밀번호를 입력하세요.");
			scanner.nextLine(); // ★★★★★★★★★★★★★키보드 버퍼를 비워버림=읽어버림.
			String password = scanner.nextLine().trim(); // nextline는 엔터키를 인식해버림

			if (password.equals(original.getPassword())) {
				memoList.deleteMemo(idx);
				System.out.println("!삭제완료!");

			} else {
				System.out.println("!비밀번호 불일치!");
			}
		}
	}

//	Q. 키보드로 이름, 비밀번호, 메모를 입력받아 memoVO 클래스 객체에 저장하고 arrayList에 저장하는 메소드를 호출하는 메소드
	private static void insert() {

		Scanner scanner = new Scanner(System.in);
//	1. 키보드로 이름, 비밀번호, 메모를 입력받기
		System.out.println("게시판에 저장할 글 입력");
		System.out.print("이름:");
		String name = scanner.nextLine().trim(); // .trim() 쓸모없는 부분 지우기
		System.out.print("비밀번호:");
		String password = scanner.nextLine().trim();
		System.out.print("메모:");
		String memo = scanner.nextLine().trim();

//	2. MemoVO 클래스 객체에 입력받은 내용을 저장한다.
		MemoVO vo = new MemoVO(name, password, memo);
		System.out.println(vo);

//	3. MemoVO 클래스 객체를 MemoList 클래스의 ArrayList에 저장하는 메소드를 실행.
		memoList.addMemo(vo);
		System.out.println("저장완료!");
//		System.out.println(memoList);	

	}

}
