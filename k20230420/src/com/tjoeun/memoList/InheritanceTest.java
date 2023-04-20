package com.tjoeun.memoList;

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		System.out.println(parent);
		Parent parent2 = new Parent("홍길동",true);
		System.out.println(parent2);
		System.out.println("=================================");

		Child child = new Child();
		System.out.println(child);  //child에서 아무것도 안만들어도 parent를 가져다씀
		Child child2 = new Child("성춘향",false,16,"공주");
		System.out.println(child2);  
		//parent클래스에서 받은 toString을 쓰고 있어서 이름, 성별 만 나옴
		//더 집어넣을거임! > override
	}
	
	

}
