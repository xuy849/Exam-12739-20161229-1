package com.springmybatis.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmybais.service.FilmService;
import com.springmybatis.mapper.FilmMapper;

public class Util {
	private static ApplicationContext applicationContext;
	
	public static ApplicationContext getApplicationContext(){
		if(applicationContext==null)
			applicationContext = new ClassPathXmlApplicationContext(Constant.BEANS_PATH);
		return applicationContext;
	}
	
	public static FilmMapper getFilmMapper(){
		if(applicationContext==null)
			applicationContext = Util.getApplicationContext();
		
		return (FilmMapper) applicationContext.getBean("filmMapper");
	}
	
	public static FilmService getFilmService(){
		if(applicationContext==null)
			applicationContext = Util.getApplicationContext();
		
		return (FilmService)applicationContext.getBean("filmServiceImp");
	}
}
