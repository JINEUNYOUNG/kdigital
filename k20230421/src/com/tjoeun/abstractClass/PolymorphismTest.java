package com.tjoeun.abstractClass;

import java.util.Scanner;

//다형성(Polymorphism)이란 같은 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 말한다.
//다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모를 가져야한다.
//부모와 자식 클래스에 같은 이름의 메소드가 있어야 하며 자식클래스에서 부모클래스의 메소드를 반드시 오버라이드시켜서 사용해야한다.
abstract class Shape {
	
	int x, y;
	void move() {}  //일반 메소드
	abstract void draw();  //추상메소드
	
}

// Shape 클래스를 상속받아 Point 클래스를 만든다
// Shape 클래스를 상속받아 Line클래스를 만든다
// Shape 클래스를 상속받아 Circle 클래스를 만든다
// Shape 클래스를 상속받아 Rectangle 클래스를 만든다
// Shape 클래스를 상속받아 Triangle 클래스를 만든다

//	 ▼부모클래스가 같은 5개의 자식클래스
class Point extends Shape {
	@Override
	void draw() {
		System.out.println("점을찍는다.");
	}
}
class Line extends Shape {
	@Override
	void draw() {
		System.out.println("선을 긋는다.");
	}
}
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("원을그린다.");
	}
}
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}
class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("세모를 그린다.");		
	}
}


public class PolymorphismTest {
	public static void main(String[] args) {
//		Shape shape = new Point();
//		shape.draw();
//		shape = new Line(); 		
//		shape.draw();							//  	▶실행은 똑같이 했는데 overriding되었기 때문에 다른 결과
//		shape = new Circle();				//    ★ 객체 지향의 꽃! 다형성!
//		shape.draw();	
//		shape = new Rectangle();
//		shape.draw();
//		shape = new Triangle();
//		shape.draw();							//		이렇게 하지않고 아래처럼 배열을 만들어 사용 ↓	
		
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rectangle(), new Triangle()};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 작업을 선택하세요.");
		int menu = scanner.nextInt();
		shapes[menu-1].draw();
		
		
	}
	
	
	

}
