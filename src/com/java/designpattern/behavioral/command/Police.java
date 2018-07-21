package com.java.designpattern.behavioral.command;

public class Police implements Command {

	String name= "Police";
	@Override
	public String toString() {
		return "Police [name=" + name + "]";
	}
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("take bribe ");
	}

}
