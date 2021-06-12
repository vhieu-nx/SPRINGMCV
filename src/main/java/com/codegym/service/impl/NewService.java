package com.codegym.service.impl;

import com.codegym.dao.INewDAO;
import com.codegym.model.NewModel;
import com.codegym.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;
	
	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}
}
