package com.java.designpattern.behavioral.state;

import java.util.ArrayList;
import java.util.List;

public class FanChain {
List<State> states;//= new ArrayList<State>();

int  currentstate;


public FanChain()
{
	 states= new ArrayList<State>();
	
	states.add(new Off());
	states.add(new LowSpeed());
	states.add(new MediumSpeed());
	states.add(new HighSpeed());
	
	currentstate=0;
}


void pullChain()
{
	states.get(currentstate).pullChain(this);
}

public void setCurrentState(int s)
{
	currentstate=s;
}
}
