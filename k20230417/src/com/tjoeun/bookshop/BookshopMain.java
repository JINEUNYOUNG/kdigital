package com.tjoeun.bookshop;

import java.util.Date;

public class BookshopMain {

	public static void main(String[] args) {
		
		BookVO vo = new BookVO(); //메서드이름=클래스이름 => 생성자 자바가 자동으로 만들어준 기본 생성자
		System.out.println(vo);  //com.tjoeun.bookshop.BookVO@6f2b958e (자바가 객체를 구분해주는 해시코드 주소)
		System.out.println(vo.toString()); //클래스로 만든 객체를 출력하면 자동으로 알아서 toString을 붙여주는것. 
		
		
//		Date date = new Date(2020,05,13);  // 한번쓰고 마는거면 익명으로 집어넣으면된다. NEW 
		
		
		BookVO book1 = new BookVO("java", "홍길동", "더조은", new Date(2020,05,13), 35000);
		System.out.println(book1);
	
		System.out.println(book1.getTitle());
	}
	
}
