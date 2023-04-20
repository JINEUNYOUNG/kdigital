
package com.tjoeun.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MemoList {

	private ArrayList<MemoVO> memoList = new ArrayList<>();
	{
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
		if (memoList.size() == 0) {
			str += "저장된 메모가 없습니다.\n";
		} else {
			for (int i = 0; i < memoList.size(); i++) {
				str += memoList.get(memoList.size() - 1 - i) + "\n";
			}
		}
		return str;
	}

	public void addMemo(MemoVO vo) {
		memoList.add(vo);
	}

	public MemoVO selectMemo(int idx) {
		try { // 예외처리
			return memoList.get(idx - 1);
		} catch (Exception e) { // exception 오류가 뜨면 널값 (catch안에 넣어줄것)
			return null; // ←←←←←←← try랑 catch 각각 return 필요함!
		}
	}

	public void deleteMemo(int idx) {
		memoList.remove(idx - 1);

		for (int i = 0; i < memoList.size(); i++) {
			memoList.get(i).setIdx(i + 1);
		}
		MemoVO.count = memoList.size();

	}

	public void updateMemo(int idx, String memo) {
		memoList.get(idx - 1).setMemo(memo);
	}

	public void writeMemo(String filename) {
		// memolist arraylist에 저장된 데이터를 텍스트 파일로 출력하는 메소드
		PrintWriter printWriter = null; // 선언만 하면 없어도 만들어서 함!

		// 1. 텍스트파일의 경로와 이름을 연결
		String filepath = String.format("./src/com/tjoeun/%s.txt", filename); // 상대경로!
//			C:\\k_digital\\workspace\\k20230420\\src\\com\\tjoeun 					//절대경로!
		System.out.println(filepath);
//			ArrayList에 저장된 데이터를 텍스트 파일로 출력한다.
//			일반 for

		try {
			printWriter = new PrintWriter(filepath);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");  //하면 str이 됨

			for (int i = 0; i < memoList.size(); i++) {
				MemoVO vo = memoList.get(i);
//				String str = "";
//				str += vo.getIdx() + " ";
//				str += vo.getName().replace(" ", "`") + " "; // 공백으로 구분하기 위해 이외에는 공백이 만들지 않기 위해
//				str += vo.getPassword() + " ";
//				str += vo.getMemo().replace(" ", "`") + " ";
//				str += sdf.format(vo.getWriteDate());
				String str = String.format("%d %s %s %s %s",vo.getIdx(),
						vo.getName().replace(" ","`"), vo.getPassword(),
						vo.getMemo().replace(" ","`"), sdf.format(vo.getWriteDate()));
				printWriter.write(str+"\n");

			}
			System.out.println("파일로 저장완료");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		} finally {
			if (printWriter != null) {
				printWriter.close();
			}
		}

	}

	public void readMemo(String filename) {
		
		Scanner scanner = null;
		String filepath = String.format("./src/com/tjoeun/%s.txt", filename); // 상대경로!
		
		try { 
			scanner = new Scanner(new File(filepath));   //try 안에서는 새로 생성해줘야댐
			while (scanner.hasNextLine()) {		//지금은 줄단위로 읽어야함! 
//				텍스트 파일에서 1줄을 읽는다. 
				String str = scanner.nextLine().trim();
//				System.out.println(str);
//				읽어들인 데이터를 공백을 경계로 읽어서 각각의 변수에 저장한다.
				Scanner scan = new Scanner(str);     //while안에서 다시 생성
				int idx = scan.nextInt();
				String name = scan.next().replace("`", " ");		//이미 공백을 기준으로 나눠놨으니까 `를 다시 공백으로
				String password = scan.next();
				String memo = scan.next().replace("`", " ");
				String temp = scan.nextLine().trim();
				
//	==========텍스트 파일에서 읽어들인 날짜는 str이 되었으므로 다시 날짜 데이터로 변환 (date 클래스객체를 사용)
				
//				int year = Integer.parseInt(temp.substring(0,4));
//				int month = Integer.parseInt(temp.substring(5,7));
//				int day = Integer.parseInt(temp.substring(8,10));
//				int hour = Integer.parseInt(temp.substring(8,10));
//				int minute = Integer.parseInt(temp.substring(8,10));
//				int second = Integer.parseInt(temp.substring(8,10));
//				▲ 아~~~~~하나씩 가져오기 너무 번잡하다 ▼ 구분자로 나눠보자
				
//				그러나 split() 메소드의 구분자를 .으로 지정하면 제대로 동작하지않는다.
//				① 대신에 \\.
//				String[] date = temp.split("\\.");
				
//				② 대신에[.]
				String[] date = temp.split("[.]");
				
				int year = Integer.parseInt(date[0])-1900;
				int month = Integer.parseInt(date[1])-1;
				int day = Integer.parseInt(date[2]);
				int hour = Integer.parseInt(date[3]);
				int minute = Integer.parseInt(date[4]);
				int second = Integer.parseInt(date[5]);
				
//				System.out.println(Arrays.toString(date));
					
				Date writeDate = new Date(year, month, day, hour, minute, second);
//				System.out.println(writeDate);
				
				
//	===========ArrayList에 저장하기 위해 MemoVO 클래스 객체를 만들어 넣어준다.
				MemoVO vo = new MemoVO(idx, name, password, memo, writeDate);  //▶VO로 가서 source > 생성자만들기
				System.out.println(vo);			
				
//				Memo 클래스 객체에 저장된 데이터를 memoList ArrayList에 저장한다.
				memoList.add(vo);
			}
			System.out.println(filename + ".txt 파일에서 읽기완료!!");
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		}
		// 텍스트파일에서 가져온 데이터를 memoList arraylist에 저장하는 메소드

	}

}
