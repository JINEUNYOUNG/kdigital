package com.tjoeun.interfaceTest;

class Point {
	int x, y;
	void move() {}
}

class Shape {
//	  final을 필드 선언시 앞에 붙여주면 그 필드는 프로그램에서 값을 변경 할 수 없다. => 상수
//	 상수는 다른 변수와 구문하기 위해 대문자로 쓴다.
//	 final을 메소드 선언 시 앞에 붙여주면 그 메소드는 override 시킬 수 없다.
//	 final을 클래스 선언시 앞에 붙여주면 그 클래스는 상속시켜 사용 할 수 없다. 
//	public static final double PI = 3.141592; //←정적 필드이자, 상수 (static<-자주쓰니까 만들어놓는것)
	public final double PI; //←정적 필드이자, 상수 (static<-자주쓰니까 만들어놓는것)
	public Shape() {
		PI= 3.141592;
	}


}

// 자바는 다중 상속을 지원하지 않기 때문에 아래와 같이 상속하면 error
// class Line extends Point, Shape {} >> error!!!!!!!!!!!!!


// ●Interface는 class의 특별한 형태로 무조건 상수(public static final)와 추상메소드(public abstract)로만
// 구성된다. 

interface Draw {
// 상수는 반드시 선언과 동시에 (객체가 생성될 때)초기화를 시켜야 한다. (기본초기화x)
//	public static final double PI;  => ERROR
	public static final double PI = 3.141592;     // => OK (static이 붙으면 바로 초기화시켜줘야함)
//	인터페이스는 무조건 상수만 가질 수 있음! 필드 선언 시 앞의 내용을 생략하면 자동으로 public static final 을 붙여준다.
	int LIMIT = 1000;									// public static final 안붙였는데도 상수임! 
//	public void rotate() {}  => {}이 있으면 추상메서드x => ERROR!
	public abstract void move2();   // => 추상메서드
	void erase();					// => 역시 추상메서드 (생략 시 public abstract 자동으로 붙임)
	
}

interface Graphic {
	void rotate();
	void resize();
	
}

//class Line extends Graphic {} 	※ 클래스는 인터페이스를 상속받을 수 없다. => ERROR!
//interface Graphics extends Point {} ※ 인터페이스는 클래스를 상속 받을 수 없다. => ERROR! 
//=> 클래스에서 인터페이스를 갖다쓸 수 있어야지 의미가 있지... 근데 어떻게 ? 
//▼ 인터페이스는 다중 상속을 허용한다!!!!!!!!!!!!!!
interface Graphics extends Draw, Graphic {	
// 아무런 내용을 가지지 않는 인터페이스를 표시(marker) 라고 부른다. 
}

// 클래스+클래스 : extends 예악어를 사용해서 "상속"시키고 사용. 
// 클래스+인터페이스 : implements 예악어를 사용해서 "구현"

// Q. Line 클래스는 Point 클래스를 상속받고 Draw, Graphic 인터페이스를 구현받아 만들자
//class Line extends Point implements Draw, Graphic {} => move가 중복되기 때문에 ERROR
 class Line extends Point implements Draw, Graphic{

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}}



public class interfaceTest {
	
	public static void main(String[] args) {
		
		System.out.println("Math.PI: " + Math.PI);
		
//		Math.PI = 1.234;     >> ERROR . 상수는 변경불가~! 
//		
//		System.out.println("1. static이라서 점찍어서 Shape.PI: "+Shape.PI);				

		//		Shape.PI = 12.34;   >> ERROR.
		
		Shape shape = new Shape();											
		
		System.out.println("2. 클래스 객체를 만들어서 Shape.PI: "+shape.PI);
		
		System.out.println("3. 인터페이스에서 " + Draw.PI);
		System.out.println("Draw.LIMIT"+Draw.LIMIT);
	}

}
