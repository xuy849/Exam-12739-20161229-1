package com.springmybatis.service.imp;

import org.springframework.stereotype.Service;

import com.springmybais.service.FilmService;
import com.springmybatis.mapper.FilmMapper;
import com.springmybatis.po.Film;
import com.springmybatis.util.Util;

@Service
public class FilmServiceImp implements FilmService{

	//向film表中插入(title,description,language_id)
	//返回插入的记录数目
	public int insertIntoFilm(String title, String description, int language_id) throws Exception {
		// TODO Auto-generated method stub
				
		//
		Film film = new Film();	
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
		
		//
		FilmMapper filmMapper = Util.getFilmMapper();
		int a = filmMapper.insertIntoFilm(film);
			
		return a;
	}

}
