package FileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TextFileReadTest2 {

	public static void main(String[] args) {
		
Scanner scanner = null;  
		String filepath = "./src/FileTest/input.txt";
		
		try {
		scanner = new Scanner(new File(filepath));
		while (scanner.hasNextLine()) {   
			String str = scanner.nextLine().trim();
			System.out.println(Arrays.toString(str.split(" ")));
	
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
