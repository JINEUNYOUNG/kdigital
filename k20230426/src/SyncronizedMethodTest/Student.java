package SyncronizedMethodTest;

public class Student extends Thread {

	public Student() {	}
	
	public Student(String name) {	
		super(name);
	}
	
	@Override
	public void run() {
		
	
		try {
			String book = LibraryMain.library.lendBook();
//			if (book == null) {
//				return;
//			}
			sleep(2500); //대여기간
			LibraryMain.library.returnBook(book);
		} catch (InterruptedException e) {
		
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("못빌렸습니다.");
		
		}
		
	}

}
