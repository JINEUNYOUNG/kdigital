package com.tjoeun.abstractClass;

class Base {		//package 접근권한은 같은 패키지에서는 public처럼, 다른패키지에선 private처럼. 
	
	String name;	//접근권한을 생략하면 package 권한
	void say() {
		System.out.println(name+"님 안녕하세요");
	}

}

class Sub extends Base {  //base부모 //sub자식
	
	int age;

	@Override
	void say() {
		System.out.println(name+"님은"+age+"살입니다.");
	}
	

}



public class UpDownCastingTest {
	
	public static void main(String[] args) {
		
		Base base = new Base();
		base.name = "홍길동"; //같은패키지라서 됨! 		
		base.say();				//부모클래스에서 객체를 만들어 사용하면 문제없이 처리 
		System.out.println("==================================");
		
		
		Sub sub = new Sub();
		sub.name = "임꺽정"; //부모클래스에서 상속받음
		sub.age = 20;
		sub.say();				//자식클래스에서 객체를 만들어 자식클래스에서 사용
		System.out.println("==================================");
		
//		결론 : ⓡ부모클래스 → 자식클래스 제어가능
//				②자식클래스 → 부모클래스 제어불가능
//		
//		Base b = new Sub();
//		b.say(); 								//①자식쪽의 say가 실행됨. 만든게 sub(자식)이라서
		
//		Sub s = new Base;						//②부모에게 자식을 집어넣으면 오류
		
		//부모 클래스 타입의 객체에 자식 클래스 타입의 객체가 생성된 주소를 대입 => upcasting(=boxing)
//		//부모클래스 타입으로 upcasting된 자식클래스를 다시 자식클래스 타입으로 변환 => owncasting(=unboxing)
		Base b = sub;
		b.say();
		System.out.println("==================================");
//		b는 부모 타입의 객체지만 자식 클래스 타입의 생성된 주소를 대입 했으므로 
//		say()메소드를 실행하면 자식클래스의 메소드가 실행된다
		
//		Sub s = base; 에러! (부모>자식)

//		자식 클래스타입에 부모클래스타입의 객체나 주소를 대입하면 에러.. 이때 casting시키면 대입가능, but 
//		정상적인 downcasting이 아닌경우 ClassCasttException이 발생. 
//		Sub s = (Sub) base; 			// 문법적인오류x 실행오류o
//		SO, ① instanceof 연산자로 안전하게 형변환이 되었는지 검사한다. 
		
		if (sub instanceof Base) {
			System.out.println("sub클래스타입의 객체는 Base 클래스 타입으로 형변환 가능");
		} else { System.out.println("불가능"); 		//가능
			};
		
			if (base instanceof Sub) {
				System.out.println("base클래스타입의 객체는 Sub 클래스 타입으로 형변환 가능");
			} else { System.out.println("불가능");      //불가능
			};
			
//			정상적인 downcast란 ? 	②upcast된 자식클래스를 다시 자식클래스타입에 넣는것 
			Base base2 = sub;				//upcast를 한 다음에
			Sub sub2 = (Sub) base2;		//downcast를.. 
			sub2.say();		
			
		
	}

}
