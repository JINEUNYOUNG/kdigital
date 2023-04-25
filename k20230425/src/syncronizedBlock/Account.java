package syncronizedBlock;

import java.util.Scanner;

public class Account {
	
	String accountNo;
	String name;
	int money;
	public Account(String accountNo, String name, int money) {
		this.accountNo = accountNo;
		this.name = name;
		this.money = money;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void deposit(int amount) {
		money += amount ;	
	}

	public int withDraw(int amount) {
		if (amount > money) {
			System.out.println("부족합니다.");
			return 0;
		} 
		money -= amount;
		return amount;
	}
	
}
