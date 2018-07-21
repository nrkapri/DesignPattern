package com.java.designpattern.behavioral.mediator;

public class MediatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User nayan = new User("Nayan",   "0123456789");
		User nayan1 = new User("Nayan1", "9876543210");
		
		ChatRoom cr= new ChatRoom();
		
		nayan.setChatRoom(cr);
		
		nayan1.setChatRoom(cr);
		
		nayan.sendMessage(nayan1, "Hello");
		nayan1.sendMessage(nayan, "Ola");
		nayan.sendMessage(nayan1, "hi");
		nayan1.sendMessage(nayan, "hi");
		nayan.sendMessage(nayan1, "what ");
		nayan1.sendMessage(nayan, "why");
		nayan.sendMessage(nayan1, "how");
		nayan1.sendMessage(nayan, "where");
		nayan.sendMessage(nayan1, "when");
		nayan1.sendMessage(nayan, "ok");
		
		nayan.printAllMessages();
		nayan1.printAllMessages();
		
	}

}
