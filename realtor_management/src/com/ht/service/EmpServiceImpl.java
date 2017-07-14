package com.ht.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.dao.EmpDao;
import com.ht.domain.Dept;
import com.ht.domain.Emp;
import com.ht.domain.PageBean;

@Transactional
public class EmpServiceImpl implements EmpService {

	private EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public PageBean<Emp> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria) {
		return empDao.findByPage(pageCode, pageSize, criteria);
	}

	@Override
	public void save(Emp emp) {
		empDao.save(emp);
	}

	@Override
	public Emp findById(Long emp_id) {
		return empDao.findById(emp_id);
	}

	@Override
	public void delete(Emp emp) {
		empDao.delete(emp);
	}

	@Override
	public void update(Emp emp) {
		empDao.update(emp);
	}

	@Override
	public List<Emp> findAll() {
		return empDao.findAll();
	}


	
}
