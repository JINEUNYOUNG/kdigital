package com.tjoeun.inheritance;

import java.util.Calendar;

//	자바는 일반적으로 파일 1개에 1개의 클래스를 만들어 사용하지만, 필요에따라 1개의 파일에 여러개의 클래스를 만들어 사용할 수 있다. 
//	1개의 파일에 여러개의 클래스를 만들면 "*.java" 파일은 1개가 만들어 지지만(/src), 컴파일 된 "*.class" 파일(/bin)은 각각 독립적으로 생성이 된다. 
//	현재 java파일의 이름과 같은 이름의 클래스에만 public을 붙일 수 있다. public 삭제!

//	기본 생성자가 실행되면 현재 날짜로 필드를 초기화 하고 년, 월, 일을 넘겨받는 생성자가 실행되면
//	념겨받은 년, 월, 일로 필드를 초기화하는 클래스를 만든다.
class Date { //날짜를 기억하는 클래스
	
	private int year;
	private int month;
	private int day;

	public Date() {
//		java.util.Date date = new java.util.Date();
//		year = date.getYear() + 1900;
//		month = date.getMonth() + 1;
//		day = date.getDate();
//	    ▼ 위 대신 	
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		day = calendar.get(Calendar.DATE);
		
	}


	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}


	@Override
	public String toString() {
		return String.format("%4d년 %02d월 %02d일", year, month, day);
			
		
		
	}
	
	
}


//	기본 생성자가 실행되면 현재 날짜로 필드를 초기화 하고 년, 월, 일을 넘겨받는 생성자가 실행되면
//	념겨받은 시, 분, 초로 필드를 초기화하는 클래스를 만든다.
class Time { //시간을 기억하는 클래스
	
	private int hour;
	private int minute;
	private int second;

	public Time() {
//		java.util.Date date = new java.util.Date();
//		year = date.getYear() + 1900;
//		month = date.getMonth() + 1;
//		day = date.getDate();
//	    ▼ 위 대신 Calendar를 쓰면 간편하다.
		Calendar calendar = Calendar.getInstance();
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);
		
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
				}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
}
class Now {
//	★★★★클래스 포함★★★★이란 클래스의 필드로 다른 클래스 객체를 선언해서 사용하는 것 
	private Date date;   //우리가만든date
	private Time time;	//우리가만든time
// 기본 생성자가 실행되면 현재 날짜와 시간으로 초기화 시킨다.
	public Now() {
		date = new Date();
		time = new Time();
	}
	
	@Override
	public String toString() {
		return "Now [date=" + date + ", time=" + time + "]";
	}
	
	
//	날짜와 시간 데이터를 넘겨받아 초기화시키는 생성자를 만든다.
 
	public Now(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	public Now(int year, int month, int day, int hour, int minute, int second) {
	date = new Date(year, month, day);
	time = new Time(hour,minute,second);
	}
	
//	년, 월, 일, 시, 분, 초를 넘겨받아 초기화시키는 생성자를 만든다.
	
	
	
	
}

// ▼ date와 time 이라는 클래스를 상속받아 now라는 클래스를 만들겠다. 다중상속은 안됨요!!!!!!!
//class Now extends Date,Time{ } <<<에러!!!!!!!!!!!>>>
//	다중상속 효과를 내기 위해 클래스 포함 또는 인터페이스를 사용한다.
//▼ 출력을 하려면 main메소드에서

public class ClassincludeTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		Time time = new Time();
		System.out.println(time);
		
		Now now = new Now();
		System.out.println(now);
		
		Now now2 = new Now(date, time);
		System.out.println(now2);
		
		Now now3 = new Now(2023,2,4,7,30,29);
		System.out.println(now3);
				
		
	}
}
	