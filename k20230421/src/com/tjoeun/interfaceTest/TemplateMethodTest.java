package com.tjoeun.interfaceTest;

abstract class Car {  //◀클래스에 final을 붙이면 절대 상속안시킴! 이란 뜻... 
	
//	▼ final을 선언하면 값 변경이 안됨! 상수 
	final String NAME= "홍길동";
		
// ▼자식 클래스에서 다르게 구현(다형성)되어야 하는 부분은 추상메소드로 선언한다.
	public abstract void drive();
	public abstract void stop();
// ▼자식 클래스에서 공통적으로 실행 될 부분은 일반 메소드로 만든다. 
	public void startCar() {
		System.out.println("시동킴");
	}
	public void turnoffCar() {
		System.out.println("시동끔");
	}
	
//	템플릿 메소드?
//	추상 메소드나 일반 메소드를 사용해서 코드의 흐름(시나리오)을 정의하는 메소드. 프레임워크에서 사용하는 설계패턴
//	추상 메소드로 선언된 부모클래스에서 템플릿메소드를 활용하여 전체적인 흐름을 정의하고, 자식 클래스에서 
//	다르게 구현되어야 하는 부분은 추상메소드로 선언하여 override해서 씀
final	public void run() {		//템플릿메소드는 오버라이드 -> final
		startCar();
		drive();
		stop();
		turnoffCar();
	}
	
}

// AICar 클래스(자식클래스)는 car 클래스(부모클래스)를 상속받는다. 
class AICar extends Car {

	@Override
	public void drive() { 
		System.out.println("스스로 자율주행한다");
		System.out.println("스스로 방향을 변경함");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춘다");
	
	}
}

// ManualCar 클래스는 car 클래스를 상속받는다. 
class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 주행한다");
		System.out.println("사람이 방향을 변경한다");
	}

	@Override
	public void stop() {
		System.out.println("사람이 멈춘다");
	}
	
}

public class TemplateMethodTest {
	
	public static void main(String[] args) {
		
		Car manualCar = new ManualCar();
		manualCar.startCar();
		manualCar.drive();
		manualCar.stop();
		manualCar.turnoffCar();
////		
		System.out.println("==========================");
		manualCar.run();  //★★★★★★★한줄로 가능해짐
		System.out.println("==========================");
		
		Car aiCar = new AICar();
		aiCar.drive();
		aiCar.run();
		System.err.println(aiCar.NAME);
		
				
	}

}
