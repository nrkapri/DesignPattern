package com.java.designpattern.behavioral.command;

public class Programmer implements Command {

	String name= "Programmer";
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("sell the bugs ");
	}
	@Override
	public String toString() {
		return "Programmer [name=" + name + "]";
	}

}
