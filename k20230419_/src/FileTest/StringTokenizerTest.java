package FileTest;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
//		String str = "010-1234-5678";
////	split() 메소드는 인수로 지정된 구분자로 문자열을 분리해서 배열로 리턴한다.
//		String[] phoneNo = str.split("-");
//		System.out.println(Arrays.toString(phoneNo));
////	split() 메소드는 구분자를 2개이상 지정할 수 없음! 
////	공백과 탭이 섞여있는 데이터에 구분자를 공백만 지정하면 탭으로 구분된 데이터는 분리할 수 x
//		str = "사과 배 복숭아      밤 대추";
//		String[] data = str.split(" ");
//		System.out.println(Arrays.toString(data));
		
//		StringTokenizer클래스는 사용자가 지정하는 구분자를 경계로 데이터를 분리한다. 
//		구분자를 생략하면 공백과 탭을 기본 구분자로 사용하며, 구분자로 분리된 데이터를 token이라 한다.
		
//		1. 문자열이 공백과 탭으로 구분된 경우
		String str1 = "사과 배 복숭아	밤 대추";
		StringTokenizer st1 = new StringTokenizer(str1);  //stringtokenizer 생성해줌  구분자는 생략됨.

		while (st1.hasMoreTokens()) {    // 다음에 읽을 데이터(token)가 있는 동안에 반복, 있으면 true 없으면 false
			System.out.println(st1.nextToken());
			
		}
		System.out.println("==========================");
		
//		2. 문자열이 ,로 구분된 경우
		String str2 = "사과,배,복숭아,밤,대추";
		StringTokenizer st2 = new StringTokenizer(str2,",");
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println("==========================");
		
//		3. 문자열이 ,와 .로 구분된 경우
		
		String str3 = "사과,배,복숭아.밤,대추";
		StringTokenizer st3 = new StringTokenizer(str2,",."); //함께 쓰면 됨..진짜멋있음 
		
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		System.out.println("==========================");
		
		
//		4. 문자열이 =와 ,로 구분된 경우
		
		String str4 = "사과=1000,배=2000,복숭아=5400,밤=2393,대추=3990";
		StringTokenizer st4 = new StringTokenizer(str4,"=,",true); 
//		3번째 인수로 구분자를 token에 포함시키는 여부를 지정할 수 있다.
//		생략시 false가 기본 값으로 구분자를 token에 포함시키지 않지만 true는 포함가능
//		!!!!구분자마저 나눠서 보여줌!!!!
		
		
		while (st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());
		}
		System.out.println("==========================");
		
//		quiz. 사과(1,000원) 처럼 나오게 할 것! 
		
		
		String str5 = "사과=1000,배=2000,복숭아=5400,밤=2393,대추=3990";
		StringTokenizer st5 = new StringTokenizer(str4,"=,",true); 
		DecimalFormat df = new DecimalFormat("#,##0원");
		while (st5.hasMoreTokens()) {
			str5 = st5.nextToken();
			if (str5.equals("=")) {
				System.out.print("(");
			} else if (str5.equals(",")) {
				System.out.print(")\n");
			} else { 
				try {
					System.out.print(df.format(Integer.parseInt(str5)));
				} catch (NumberFormatException e) {
					System.out.print(str5);
				}
		}
		
		
		}
		System.out.println(")");
		
		
	}

}
