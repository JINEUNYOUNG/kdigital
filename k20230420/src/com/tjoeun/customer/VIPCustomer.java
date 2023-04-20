package com.tjoeun.customer;

//  VIP고객 정보를 기억하는 클래스
//  Customer 클래스 내용과 중복되므로 상속받아 쓴다.
public class VIPCustomer extends Customer {
	
//	일반 고객정보에는 없고 우수 고객 정보에만 있을 필드를 선언한다.
//	└1:1 상담원이 배정됨 / 제품구매시 10%할인 / 보너스포인트 5%
	private int agentID; 			//담당상담원 ID
	private double salesRatio; 		//추가할인 비율

	public VIPCustomer() {
//		getCustomerGrade = "VIP"; 			private권한이므로 에러
//		getBonusRatio = 0.05;				부모라도 프라이빗하다..지켜달라
		setCustomerGrade("VIP");			//set으로 초기화함1 
		setBonusRatio(0.05);				//2
		salesRatio = 0.1;					//여기서 만든거니까 그냥 집어넣음
	
	}

	public int calcSales(int price) { 
		return (int) (price * (1-salesRatio));
	}

	
//	▼ customer 클래스는 상속받은 calcbonus() 메소드는 할인전 금액에 대한 보너스 포인트 계산.
//	  때문에 VIP고객은 할인 후 금액에다 보너스 포인트 계산해야함.
	
	@Override
	public int calcBonus(int price) {
		return (int) (calcSales(price) * getBonusRatio());
	}
	
	

}

