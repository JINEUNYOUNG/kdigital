package com.tjoeun.score;

public class ScoreMain {
	
	public static void main(String[] args) {
	
		/*
		ScoreVO score1 = new ScoreVO();
		ScoreVO score2 = new ScoreVO();
		ScoreVO score3 = new ScoreVO();
		
		System.out.println("score1.count: "+score1.count);
		score2.count = 100;
		System.out.println("score2.count: "+score2.count);
//		static변수는 현재 클래스로 생성하는 모든 객체에서 공유하므로 score3과 1의 count도 100이됨.
		System.out.println("score3.count: "+score3.count);
		System.out.println("score1.count: "+score1.count);
		System.out.println("score1.count: "+ScoreVO.count);
		*/
		ScoreVO score1 = new ScoreVO("조승연",10,100,1);
		ScoreVO score2 = new ScoreVO("정진영",100,99,100);
		ScoreVO score3 = new ScoreVO("서자윤",100,100,97);
		ScoreVO score4 = new ScoreVO("김진희",98,100,100);
		ScoreVO score5 = new ScoreVO("조은영",90,100,100);

//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
	
		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(score1);
		scoreList.addScore(score2);
		scoreList.addScore(score3);
		scoreList.addScore(score4);
		scoreList.addScore(score5);
		
		System.out.println(scoreList);
		
	}

}
