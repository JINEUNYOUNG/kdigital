package com.tjoeun.MyCalendar;

public class MyCalendar {
	
	//윤년이면 true 평년이면 false
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	//년,월을 받아 그달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year, int month) {
		int[] m = {31,0,31,30,31,30,31,31,30,31,30,31};
		m[1] = isLeapYear(year)? 29 : 28;
		return m[month-1];
	}
	
	//년,월,일을 받아 1년 1월 1일부터 지나 날짜를 계산해 리턴하는 메소드
	public static int totalDay(int year, int month, int day) {
		int sum = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		for (int i=1; i<month; i++) {
			sum += lastDay(year, i);
		}
		return sum+day;
	}
	//요일을 계산
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) %7;
	}
}