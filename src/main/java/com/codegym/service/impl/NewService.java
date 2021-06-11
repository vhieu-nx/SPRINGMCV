package com.codegym.service.impl;

import com.codegym.dao.ICategoryDAO;
import com.codegym.dao.INewDAO;
import com.codegym.model.CategoryModel;
import com.codegym.model.NewModel;
import com.codegym.paging.Pageble;
import com.codegym.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
@Service
public class NewService implements INewService {
	@Autowired
	private INewDAO newDao;

//	@Override
//	public List<NewModel> findByCategoryId(Long categoryId) {
//		return newDao.findByCategoryId(categoryId);
//	}
//
//	@Override
//	public NewModel save(NewModel newModel) {
//		newModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
//		CategoryModel category = categoryDAO.findOneByCode(newModel.getCategoryCode());
//		newModel.setCategoryId(category.getId());
//		Long newId = newDao.save(newModel);
//		return newDao.findOne(newId);
//	}
//
//	@Override
//	public NewModel update(NewModel updateNew) {
//		NewModel oldNew = newDao.findOne(updateNew.getId());
//		updateNew.setCreatedDate(oldNew.getCreatedDate());
//		updateNew.setCreatedBy(oldNew.getCreatedBy());
//		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
//		CategoryModel category = categoryDAO.findOneByCode(updateNew.getCategoryCode());
//		updateNew.setCategoryId(category.getId());
//		newDao.update(updateNew);
//		return newDao.findOne(updateNew.getId());
//	}
//
//	@Override
//	public void delete(long[] ids) {
//		for (long id: ids) {
//			//1.delete comment (khoa ngoai new_id)
//			//2.delete news
//			newDao.delete(id);
//		}
//	}

	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}

//	@Override
//	public int getTotalItem() {
//		return newDao.getTotalItem();
//	}
//
//    @Override
//    public NewModel findOne(long id) {
//		NewModel newModel = newDao.findOne(id);
//		CategoryModel categoryModel = categoryDAO.findOne(newModel.getCategoryId());
//		newModel.setCategoryCode(categoryModel.getCode());
//        return newModel;
//    }

}
