package com.tjoeun.customer;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		// ▼ 일반 고객 객체
		Customer customerLee = new Customer();        
		customerLee.setCustomerID(10010);				
		customerLee.setCustomerName("이몽룡");			
		customerLee.setBonusPoint(1000);				
		
		System.out.println("회원 정보: "+customerLee.showCustomerInfo());
		System.out.println("보너스 포인트: "+customerLee.calcBonus(10000));
		System.out.println("누적 보너스 포인트: "+customerLee.calcPrice(10000));
		
		
		// ▼ VIP고객 객체 (고객 -> VIP 상속!!!!!)
		VIPCustomer customerLim = new VIPCustomer();
		customerLim.setCustomerID(35124);
		customerLim.setCustomerName("성춘향");
		customerLim.setBonusPoint(10000);
		
		
		System.out.println("회원 정보: "+customerLim.showCustomerInfo());
		System.out.println("실제 구매 금액: "+customerLim.calcSales(10000));
		System.out.println("보너스 포인트: "+customerLim.calcBonus(10000));
	
}
		
		
		
	}


