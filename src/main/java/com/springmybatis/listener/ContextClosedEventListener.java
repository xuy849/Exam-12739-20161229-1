package com.springmybatis.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent>{

	public void onApplicationEvent(ContextClosedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Context stop");
	}


}
