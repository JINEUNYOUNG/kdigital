package SyncronizedMethodTest;

public class LibraryMain {
	
	public static Library library = new Library();
	
	
	public static void main(String[] args) {
		
//		Library library = new Library();
//		System.out.println(library.bookList);
//	
//		String book = library.bookList.remove(0);
//		System.out.println(book);
//		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("안길은");
		Student student3 = new Student("오서동");
		Student student4 = new Student("추길동");
		Student student5 = new Student("일길동");
		Student student6 = new Student("서우동");
	
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		student5.start();
		student6.start();
		
		
		
	}

}
