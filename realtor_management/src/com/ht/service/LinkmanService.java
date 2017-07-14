package com.ht.service;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.Linkman;
import com.ht.domain.PageBean;

public interface LinkmanService {

	PageBean<Linkman> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);

}
