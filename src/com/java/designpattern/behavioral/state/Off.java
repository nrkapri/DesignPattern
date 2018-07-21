package com.java.designpattern.behavioral.state;

public class Off extends State {

	@Override
	public void pullChain(FanChain fanChain) {
		// TODO Auto-generated method stub
		System.out.println("Off -> Low Speed" );
		fanChain.setCurrentState(1);
	}

}
