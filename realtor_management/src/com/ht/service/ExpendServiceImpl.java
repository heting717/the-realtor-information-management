package com.ht.service;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.dao.ExpendDao;
import com.ht.domain.Expend;
import com.ht.domain.PageBean;

public class ExpendServiceImpl implements ExpendService {

	private ExpendDao expendDao;
	public void setExpendDao(ExpendDao expendDao) {
		this.expendDao = expendDao;
	}
	@Override
	public PageBean<Expend> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria) {
		return expendDao.findByPage(pageCode, pageSize, criteria);
	}
	@Override
	public void save(Expend expend) {
		expendDao.save(expend);
	}
	@Override
	public Expend findById(Long expend_id) {
		return expendDao.findById(expend_id);
	}
	@Override
	public void update(Expend expend) {
		expendDao.update(expend);
	}
	@Override
	public void delete(Expend expend) {
		expendDao.delete(expend);
	}
	
	
}
