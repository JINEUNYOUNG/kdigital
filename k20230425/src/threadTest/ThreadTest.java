package threadTest;

public class ThreadTest {

	
	public static void main(String[] args) {
		
		DigitThread digit = new DigitThread();	
		digit.start();
//		=> new DigitThread().start(); 해도 된다.....
		
		for (int i=0; i<26; i++) {
			System.out.print((char)(i+65));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		AlphaThread alpha = new AlphaThread();		
		Thread thread = new Thread(alpha);
		thread.start();
//		=> new Thread(AlphaThread()).start(); 해도 된다.....
		
		
	}
}
