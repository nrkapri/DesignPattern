package com.java.designpattern.behavioral.template;

public abstract class BaseWorker {
abstract public void getup();
abstract public void haveBreakFast();
abstract public void gotoWork();
abstract public void work();
abstract public void gobakHome();
abstract public void sleep();
public void wakeup() {
	// TODO Auto-generated method stub
	getup();
	haveBreakFast();
	gotoWork();
	work();
	gobakHome();
	sleep();
}
}
