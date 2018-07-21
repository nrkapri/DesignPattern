package com.java.designpattern.behavioral.state;

public class LowSpeed extends State {

	@Override
	public void pullChain(FanChain fanChain) {
		// TODO Auto-generated method stub
		System.out.println("Low Speed ->  Medium Speed" );
		fanChain.setCurrentState(2);
	}



}
