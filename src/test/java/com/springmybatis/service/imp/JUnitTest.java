package com.springmybatis.service.imp;

import org.junit.Before;
import org.junit.Test;

import com.springmybatis.util.Util;

public class JUnitTest {
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void insertIntoFilmTest(){
		try {
			int a = Util.getFilmService().insertIntoFilm("xxxx", "111", 2);
			
			System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
