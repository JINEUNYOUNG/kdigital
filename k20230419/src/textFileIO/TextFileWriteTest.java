package textFileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriteTest {

	public static void main(String[] args) {
		
		Scanner scanner = null; 			//키보드 입력에 사용할 Scanner
		PrintWriter printWriter = null;		//텍스트 파일로 출력에 사용할 PrintWriter  ▶1.선언! 사라지지않음
		
//		경로 지정방법식은 1. 절대경로 지정방식 2. 상대경로 지정방식
//		1. 절대경로는 작업중인 파일이 위치한 디스크 드라이브의 최상위(root) 폴더(디렉토리)
//		2. 상대경로는 작업중인 파일이 위치한 폴더(".")
		
		
		try {
			printWriter = new PrintWriter("a.txt");    								//▶ 2.생성..! 
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 경로가 잘못되었거나 디스크에 파일이 존재하지 않습니다.");
	}
}

}