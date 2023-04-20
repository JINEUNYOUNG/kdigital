package com.tjoeun.memoList;

//	자식(하위, 서브, 파생) 클래스
//	child 클래스는 parent 클래스를 상속받아 만든다.
//	상속이란 부모 클래스에서 정의한 모든 필드와 메소드를 자식 클래스가 물려받는것을 말한다.
//  자식 클래스에서 별도의 선언없이 부모 클래스의 모든 기능을 사용할 수 있다. 
//	public class 자식 클래스이름 extends 부모클래스이름



public class Child extends Parent {
	
	
//	child클래스는 parent 클래스의 모든 필드와 메소드를 사용할 수 있다.
//	child 클래스에서 필요한 기능을 정의한다.
	
//	override로 다시 만들어서 
	
	private int age;
	private String nickname;

	public Child() {
		super();  //생략가능            //◀ 부모 클래스의 생성자를 실행하세욤(자동으로생성)
		System.out.println("자식클래스의 생성자 실행"); //this() 현재 클래스의 생성자를 실행
	}
//	this()와 super()는 반드시 생성자의 첫문장으로! 쓰셔야합니도.. 가장먼저 실행됨!
//	기본생성자가 없이 상속을 시키게 되면 에러가 발생한다. 
//	★ 클래스만들땐 기본생성자를 무조건 만들자! (부모가될지도모르잔니)
//	이클립스가 지원하는 생성자 자동완성기능을 사용할 때 현재 클래스에 물리적으로 정의하지
//	않은 필드(상속받은 필드)는 생성자를 만드는 대화상자에 표시되지 않는다.

	
	
	public Child(String name, boolean gender, int age, String nickname) {
		super(name, gender);
		
//		this.name = name;					//Q.Pravate 권한이라 오류나는 경우, 초기화하는방법
//		this.gender = gender ; 				//①부모클래스의 생성자를 호출해서 초기화함☆☆
		this.age = age;
		this.nickname = nickname;
	}	
	/*
	public Child(int age, String nickname, String name, boolean gender) {
		super(); 						 	//②setter는 메소드이므로(public) 실행 할 수 있다☆☆
		setName(name);
		setGender(gender);
		this.age = age;
		this.nickname = nickname;
		*/									
	/*
	public Child(int age, String nickname, String name, boolean gender) {
		super();							//③Protected 접근권한으로 바꾼다. 자식은 보인다.
		this.name = name;					
		this.gender = gender ; 			
		this.age = age;
		this.nickname = nickname;	
		
		*/
	
	@Override     	//override(재정의) 부모클래스로부터 상속받은 메소드의 기능을 무시하고 다시 만들어 사용한다.
	public String toString() {
//		return getName() + "(" + (isGender() ?"남":"여") + ") - " +age+","+nickname; ① get으로
				
//	자식클래스에서 부모클래스에서 상속받은 메소드의 앞, 뒤에 기능을 추가 할 수 있다.
//	② 부모클래스의 메소드를 실행하려면 부모클래스를 의미하는 super 뒤에 . 을 찍고 실행할 메소드 이름을 쓰면된다.
//		return super.toString()+" - " +age+","+nickname;
//		▲부모에서 name, gender를 가쟈왔음.
		
//	③ 부모클래스에서 상속받은 필드의 접근권한이 protected 일때는 getter를 사용하지 않아도 ㅇㅋ 
		return name + "(" + (gender? "남":"여") + ") - " +age+","+nickname;
		
		
	}
}