package com.tjoeun.memoList;

import java.util.ArrayList;
import java.util.Scanner;

public class MemoService {

	public static void insert() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scanner.nextLine().trim();
		System.out.println("비밀번호: ");
		String password = scanner.nextLine().trim();
		System.out.println("메모: ");
		String memo = scanner.nextLine().trim();

		MemoVO vo = new MemoVO();
		vo.setName(name);
		vo.setPassword(password);
		vo.setMemo(memo);
//		System.out.println(vo);

		boolean result = MemoDAO.insert(vo);

		if (result) {
			System.out.println(vo.getName() + "저장완료");
		} else {
			System.out.println("저장실패");
		}

	}

// 메모목록을 idx의 내림차순으로 얻어오는 dao 클래스의 메소드(select)를 호출 
	public static void select() {

		ArrayList<MemoVO> list = MemoDAO.select();

		if (list.size() != 0) {
			for (MemoVO vo : list) {
				System.out.println(vo);
			}
		} else {
			System.out.println("저장된 데이터가 없습니다.");

		}

	}
	
//idx 를 받아 글 한 건을 가져오는 dao클래스의 메소드를 호출 
	public static void delete() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 글 번호: ");
		int idx = scanner.nextInt();
		scanner.nextLine();
		
		MemoVO original = MemoDAO.selectByIdx(idx);
		
		if (original != null) {
			System.out.println("삭제할 메모 확인하기\n"+original);
			System.out.println("삭제할 글 비밀번호: ");
			String password = scanner.nextLine().trim();
			if (password.equals(original.getPassword())) {
				System.out.println("삭제합니다.");
				MemoDAO.delete(idx);
				
			} else {
				System.out.println("비밀번호가 상이합니다.");
			}
			
			
		} else {
			System.out.println(idx+"번 메모는 존재하지 않습니다.");
		}
		
	}

	public static void update() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("수정할 글 번호: ");
		int idx = scanner.nextInt();
		scanner.nextLine();
		
		MemoVO original = MemoDAO.selectByIdx(idx);
		
		if (original != null) {
			System.out.println("수정할 메모 확인하기\n"+original);
			System.out.println("수정할 글 비밀번호: ");
			String password = scanner.nextLine().trim();
			if (password.equals(original.getPassword())) {
				System.out.println("수정할 메모를 기입하세요");
				String memo = scanner.nextLine().trim();
				
				MemoDAO.update(idx, memo);
				
			} else {
				System.out.println("비밀번호가 상이합니다.");
			}
			
			
		} else {
			System.out.println(idx+"번 메모는 존재하지 않습니다.");
		}
		
	}
		
	}


