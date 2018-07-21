package com.java.designpattern.behavioral.mediator;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class User {

	String name;

	String mobileno;

	List<String> messages = new LinkedList<String>();
	
	ChatRoom cr ;
	
	public void setChatRoom(ChatRoom c)
	{
		cr=c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public boolean isAvailable()
	{
		Random r=new Random();
		return r.nextBoolean();
	}

	public void sendMessage(User usr,String ms)
	{
	String msg= "message from  :"+name+",to:"+usr.getName()+":"+ms;
		cr.sendMessage(this,usr,msg);
	}

	public void  recieveMessages(  String msg)
	{
		messages.add(msg);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", mobileno=" + mobileno + "]";
	}
	
	public void printAllMessages()
	{
		for (String s: messages)
		{
			System.out.println(s);
		}
	}

	public User(String name, String mobileno) {
		super();
		this.name = name;
		this.mobileno = mobileno;
	}

}
