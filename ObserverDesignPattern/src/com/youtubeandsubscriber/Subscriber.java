package com.youtubeandsubscriber;

public class Subscriber implements Observer{
	
	String name;
	
	
	public String getName() {
		return name;
	}
	public Subscriber(String name) {
		this.name=name;
	}
	@Override
	public void Notified(String reason,String channelName) {
		System.out.println("from "+channelName+" : -->  Hey "+this.name+" "+reason);
		
	}
	
	

}
