package com.java.designpattern.behavioral.state;

public class HighSpeed extends State {

	@Override
	public void pullChain(FanChain fanChain) {
		// TODO Auto-generated method stub
		System.out.println("High Speed ->  Off Speed" );
		fanChain.setCurrentState(0);
	}

}
