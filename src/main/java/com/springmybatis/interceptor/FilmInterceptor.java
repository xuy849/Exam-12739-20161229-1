package com.springmybatis.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.springmybatis.event.AfterInsertFilmEvent;
import com.springmybatis.event.BeforeInsertFilmEvent;
import com.springmybatis.util.Util;

public class FilmInterceptor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		//publish Spring的事件 的事件 的事件 BeforeInsertFilmEvent
		BeforeInsertFilmEvent beforeInsertFilmEvent=new BeforeInsertFilmEvent("BeforeInsertFilmEvent");
		Util.getApplicationContext().publishEvent(beforeInsertFilmEvent);
		
		//
		Object result=invocation.proceed();
		
		//publish Spring的事件 AfterInsertFilmEvent.
		AfterInsertFilmEvent afterInsertFilmEvent=new AfterInsertFilmEvent("AfterInsertFilmEvent");
		Util.getApplicationContext().publishEvent(afterInsertFilmEvent);
		
		return result;
	}

}
