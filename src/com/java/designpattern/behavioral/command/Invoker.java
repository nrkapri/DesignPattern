package com.java.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
List<Command>  history = new ArrayList<Command>();


public void storeAndExecute(Command c)
{
	history.add(c);
	c.execute();
}


public void printHistory() {
	// TODO Auto-generated method stub
	System.out.println("History:");
	for (Command c : history )
	{
		System.out.println(c.toString());
	}
}

}
