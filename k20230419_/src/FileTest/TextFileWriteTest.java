package FileTest;

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
		
//		String filepath = "C:/k_digital/workspace/k20230414/d.txt";
		String filepath = "./src/textFileIO/1.txt";
		
		try {
			printWriter = new PrintWriter(filepath);    								//▶ 2.생성..! 
			scanner = new Scanner(System.in);
//			QUIT가 입력될 때까지 반복하며 입력한 데이터를 파일에 저장
			
		while (true) {
			System.out.println(">>> ");
			String str = scanner.nextLine().trim();
			
			if (str.toUpperCase().equals("QUIT")) {
				break;
				
			}
		
//			키보드로 입력받은 내용을 텍스트 파일에 저장한다.
//			write() 메소드로 PrintWriter 클래스 객체로 생성한 파일에 출력한다.
			printWriter.write(str + "\n");   //\n을 넣었음에도 불구하고 줄바꿈이 안된다면 \r\n
			
		}	
		
			System.out.println("텍스트파일로 저장완료");
		
		catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 경로가 잘못되었거나 디스크에 파일이 존재하지 않습니다.");
	} 	  finally {
		  if (printWriter != null) {
			  printWriter.close();
		  }
//			출력 파일은 출력 작업이 완료되면 반드시 파일을 닫아야한다.
	}
}
	
}