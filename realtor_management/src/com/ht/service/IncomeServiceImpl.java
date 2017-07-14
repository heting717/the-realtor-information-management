package com.ht.service;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.dao.IncomeDao;
import com.ht.domain.Customer;
import com.ht.domain.Income;
import com.ht.domain.PageBean;

@Transactional
public class IncomeServiceImpl  implements IncomeService {

	private IncomeDao incomeDao;

	public void setIncomeDao(IncomeDao incomeDao) {
		this.incomeDao = incomeDao;
	}

	@Override
	public PageBean<Income> findByPage(Integer pageCode, Integer pageSize,DetachedCriteria criteria) {
		return incomeDao.findByPage(pageCode, pageSize, criteria);
	}

	@Override
	public void save(Income income) {
		incomeDao.save(income);
	}

	@Override
	public void delete(Income income) {
		incomeDao.delete(income);
	}

	@Override
	public Income findById(Long income_id) {
		return incomeDao.findById(income_id);
	}

	@Override
	public void update(Income income) {
		incomeDao.update(income);
	}
}
