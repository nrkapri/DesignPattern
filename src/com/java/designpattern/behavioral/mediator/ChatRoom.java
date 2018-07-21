package com.java.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	
	List<User> usr = new ArrayList<User>();
	
	public void addUser(User user)
	{
		usr.add(user);
	}
	
	

	public void sendMessage(User source, User target, String msg) {
		// TODO Auto-generated method stub
		while(true) {
			if(target.isAvailable())
			{
				target.recieveMessages(msg);
				break;
			}
			else
			{
				System.out.println(target.name+" is not available.");
			}
		}
		
	}

}
