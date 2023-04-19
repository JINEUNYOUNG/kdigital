package tjoeun;

import java.text.SimpleDateFormat;
import java.util.Date;


//	▼메모 1건을 기억할 클래스. 선언해줌 
public class MemoVO {

		
	public static int count; 	//	글번호 자동 증가에 사용할 정적 필드 count
	private static int idx;  	//	자동으로 1씩 증가하는 글번호
	private String name; 		//	작성자 이름
	private String password;	//	비밀번호
	private String memo;		//	메모
	private Date writeDate;		//	메모 작성일 _ 컴퓨터 시스템의 날짜와 시간

//▼ MemoVO 내용 
	public MemoVO() {}
	public MemoVO(String name, String password, String memo) {
		idx = ++count; 
		this.name = name;
		this.password = password;
		this.memo = memo;
		writeDate = new Date();
		
	}
//	▼getter setter로 사용할수 잇게해줌	( 안보이는 애들에게 씌워주는 거고 public은 필요x. )
	public static int getIdx() {
		return idx;
	}
	public static void setIdx(int idx) {
		MemoVO.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
//	▼OVERRIDE로 재확인. 잘 들어갔는지. 
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd(E) HH:mm:ss"); //넣으면 문자열로바뀜
		
		return String.format("%d. %s(%s)님이 %s에 남긴 글 \n%s",idx,name,password,sdf.format(writeDate),memo);
				
	}
	
	
	
	
}
