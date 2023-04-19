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
			
			int i = 0;
			boolean b = false;
			double d=0;
			String s="";
			
//			String 변수에 저장된 문자열을 읽어들이는 스캐너
//			스캐너 클래스의 객체를 만들때 생성자의 인수로 스트링 변수를 넘기면			
//			스트링에 저장된 데이터를 읽음
			Scanner scan = new Scanner(str);
			
			//★★★★★while이 안돌아가면 i가 초기화되지않는다 ↖↖↖위에서 초기화 시켜줄것 
			while (scan.hasNext()) {    //다음 데이터 있니? 공백을 경계로 
				if (scan.hasNextInt()) {   //스캐너로 읽을 데이터가 int면 true 아니면 false
					i = scan.nextInt();
				} else if (scan.hasNextBoolean()) {
					b = scan.nextBoolean();
				} else if (scan.hasNextDouble()) {
					d = scan.nextDouble();
				} else {s = scan.next();}
			} //이 형식이 맞는지 물어보면서 뱅뱅 돌아감. !
	
			System.out.println("i: "+i);
			System.out.println("b: "+b);
			System.out.println("d: "+d);
			System.out.println("s: "+s);
		}
			System.out.println("텍스트파일에서 읽기완료");
				
				
			}
		catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("파일경로가 잘못되거나 파일이 존재하지 않습니다.");
		    } finally { 
			if (scanner != null) {
				scanner.close();
			}
		}
		
	}
}
