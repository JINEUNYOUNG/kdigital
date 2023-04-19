package FileTest;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReadTest {

	public static void main(String[] args) {
		
		Scanner scanner = null;  //new로 바로 생성안하고
		
		String filepath = "./src/FileTest/out.txt";
		
		try {
		
//		scanner 클래스 객체를 만들때 생성자로 "system.in"을 넘겨주면 키보드로 입력받는 스캐너가
//		만들어졌지만 파일의 경로와 이름을 이용해 생성한 file 클래스 객체를 넘겨주면 
//		파일에서 내용을 읽어들일 수 있다.
//		File file = new File(filepath);
//		scanner = new scanner(file);
		scanner = new Scanner(new File(filepath));
			
//		텍스트 파일에서 더 이상 읽어들일 데이터(줄)이 없을 때 까지 반복하며 읽어들인다.		
		while (scanner.hasNextLine()) {   //읽어들일 데이터가 있는 동안만 반복한다.
//		hasNextLine : 스캐너에 지정된 파일에서 읽어들일 다음 데이터가 있으면 true 
			
			String str = scanner.nextLine(); 
			if (str.length() != 0) {
				System.out.println(str);
			}
			
		
			}
		System.out.println("텍스트파일에서 읽기완료");
				
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일경로가 잘못되거나 파일이 존재하지 않습니다.");
	    } finally { 
		if (scanner != null) {
				scanner.close();
			}
		}
			
			
	}
}
