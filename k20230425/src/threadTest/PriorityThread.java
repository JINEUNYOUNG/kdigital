package threadTest;

public class PriorityThread extends Thread{

	public PriorityThread() {}
	public PriorityThread(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {

		
		Thread thread = Thread.currentThread();
		
		thread.setName("스레드이름이같아짐");
		
		int sum = 0;
		for (int i=1; i<=1000000; i++) {
			sum += i;
			
		}
		System.out.println(thread.getName()+"우선 순위: "+thread.getPriority());
	}

}
