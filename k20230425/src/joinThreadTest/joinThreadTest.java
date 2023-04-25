package joinThreadTest;

public class joinThreadTest {


	public static void main(String[] args) {
		
		joinThread jt1 = new joinThread(1,50);
		joinThread jt2 = new joinThread(51,100);
			
		
		jt1.start();
		jt2.start();
		
		System.out.println("jt1.total: "+jt1.total);
		System.out.println("jt2.total: "+jt2.total);
	}
}
