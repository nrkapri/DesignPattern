package com.java.designpattern.behavioral.observer;

public class ObserverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreDisplays g = new GroundScoreBoard();
		ScoreDisplays w = new WebsiteScoreBoard();
		ScoreDisplays m = new MobileScoreBoard();
		
		ScoreCalculator sc = new ScoreCalculator();
		
		sc.subscriber(g);
		sc.subscriber(w);
		sc.subscriber(m);

		
		sc.updateScore(4);
		sc.updateScore(6);
		sc.updateScore(1);
		sc.updateScore(2);
		sc.updateScore(6);
		sc.updateScore(4);
		sc.updateScore(3);
		
		sc.unsubscriber(m);
		
		sc.updateScore(4);
		sc.updateScore(6);
		sc.updateScore(1);
		sc.updateScore(2);
		sc.updateScore(6);
		sc.updateScore(4);
		sc.updateScore(3);
		
		
		
	}

}
