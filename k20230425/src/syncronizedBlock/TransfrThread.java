package syncronizedBlock;

public class TransfrThread extends Thread{
	
	ShareArea shareArea;
	public TransfrThread() {
	}
	public TransfrThread(ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	public ShareArea getShareArea() {
		return shareArea;
	}
	public void setShareArea(ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	@Override
	public void run() {
		synchronized (shareArea) {
			
		
		for (int i=0; i<20; i++) {
			shareArea.lee.deposit(1000000);
			System.out.println("이몽룡 계좌 100만원 입금");
			if (shareArea.ahn.withDraw(100000)!= 0) {;
				System.out.println("안정아 계좌 100만원 출금");
			}	
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
