package com.tjoeun.abstractClass;

//추상클래스? (1개 이상의 추상메소드를 포함한 클래스)
//불완전한 클래스 => new를 할 수 없음 
//추상클래스는 상속을 목적으로 만들어 쓰는 클래스.  상속받은 자식클래스는 override해서 사용. =>why ? "다형성구현" 
abstract class Product {
	
//	public void kindof() {							→아무런 기능도 하지않는 일반 메소드
	public abstract void kindOf();			//→ 아무런 기능도 하지않는 추상!메소드
//  추상메소드란 ? 아무런 일도 하지않은 {}을 가지지 않는 메소드.  불완전한 메소드 
// abstract 예악어를 사용해 선언. 	
//	추상메소드가 포함된 클래스를 상속받는 자식클래스에서는 프로그래머에게 반드시 override해서 사용하게끔 강제함. 
//추상메소드의 {}블록에 코딩해봐야 자식클래스에서 오버라이드 해야하기때문에 아에 코딩하지x

}



//  Product  클래스(추상클래스)를 상속 받아 Camera 라는 클래스를 만든다.
class Camera extends Product {
	
//	Product product = new Product();  //추상클래스는  new를 못해
	@Override
	public void kindOf() {
		
	}
	
	
}

public class abstractClassTest {
	
	public static void main(String[] args) {
		
//		
		
		
	}

}
