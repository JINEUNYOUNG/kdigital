package k20230412;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		

		String str = "     tjoeunit     ";
		
		str = "123-45678-12345)";
		String code = str.substring(3,10); //3~9번째 글자까지 나옴 
				
		String newCode = str.substring(0, str.indexOf("-")+1);
		for (int i=0; i<code.length(); i++) {
			newCode += "*"; 
			
			
		}
		
		newCode += str.substring(str.lastIndexOf("-"));
		
		System.out.println(newCode);
		
		String[] newCode2 = str.split("-");  //str을 -로 나눈 배열이 newcodfe2다 
		System.out.println(Arrays.toString(newCode2));
		
		
	}

}
