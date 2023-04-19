package k20230412;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "     tjoeunit     ";
//		length() 
		System.out.println("문자개수 : " + str.length());

//  	trim()
		System.out.println("불필요한 빈칸 지우면: " + str.trim());
		System.out.println("불필요한 빈칸 지우면: " + str.trim().length());

//      Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine().trim();
//		System.out.println(name);

		str = "83727239277190";
//		charAt(index)는 문자열에서 지정된 index번째 위치의 문자를 얻어온다. 0~ 
		System.out.println("성별은 " + str.charAt(6));

		System.out.println("한글자를 얻어올 문장?:");
		char ch = scanner.nextLine().charAt(0);
		System.out.println(ch);

		str = "TjoeunIT";
//		toUpperCase() 메소드는 영문자를 무조건 대문자로
//		toLowerCase() 메소드는 반대
		System.out.println("무조건 대문자로: " + str.toUpperCase());
		str = "83727239277190";
//		substring(a) 문자열의 a번째 부터 끝까지
//		substring(a,b) 문자열의 a번째부터 b-1번째 까지
		System.out.println("주민등록번호 뒷자리" + str.substring(6, 13));

		str = "itTjoeunit";
		System.out.println(str);
//		indexOf() 문자열의 왼쪽부터 찾아서 최초로 나온 인덱스를 반환
//		LastIndexOf() 오른쪽부터 
		System.out.println("처음부터찾으면" + str.indexOf("it") + "번째");
		System.out.println("뒤부터찾으면 " + str.lastIndexOf("it") + "번째");
//		없으면 -1이기 때문에 0이상이면 있다는 얘기

//		contains() 찾으면 true 없으면 false

		System.out.println(str.contains("it"));
		System.out.println(str.contains("IT"));

		str = "abc 123 가나다";
//		split("구분자")  구분자를 기준으로 나눠서 배열로 리턴한다.
		System.out.println(str.split(" "));
// 		[Ljava.lang.String;@27fe3806 라고 뜨는데, 배열이란 소리임.
		System.out.println(str.split(" ").length);
		System.out.println(Arrays.toString(str.split(" "))); // 배열 나열
		System.out.println(str.split(" ")[0]); // 배열 중 첫번째

		str = "itTjoeunit";
//		replace(a,b) a를 b로 치환한다. 
		System.out.println(str.replace("i","아이"));

		str = "83727239277190";
//		repeat() 문자열을 괄호안의 숫자만큼 반복한다.
		System.out.println(str.substring(0,7)+"*".repeat(6));
		
		str = "123-45678-12345"; 
		System.out.println(str.split("-"));
		System.out.println((str.split("-")[0]+"*".repeat(str.split("-")[1].length())+(str.split("-")[2])));
		
	}

}
