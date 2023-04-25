package syncronizedBlock;

public class syncronizedBlockTest {
	
	public static void main(String[] args) {
		
		ShareArea shareArea = new ShareArea();
		
		TransfrThread transfer = new TransfrThread(shareArea);
		PrintThread print = new PrintThread(shareArea);
		
		transfer.start();
		print.start();
				
	}
	

}
