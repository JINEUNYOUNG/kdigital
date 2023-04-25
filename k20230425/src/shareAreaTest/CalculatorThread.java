package shareAreaTest;

public class CalculatorThread extends Thread{
	ShareArea shareArea;

	public ShareArea getShareArea() {
		return shareArea;
	}

	public void setShareArea(ShareArea shareArea) {
		this.shareArea = shareArea;
	}

	@Override
	public void run() {
		
		double total = 0.0;
		long start = System.currentTimeMillis();
		
		for (long i=1; i<3000000000l; i+=2) {
			if (i / 2 % 2 == 0) {
				total += 1.0 / i;
			} else {
				total += -1.0 / i;
				
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("계산시간:"+(end-start)/1000.+"초");
		
		shareArea.result = total * 4;
		shareArea.ready = true;
		
		synchronized (shareArea) {
			shareArea.notifyAll();
		}
		
	}	
	
}
