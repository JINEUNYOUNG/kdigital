
package tjoeun;

import java.util.ArrayList;

public class MemoList {

	private ArrayList<MemoVO> memoList = new ArrayList<>(); {
	}
	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}
	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}
	
	@Override
	public String toString() {
		String str = "";
//			▼ 저장된 메모가 없으면 없다고 출력
		if (memoList.size()==0) {
			str += "저장된 메모가 없습니다.\n";
//			▼ 저장된 메모가 있으면 메모 목록을 마지막 메모부터 출력한다.
		} else {
			for (int i=0; i<memoList.size(); i++) {
//			for (int i=memoList.size()-1; i>=0; i--) {  //마지막부터 처음까지
				str += memoList.get(memoList.size()-1-i)+ "\n";
				}
		}
		return str;
		}	
	
//	 ▼ memoMain클래스에서 입력받은 내용을 memoList라는 arrayList에서 받아 리스트에 추가
	public void addMemo(MemoVO vo) {
		memoList.add(vo);  
	}
	public MemoVO selectMemo(int idx) {
		try { 									//예외처리
			return memoList.get(idx-1);
		} catch (Exception e) {					//exception 오류가 뜨면 널값 (catch안에 넣어줄것)
			return null;
		}
	}
	public void deleteMemo(int idx) {
		memoList.remove(idx-1);
		
//		arrayList는 삭제후 삽입시 자동으로 앞으로 이동된다. -> 보정 
//		삭제 후 새 글이 입력될때 기존 idx값에 이어서 1씩 증가할 수 있도록 count값을 수정한다.
//		count는 정적변수. 알아서 늘어남. 
		
//		메모 삭제 후 글번호를 다시 붙여준다.
		for (int i = 0; i<memoList.size(); i++) {
				memoList.get(i).setIdx(i+1);
		}
		MemoVO.count = memoList.size();
			
	}
		public void updateMemo(int dix, String memo) {
			MemoList.get(idx-1).setMemo(memo);
		}
	
}
