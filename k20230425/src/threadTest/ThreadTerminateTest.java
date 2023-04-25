package threadTest;

import java.util.Scanner;

public class ThreadTerminateTest {
	
	
	public static void main(String[] args) {
		
	ThreadTerminate terminateA = new ThreadTerminate("A");
	System.out.println(terminateA.getName());
	ThreadTerminate terminateB = new ThreadTerminate("B");
	System.out.println(terminateB.getName());
	ThreadTerminate terminateC = new ThreadTerminate("C");
	System.out.println(terminateC.getName());
	
	terminateA.start();
	terminateB.start();
	terminateC.start();
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("스레드 종료하기");
	
	while (true) {
		char ch = scanner.nextLine().charAt(0);
		if (ch == 'A') {
			terminateA.setFlag(false);
		
		} else if (ch == 'B') {
				terminateB.setFlag(false);
				
				
		} else if (ch == 'C') {
			terminateC.setFlag(false);
			
			
		} else if (ch == 'M') {
			terminateA.setFlag(false);
			terminateB.setFlag(false);
			terminateC.setFlag(false);
			break;
		}
		
	}
	}

}
