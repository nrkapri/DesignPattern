package com.java.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreCalculator {

	long score ;
	List<ScoreDisplays>  displays = new ArrayList<ScoreDisplays>();
	
	public void updateScore(int run)
	{
		score+=run;
		
		for(ScoreDisplays sd : displays)
		{
			sd.updateScore(score);
		}
	}
	
	void subscriber(ScoreDisplays sd)
	{
		displays.add(sd);
	}
	
	void unsubscriber(ScoreDisplays sd)
	{
		displays.remove(sd);
	}
	
	
}
