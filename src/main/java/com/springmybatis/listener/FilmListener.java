package com.springmybatis.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

import com.springmybatis.event.AfterInsertFilmEvent;
import com.springmybatis.event.BeforeInsertFilmEvent;

public class FilmListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		if(event instanceof BeforeInsertFilmEvent){
			//输出 Before Insert Film Data.
			System.out.println("Before Insert Film Datas");
		}
		if(event instanceof AfterInsertFilmEvent){
			//输出 After Insert Film Data.
			System.out.println("After Insert Film Data");
		}
		if(event instanceof ContextRefreshedEvent){
			System.out.println("Context Start");
		}
		if(event instanceof ContextClosedEvent){
			System.out.println("Context stop");
		}
	}

}
