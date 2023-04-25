package demonThreadTest;

import threadTest.BGMThread;

public class GameThread {

	public static void main(String[] args) {

		
		BGMThread bgm = new BGMThread();
		Thread thread = new Thread(bgm);
		thread.setDaemon(true);
		thread.start();
		
	
		
	for (int i=0; i<10; i++) {
		System.out.println("신나게 게임 하는 중......");
		
		if (i==7) {
			System.out.println("앗 엄마다");
			System.out.println("게임을 종료합니다..");

			break;
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	}
	
}
