package k20230412;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		String java = new String("java");
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		String jsp = new String("jsp");
		System.out.println(jsp);
		System.out.println(System.identityHashCode(jsp));
		
		java = java + jsp;
		System.out.println(java);
//		string을 연결하면 새로운 스트링 객체가 생성된다.
		
//		concat("문자열") 문자열에 인수로 지정한 문자열을 이어 붙인다.
		java = java.concat(jsp);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		String str = "";
		long start = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			str += "꽝";
			
		}
		System.out.println("실행시간: " + (System.currentTimeMillis() - start));
		System.out.println("String을 사용해서 꽝 10만번");
		
		System.out.println("-------------------------------------");
		
//		======================================================================================
				
		String html = new String("html");
		String css = new String("css");
		
		StringBuilder builder = new StringBuilder(html);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));

//		StringBuilder 클래스는 가변적인 char[] 배열을 멤버변수로 가진다. 
//		연결할때 char[]배열을 변경한다. 새로 만들지 않고 뒤에 붙인다. 시간절약이 된다.
		
//		append() 메소드로 StringBuilder 클래스 객체에 문자열을 연결한다. 
		builder.append(css);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		StringBuilder str2 = new StringBuilder("");
;
		start = System.currentTimeMillis();
		for (int i = 0; i<100000; i++) {
			str2.append("꽝");
			
		}
		System.out.println("실행시간: "+(System.currentTimeMillis() - start));
		System.out.println("StringBuilder;를 사용해서 꽝 10만번한 시간");
		System.out.println("========================");
		
//		----------------------------------------------------------------------------
		
//		StringBuffer 멀티 스레드 프로그램에서 동기화 (순서를 정한다.)를 보장.
//		멀티스레드 프로그램은 스트링버퍼, 
//		단일스레드 프로그램은 스트링빌더를 권장한다.
		
		StringBuffer str3 = new StringBuffer("");
		;
				start = System.currentTimeMillis();
				for (int i = 0; i<100000; i++) {
					str3.append("꽝");
					
				}
		System.out.println("실행시간: "+(System.currentTimeMillis() - start));
		System.out.println("StringBuffer;를 사용해서 꽝 10만번한 시간");
		System.out.println("========================");
		
//		-----------------------------------------------------------------------------
		
		String str4 = "개울가에\n올챙이\n한마리\n꼬물꼬물\n헤엄치다";
		System.out.println(str4);
		
//		text block => JDK13에서 추가되었다. 
//		문자열을 """와 """ 사이에 입력하면 \N을 사용하지 않고도 줄바꿈할수 있다. 
		
		String strBlock = """ 
						개울가에
						올챙이
						한마리
						꼬물꼬물
						헤엄치다
						""";
		System.out.println(strBlock);
		
		
	}

}
