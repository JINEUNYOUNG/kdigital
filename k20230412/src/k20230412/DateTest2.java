package k20230412;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest2 {
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd(E) a h:mm:ss.SSS");
		System.out.println(sdf.format(date));
		
		Date date2 = new Date(System.currentTimeMillis());
		System.out.println(sdf.format(date2));

		Date date3 = new Date("2023/04/22");
		System.out.println(sdf.format(date3));

		Date date4 = new Date(2023 - 1900, 11 - 1, 22); //DATE클래스에 객체에 년도를 저장할때는 1900을 빼고 월은 1을 빼고
		System.out.println(sdf.format(date4));
		
		
		
		
	}

}
