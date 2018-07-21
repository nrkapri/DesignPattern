package com.java.designpattern.behavioral.chainofresponsibility;

public class ChainOfResponsibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CEO ceo= new CEO();
		LineManager lm = new LineManager();
		Manager m= new Manager();
		
		m.setSuccessor(lm);
		lm.setSuccessor(ceo);
		
		System.out.println(m.processRequest(new ApprovalRequest(600,"Nayan")).toString());
		System.out.println(m.processRequest(new ApprovalRequest(6000,"Prajakta")).toString());
	}

}
