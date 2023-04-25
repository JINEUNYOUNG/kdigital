package shareAreaTest;

public class PrintThread extends Thread {
	ShareArea shareArea;
	

	public ShareArea getShareArea() {
		return shareArea;
	}

	public void setShareArea(ShareArea shareArea) {
		this.shareArea = shareArea;
	}

	@Override
	public void run() {
//		System.out.println("열심히 계산중");
//		while (!shareArea.ready) {
//			try {
//				sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		synchronized ( shareArea) {
			try {
				shareArea.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(shareArea.result);
		
		
		
	}	
}