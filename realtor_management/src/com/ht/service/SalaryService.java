package com.ht.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.PageBean;
import com.ht.domain.Salary;

public interface SalaryService {

	PageBean<Salary> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria);

	void save(Salary salary);

	Salary findById(Long salary_id);

	void delete(Salary salary);

	void update(Salary salary);

	List<Salary> findAll();

}
