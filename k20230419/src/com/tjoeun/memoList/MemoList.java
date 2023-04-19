package com.tjoeun.memoList;

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
		return "MemoList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
//	 ▼ memoMain클래스에서 입력받은 내용을 memoList라는 arrayList에서 받아 리스트에 추가
	public void addMemo(MemoVO vo) {
		memoList.add(vo);  
	}

	
	
}
