package com.java.designpattern.behavioral.state;

public class StatePatternTest {

	public static void main(String[] args)
	{
		FanChain fc = new FanChain();
		
		for (int i=0;i<100;i++)
			fc.pullChain();
	}
}
