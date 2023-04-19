
package tjoeun;

import java.util.Scanner;

public class MemoMain {

	private static MemoList memoList = new MemoList();	
	
	public static void main(String[] args) {
//		▼ 글 목록을 저장하는 MemoList 클래스 객체는 클래스 내 여러 메소드에서 사용해야 하기때문에 
//		MemoMain 클래스의 필드로 선언해야한다. ★★★★★★★★★★★static 안에선 static 만 사용가능

		
//		MemoVO memo1 = new MemoVO("조승연","0825","1등입니다.");
//		MemoVO memo2 = new MemoVO("조승연","0825","1등입니다.");
//		MemoVO memo3 = new MemoVO("조승연","0825","1등입니다.");
//		MemoVO memo4 = new MemoVO("조승연","0825","1등입니다.");
//		
//		System.out.println(memo1);
//		System.out.println(memo2);
//		System.out.println(memo3);
//		System.out.println(memo4);
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {  //5가 아닌 동안만 돌린다.
		
			while (true) {
			System.out.println("======================================");
			System.out.println("1. 입력 2. 목록보기 3. 수정 4. 삭제 5. 종료");
			System.out.println("======================================");
			System.out.println("원하는 메뉴를 입력하세요:");
			menu = scanner.nextInt();
			if (menu >= 1 && menu <= 5) {
				break;
			}
			System.out.println("메뉴는 1~5 사이로 입력하세요.");
			}
			
	//		여기를 지나왔으면 menu에는 1~5사이의 정수가 입력되었다는 의미.
			
			switch(menu) {
				case 1:
					insert(); 
//					데이터를 저장하는 메소드를 실행 한다.
					break;
				case 2: 
					System.out.println(memoList);
//					데이터를 목록을 보여주는 메소드를 실행 한다. (0이면 없습니다.)
					break;
				case 3: 
//					update();
					break;
				case 4: 
					delete();
//					데이터를 삭제하는 메소드를 실행 한다.
					break;
				case 5: 
//					데이터를 종료하는 메소드를 실행 한다.
					break;
			}
				
			
		}
		System.out.println("!프로그램을 종료합니다!");}
		
//		Q. 수정할 글번호를 입력받아 1건을 얻어와 표시하고 비밀번호와 수정할 내용을 입력받아
//	  	memoList라는 ArrayList에 저장된 글 1건을 수정한다.
	private static void update() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("수정할 글 번호를 입력하세요.:");
		int idx = scanner.nextInt();
		
		MemoVO original = memoList.selectMemo(idx);
		
		if (original == null)  {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println("수정할 글이 맞습니까?");
			System.out.println(original);   			
			
			
			System.out.println("이 글의 비밀번호를 입력하세요.");
			scanner.nextLine();              //★★★★★★★★★★★★★키보드 버퍼를 비워버림=읽어버림.
			String password = scanner.nextLine().trim();    //nextline는 엔터키를 인식해버림
			
//			수정하기 위해 입력한 비번 vs 수정한 글의 비번 비교
			
			if (password.equals(original.getPassword())) {
				System.out.println("수정할 메모를 입력하세요.");
				String memo = scanner.nextLine().trim();
				memoList.updateMemo(idx); 					//updateMemo라는 메소드를 실행해라.
				System.out.println(idx + "번 글 수정완료!!!")
				
			} else {
				System.out.println("!비밀번호 불일치!");
			} 
		}
		
		
	}
	
	
//		Q.키보드로 삭제할 글 번호를 받아 1건을 얻어와 화면에 표시하고 비밀번호를 입력받아 
//		memoList라는 ArrayList에 저장된 글 1건을 삭제한다.
	private static void delete() {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 글 번호를 입력하세요.:");
		int idx = scanner.nextInt();
			
//		memoList라는 ArrayList에 저장 된 글 1건을 얻어오는 메소드를 실행하고 얻어온 결과를 MemoVO 객체에 저장한다.
			
		MemoVO original = memoList.selectMemo(idx);
		
//		삭제할 글번호에 글이 존재하면 글을 확인하고 삭제하고 존재하면 존재하지않는다는 메시지.
		
		if (original == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println("삭제할 글이 맞습니까?");
			System.out.println(original);   			
		
        
			 System.out.println("이 글의 비밀번호를 입력하세요.");
			 scanner.nextLine();              //★★★★★★★★★★★★★키보드 버퍼를 비워버림=읽어버림.
			String password = scanner.nextLine().trim();    //nextline는 엔터키를 인식해버림
			
				if (password.equals(original.getPassword())) {
					memoList.deleteMemo(idx);
					System.out.println("!삭제완료!");
				
				} else {
					System.out.println("!비밀번호 불일치!");
						} 
					}
		}
		

	
//	Q. 키보드로 이름, 비밀번호, 메모를 입력받아 memoVO 클래스 객체에 저장하고 arrayList에 저장하는 메소드를 호출하는 메소드
	private static void insert() {
		
		Scanner scanner = new Scanner(System.in);
//	1. 키보드로 이름, 비밀번호, 메모를 입력받기
		System.out.println("게시판에 저장할 글 입력");
		System.out.print("이름:");
		String name = scanner.nextLine().trim();        //.trim() 쓸모없는 부분 지우기
		System.out.print("비밀번호:");
		String password = scanner.nextLine().trim();      
		System.out.print("메모:");
		String memo = scanner.nextLine().trim();       
		
//	2. MemoVO 클래스 객체에 입력받은 내용을 저장한다.
		MemoVO vo = new MemoVO(name, password, memo);
		System.out.println(vo);
		
//	3. MemoVO 클래스 객체를 MemoList 클래스의 ArrayList에 저장하는 메소드를 실행.
		memoList.addMemo(vo);
		System.out.println("저장완료!");
//		System.out.println(memoList);	
		
		
	
	
		}
}
