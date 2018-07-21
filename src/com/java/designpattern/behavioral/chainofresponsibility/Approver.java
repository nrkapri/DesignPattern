package com.java.designpattern.behavioral.chainofresponsibility;

public abstract class Approver {

	String role;
	Approver successor;
	
	Approver(String role )
	{
		this.role= role;
	}
	
	protected int  getAllowable()
	{
		if(role.equals("Manager"))
		{
			return  100;
		}
		else if (role.equals("LineManager"))
		{
			return 1000;
		}
		else if(role.equals("CEO"))
		{
			return 10000;
		}
		return 0;
			
	}
   
    
    
    public void setSuccessor (Approver successor)
    {
    	this.successor=successor;
    }

	
	public ApprovalRequest processRequest(ApprovalRequest request)
	{
		if (request.getCost()<=getAllowable())
		{
			return request.approve(role);
		}
		else if (successor !=null)
		{
			return successor.processRequest(request);
		}
		return request;
		
	}
	
} 
