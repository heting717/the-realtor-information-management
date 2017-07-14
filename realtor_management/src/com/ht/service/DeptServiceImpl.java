package com.ht.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.dao.DeptDao;
import com.ht.domain.Dept;
import com.ht.domain.PageBean;

@Transactional
public class DeptServiceImpl implements DeptService {

	private DeptDao deptDao;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	@Override
	public PageBean<Dept> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria) {
		return deptDao.findByPage(pageCode, pageSize, criteria);
	}
	@Override
	public void save(Dept dept) {
		deptDao.save(dept);
	}
	@Override
	public Dept findById(Long dept_id) {
		return deptDao.findById(dept_id);
	}
	@Override
	public void delete(Dept dept) {
		deptDao.delete(dept);
	}
	@Override
	public void update(Dept dept) {
		deptDao.update(dept);
	}
	@Override
	public List<Dept> findAll() {
		return deptDao.findAll();
	}
	
	
}
