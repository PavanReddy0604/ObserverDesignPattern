package com.youtubeandsubscriber;

public interface YoutubeChannel {
	
	void subscribe(Observer sub);
	void unSubscribe(Observer sub);
	void notifySubscriber(String reason);
	
	

}
