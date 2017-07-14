package com.ht.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.dao.BaseDao;
import com.ht.domain.Dept;
import com.ht.domain.PageBean;

public interface DeptService{

	PageBean<Dept> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria);

	void save(Dept dept);

	Dept findById(Long dept_id);

	void delete(Dept dept);

	void update(Dept dept);

	List<Dept> findAll();
}
