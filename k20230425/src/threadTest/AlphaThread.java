package threadTest;

public class AlphaThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		

		
		for (char ch='a'; ch<='z'; ch++) {
			System.out.print((char)(ch));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
		



}
