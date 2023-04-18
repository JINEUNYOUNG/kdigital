package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookVO {

// ▼ toString 선언
	@Override					//'어노테이션' 오버라이드된 메소드야. 물려받은걸 덮어쓴거야. 부모클래스에 있는 이름이 같아야해.
	public String toString() {  //안에 있는 데이터 확인용
		
//		▶숫자 데이터 출력 서식 만들기 
//		1. NumberFormat 클래스로 제공되는 서식 사용 가능 
//		NumberFormat nf = NumberFormat.getNumberInstance();  천단위 구분
//		NumberFormat nf = getCurrencyInstance(Locale.korea); 국가별 통화
//		NumberFormat nf = getPercentInstance();  		   	백분율, 자동으로 x100
		
//		2. DecimalFormat 클래스로 서식 만들어 사용
//		DecimalFormat df = new DecimalFormat("#,##0원")  	기본   , 앞 뒤로 필요한 문자를 임의로 넣을 수 있다. 
		DecimalFormat df = new DecimalFormat("￦#,##0");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");  //출력포맷 만들고 
		return "BookVO [title=" + title + ", author=" + author + ", publisher=" + publisher + ", writeDate=" + sdf.format(writeDate)
				+ ", price=" + df.format(price)+"]";
	}
	
//	▼ 필드만들기
	private	String title="";
	private String author="";     //private는 접근할때 에러
	private String publisher="";
	private Date writeDate=new Date();
	private double price=0.0;  //초기화시키기~ 초기화안되면 null값이 되버림. (널포인트오류) null만 아니면 임의의 실수를 넣어도 ㄱㅊ다
	
//	▼ 생성자만들기
	public BookVO() {
//		System.out.println("기본 생성자가 실행됩니다.");			//초기화하는 다른방법. 그러나 위와같이 바로 =""; 해주는편이 편함
//		title = "";
//		author = "";
//		publisher ="";
//		writeDate = new Date();
//		price = 0.0;
//		this("없음","없어","없어요!",new Date(2020,01,01), 0); //현재 클래스의 다른 생성자를 호출한다.
	}
	
	public BookVO(String title, String author, String publisher, Date writeDate, double price) {
//		super(); //부모클래스의 기본생성자를 호출. 생략가능 자동으로 붙여줌.
//		this(); //현재클래스의 기본생성자를 호출
//		반드시 생성자의 첫문장으로 적어야만 
		this.title = title;
		this.author = author;
		this.publisher = publisher;
//		this.writeDate = writeDate;
		writeDate.setYear(writeDate.getYear()-1900);
		writeDate.setMonth(writeDate.getMonth()-1);
		this.writeDate = writeDate;
		this.price = price;
		
//	▼ getters & setters 메소드를 선언 (private 권한으로 선언된 필드를 외부에서 접근할 수 있도록 예외를 만들어줌)
		
	}

	public String getTitle() {   			//받아오고
		return title;
	}

	public void setTitle(String title) {	//넣고
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
