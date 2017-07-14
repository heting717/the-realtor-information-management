package com.ht.service;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.Expend;
import com.ht.domain.Income;
import com.ht.domain.PageBean;

public interface ExpendService {

	PageBean<Expend> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria);

	void save(Expend expend);

	Expend findById(Long expend_id);

	void update(Expend expend);

	void delete(Expend expend);
}
