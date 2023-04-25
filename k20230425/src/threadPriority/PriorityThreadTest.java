package threadPriority;

import java.awt.Robot;

import threadTest.PriorityThread;

public class PriorityThreadTest {
	
	public static void main(String[] args) {
		/*
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY); 
	
	PriorityThread pt1 = new PriorityThread();
	PriorityThread pt2 = new PriorityThread();
	PriorityThread pt3 = new PriorityThread();
	
	pt1.setPriority(Thread.MAX_PRIORITY);
	pt2.setPriority(Thread.NORM_PRIORITY);
	pt3.setPriority(Thread.MIN_PRIORITY);
	
	pt1.start();
	pt2.start();
	pt3.start();
	*/
	
		
	for (int i=Thread.MIN_PRIORITY; i<=Thread.MAX_PRIORITY; i++) {
		PriorityThread pt = new PriorityThread();
		if (i == 5) {
			pt.setPriority(Thread.MAX_PRIORITY);
		} else {
			pt.setPriority(Thread.MIN_PRIORITY);
		}
		
		
		pt.start();
	}
	
		
	
	
		
	}

}
