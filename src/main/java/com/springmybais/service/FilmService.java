package com.springmybais.service;

public interface FilmService {
	
	////向film表中插入(title,description,language_id)
	//返回插入的记录数目
	
	public int insertIntoFilm(String title,String description,int language_id) throws Exception;
	
}
