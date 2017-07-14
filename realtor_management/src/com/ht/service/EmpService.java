package com.ht.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.Dept;
import com.ht.domain.Emp;
import com.ht.domain.PageBean;

public interface EmpService {

	PageBean<Emp> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria);

	void save(Emp emp);

	Emp findById(Long emp_id);

	void delete(Emp emp);

	void update(Emp emp);

	List<Emp> findAll();
}
