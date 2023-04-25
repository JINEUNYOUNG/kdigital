package joinThreadTest;

public class joinThread extends Thread {

	int start, end, total;
	
	public joinThread() { }
	public joinThread(int start, int end) {	
			this.start = start;
			this.end = end;
	}
	@Override
	public void run() {
	for (int i = start; i <= end; i++) {
		total += i;
		}
			
	}
		
}

