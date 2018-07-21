package com.java.designpattern.behavioral.command;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoker inv = new Invoker();
		
		inv.storeAndExecute(new Police());
		inv.storeAndExecute(new Politician());
		inv.storeAndExecute(new Programmer());
		
		
		inv.printHistory();
	}

}
