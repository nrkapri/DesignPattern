package com.java.designpattern.behavioral.state;

public class MediumSpeed extends State {

	@Override
	public void pullChain(FanChain fanChain) {
		// TODO Auto-generated method stub
		System.out.println("Medium Speed ->  High Speed" );
		fanChain.setCurrentState(3);
	}

}
