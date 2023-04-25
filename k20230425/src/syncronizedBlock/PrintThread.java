package syncronizedBlock;

public class PrintThread extends Thread{

	ShareArea shareArea;
	public PrintThread() {	}
	public ShareArea getShareArea() {
		return shareArea;
	}
	public void setShareArea(ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	public PrintThread(ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	@Override
	public void run() {
		synchronized (shareArea) {
			
		for (int i=0; i<3; i++) {
			int sum = shareArea.lee.money + shareArea.ahn.money;
			System.out.println("예금합계"+sum+"원이고 안정아는"+shareArea.ahn.money);
		
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
		
	}
}
