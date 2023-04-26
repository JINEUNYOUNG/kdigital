package SyncronizedMethodTest;

import java.util.ArrayList;

public class Library {
	
	 ArrayList<String> bookList = new ArrayList<>();

	 public Library() {
		 bookList.add("옥상에서 만나요");
		 bookList.add("지구에서 한아뿐");
		 bookList.add("숨");
		 bookList.add("물고기는 존재하지않는다");
		 bookList.add("정의란무엇인가");
		
	 }
	 
	 
	 
	 public synchronized String lendBook() {
		 Thread thread = Thread.currentThread();
		 
		 if (bookList.size()==0) {
			 try {
				 System.out.println(thread.getName() + " 대기 시작");
				 wait();
				 System.out.println(thread.getName() + " 대기 종료");
			} catch (InterruptedException e) {
			}

		 }
		 
		 
		 try {
			 String book = bookList.remove(0);
			 System.out.println(thread.getName()+" 빌려간 책 : "+book);
			 return book;
		 } catch (IndexOutOfBoundsException e) {
				System.out.println(thread.getName()+" 못빌렸습니다.");
			 return null;
		 }
	 }
	 
	 public synchronized  void returnBook(String book) {
		 
		 Thread thread = Thread.currentThread();
		 bookList.add(book);
		 notify();
		 System.out.println(thread.getName()+" "+book+" 반납");
		 
	 }
	 
}

