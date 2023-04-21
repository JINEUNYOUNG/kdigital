package com.tjoeun.interfaceTest;

// 표시인터페이스 marker interface 는 아무 내용도 가지지 않는 인터페이스이다.
interface Repairable {		//SCV가 수리가능한 유닛 클래스에 구현한다. 
	
}
// ↑ 아무것도 넣지 않습니다!



// 모든 유닛의 최고 조상 클래스 Unit을 만든다.

// Unit 클래스를 상속받아 육상 유닛의 조상 클래스 GroundUnit
// Unit 클래스를 상속받아 공중 유닛의 조상 클래스 AirUnit

// GroundUnit 클래스를 상속받아 Tank를 만든다.
// GroundUnit 클래스를 상속받아 Marine를 만든다.
// GroundUnit 클래스를 상속받아 SCV를 만든다.

// AirUnit 클래스를 상속받아 Dropship을 만든다. 

class Unit{
	final int MAX_HP;			//최대 HP (상수_final_초기화필수)
	int currentHP;					//현재 HP
//	초기화방법1 : =100  냅다 초기화
//	초기화방법2 public unit { max_hp =100 } 객체가 생성될때 생성자에서 초기화
//	초기화방법3 : static {}와 같이 초기화 블록을 사용
	public Unit(int hp) {
//		④Unit 클래스의 생성자에서 인수로 넘어온 150을 받아
		MAX_HP = hp;
//		⑤MAX_HP를 초기화 시킨다. 
	}
//		⑥Unit 클래스의 생성자가 종료되면 호출한 곳으로 돌아감. 
//	생성자를 선언하지 않으면 기본생성자를 만들어준다. 
//	but 다른 생성자를 선언하면 기본 생성자를 만들어주지않음
//  SO, 유닛 클래스에는 기본 생성자가 존재하지 않는다. 	
	
	


//  수리하는 메소드를 만듬
// 	수리하는 메소드는 유닛별로 만들지 않고 실제 수리 기능을 담당하는 유닛인 이곳에 만든다. 

// 	오퍼랜드(데이터)
// 	메소드의 인수로 클래스나 인터페이스 객체를 사용하면 인수로 지정된 클래스를 상속받았거나 
//  인터페이스를 구현받은 모든 클래스 또는 인터페이스객체를 인수로 받을 수 있다. 

}



class AirUnit extends Unit{
	public AirUnit(int hp) {
		super(hp);
	}
	
}

class GroundUnit extends Unit{
	public GroundUnit(int hp) {
//	③인수로 넘어온 150이 전달되어 부모클래스(Unit) 생성자를 호출
		super(hp);
	} //⑦돌아옴 
//		⑧goundunit 클래스의 생성자가 종료되어 호출한 곳으로 돌아감. 
}


class Tank extends GroundUnit implements Repairable{

	public Tank() {
//			②Tank 클래스의 기본 생성자가 실행되면 150을 인수로 부모 클래스의
//			생성자를 호출한다.
		super(150); //⑨tank MAX_HP가 150으로 초기화되었으므로 CurrentHP=MAX_UP로 초기화
		currentHP = MAX_HP;
		System.out.println("Tank의 현재 HP는 "+currentHP+"입니다.");
	}
}

class Marine extends GroundUnit{

	public Marine() {
		
		super(80);
	currentHP = MAX_HP;
	System.out.println("Marine의 현재 HP는 "+currentHP+"입니다.");
}
}

class SCV extends GroundUnit implements Repairable{

	public SCV() {
		super(100);
	
	currentHP = MAX_HP;
	System.out.println("SCV의 현재 HP는 "+currentHP+"입니다.");
	}
	
	public void repair(Repairable repairable) {
		
		
		if (repairable instanceof Unit) {
			
			Unit unit = (Unit) repairable;
			
//			수리한다. 
			unit.currentHP = 100;
			while (unit.currentHP<unit.MAX_HP) {
				unit.currentHP++;
				System.out.print(".");//만땅될때까지 1씩 증가
				try {
					Thread.sleep(50);					//0.5초에 한번
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println("\n" + unit + "수리완료");
			
		} else {
			System.out.println("Repairable 인터페이스 객체로 넘어온 객체를 Unit 클래스로 형변환 할 수 없다.");
		}
	}
}

class DropShip extends AirUnit implements Repairable{
	public DropShip() {
		super(120);
	currentHP = MAX_HP;
	System.out.println("Dropship의 현재 HP는 "+currentHP+"입니다.");
	}
}


public class MarkerInterfaceTest {
	
	public static void main(String[] args) {
//		① Tank 클래스의 기본 생성자를 호출해서 Tank 클래스의 객체를 만든다.
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropShip = new DropShip();

		scv.repair(dropShip);
		
		
	}

}
