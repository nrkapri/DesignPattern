package com.java.designpattern.behavioral.command;

public class Politician implements Command {
	String name= "Politician";
	@Override
	public String toString() {
		return "Politician [name=" + name + "]";
	}
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(" steal public's money ");
	}

}
