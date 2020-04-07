package com.itguigu.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itguigu.springcloud.bean.Movie;
import com.itguigu.springcloud.dao.MovieDao;
import com.itguigu.springcloud.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieDao movieDao;
	
	@Override
	public Movie getMovieById(Integer id) {
		return movieDao.getMovieById(id);
	}

}
