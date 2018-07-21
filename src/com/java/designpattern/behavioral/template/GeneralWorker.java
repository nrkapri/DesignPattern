package com.java.designpattern.behavioral.template;

public abstract class GeneralWorker extends BaseWorker {

	@Override
	public void getup() {
		// TODO Auto-generated method stub
		System.out.println("GeneralGetup");
	}

	@Override
	public void haveBreakFast() {
		// TODO Auto-generated method stub
		System.out.println("General breakfast");
	}

	@Override
	public void gotoWork() {
		// TODO Auto-generated method stub
		System.out.println("general goto work");
	}

	@Override
	abstract public void work() ;

	@Override
	public void gobakHome() {
		// TODO Auto-generated method stub
		System.out.println("general goback home");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("general sleep");

	}

}
