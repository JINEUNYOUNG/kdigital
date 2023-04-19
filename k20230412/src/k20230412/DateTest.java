package k20230412;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest {
	public static void main(String[] args) {
//		현재 컴퓨터 시스템의 날짜와 시간을 가져옴.
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YY년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YY.MM.dd(E) a h:mm:ss.SSS", Locale.CHINA);
		System.out.println(sdf2.format(date));
		
		System.out.println("-------------------------------------------");
		
		System.out.println(date.getYear()+1900);  //년도는 1900년도 부터
		System.out.println(date.getMonth()+1);    // 월은 0~11월이므로 +1
		System.out.println(date.getDate());   
		
		System.out.println("--------------------------------------------");
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(sdf.format(calendar.getTime()));
		System.out.println(calendar.get(Calendar.YEAR));
		
		System.out.println("--------------------------------------------");
		
		System.out.println(System.currentTimeMillis());  //70년 1월 1일 자정부터 밀리초를 셈 //13자리의 정수이므로 long타입에 저장해야한다.
		long start = System.currentTimeMillis();
		
		try {
			Thread.sleep(1000);
		} catch ( InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("실행시간: "+ (end - start)/1000.+"초");
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("실행 시간: HH:mm:ss.SSS 초");     //사칙연산은 문제없으나 서식을 지정하면 offset값이 포함된 시간으로 적용됨
	
		System.out.println(sdf4.format(end-start-32400000));
	}

}
