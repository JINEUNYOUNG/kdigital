package threadTest;

public class ThreadTerminate extends Thread {

	private boolean flag = true;
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}



	
	public ThreadTerminate() {
	}
	public ThreadTerminate(String name) {
		super(name);
	}

	
	
	@Override
	public void run() {
		
		while (flag) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " END");
		
}

}
