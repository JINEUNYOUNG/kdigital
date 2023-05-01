package com.tjoeun.onLinePoll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PollRead {

	//텍스트파일의 내용을 읽어서 ArrayList에 저장 후 리턴하는 메소드
	public static ArrayList<String> pollread (String filepath) {
		
		ArrayList<String> poll = null;
		Scanner scanner = null;
		
		
		

		try {
			scanner = new Scanner(new File(filepath));
			poll = new ArrayList<>();
		
			while (scanner.hasNextLine()) { // 읽어들일 데이터가 있는 동안 반복한다.
				
				String str = scanner.nextLine().trim();
				
				if (str.length() != 0) {
					poll.add(str);
					System.out.println(str);
				}
				
			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 경로가 잘못되었거나 파일이 존재하지 않습니다.");
		}
		
		return poll;
		
	
	
		
	}
	}

	
	
