package com.ht.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.dao.SalaryDao;
import com.ht.domain.PageBean;
import com.ht.domain.Salary;

@Transactional
public class SalaryServiceImpl implements SalaryService {

	private SalaryDao salaryDao;
	public void setSalaryDao(SalaryDao salaryDao) {
		this.salaryDao = salaryDao;
	}
	@Override
	public PageBean<Salary> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria) {
		return salaryDao.findByPage(pageCode, pageSize, criteria);
	}
	@Override
	public void save(Salary salary) {
		salaryDao.save(salary);
	}
	@Override
	public Salary findById(Long salary_id) {
		return salaryDao.findById(salary_id);
	}
	@Override
	public void delete(Salary salary) {
		salaryDao.delete(salary);
	}
	@Override
	public void update(Salary salary) {
		salaryDao.update(salary);
	}
	@Override
	public List<Salary> findAll() {
		return salaryDao.findAll();
	}
	
}
