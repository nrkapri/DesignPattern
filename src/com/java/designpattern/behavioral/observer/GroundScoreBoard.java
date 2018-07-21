package com.java.designpattern.behavioral.observer;

public class GroundScoreBoard implements ScoreDisplays {

	@Override
	public void updateScore(long score) {
		// TODO Auto-generated method stub
		System.out.println("GroundScoreBoard:"+ score);
	}

}
