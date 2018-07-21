package com.java.designpattern.behavioral.chainofresponsibility;

public class ApprovalRequest {
int cost ;
String status ;
String approvedby;
String requester ;




public ApprovalRequest(int cost ,String r)
{
	this.cost=cost;
	requester=r;
	status="initiated";
}





public int getCost() {
	return cost;
}





public void setCost(int cost) {
	this.cost = cost;
}





public String getStatus() {
	return status;
}





public void setStatus(String status) {
	this.status = status;
}





public String getApprovedby() {
	return approvedby;
}





public void setApprovedby(String approvedby) {
	this.approvedby = approvedby;
}





public String getRequester() {
	return requester;
}





public void setRequester(String requester) {
	this.requester = requester;
}





public ApprovalRequest approve(String a)
{
	approvedby=a;
	status="Approved";
	
	return this;
	
}





@Override
public String toString() {
	return "ApprovalRequest [cost=" + cost + ", status=" + status + ", approvedby=" + approvedby + ", requester="
			+ requester + "]";
}


}
