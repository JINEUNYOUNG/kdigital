package intefaceTest;

public interface Calc {
	
	public static final double PI = 3.141592;
	int ERROR = -9999; 								//상수
		
	public abstract int add(int num1, int num2);	//추상메서드
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2); 
	
	

}
