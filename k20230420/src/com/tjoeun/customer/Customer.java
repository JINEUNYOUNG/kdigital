package com.tjoeun.customer;

public class Customer {
//   일반 고객 정보 하나를 기억하는 클래스	
	
	private int customerID;			//고객ID
	private String customerName;	//고객이름
	private String customerGrade;	//고객등급
	private int bonusPoint;			//보너스포인트
	private double bonusRatio;		//보너스포인트적립비율
	
	
	public Customer() {
		customerGrade = "SIVER";
		bonusRatio = 0.01;
	}
	
	
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}


//  고객정보를 리턴하는 메소드
	public String showCustomerInfo() {
				
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점입니다.";
	}


// 구매금액을 인수로 넘겨 받아 보너스 포인트를 계산해서 리턴하는 메소드
	public int calcBonus(int price) {
		return (int) (price * bonusRatio) ;
	}



	public int calcPrice(int price) {
		bonusPoint += calcBonus(price);
		return bonusPoint; 
		}

	}
	
	

