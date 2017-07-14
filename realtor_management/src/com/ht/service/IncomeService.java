package com.ht.service;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.Income;
import com.ht.domain.PageBean;

public interface IncomeService {

	PageBean<Income> findByPage(Integer pageCode, Integer pageSize,
			DetachedCriteria criteria);

	void save(Income income);

	void delete(Income income);

	Income findById(Long income_id);

	void update(Income income);

}
