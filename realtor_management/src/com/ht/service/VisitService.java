package com.ht.service;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.PageBean;
import com.ht.domain.Visit;

public interface VisitService {

	PageBean<Visit> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);

	void save(Visit visit);

}
