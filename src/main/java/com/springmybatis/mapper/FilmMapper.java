package com.springmybatis.mapper;

import com.springmybatis.po.Film;

public interface FilmMapper {

	//向film表中插入(title,description,language_id)
	//返回插入的记录数目
	public int insertIntoFilm(Film film) throws Exception;

}
