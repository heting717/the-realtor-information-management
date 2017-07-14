package com.ht.dao;

import java.util.List;

import com.ht.domain.Customer;

public interface CustomerDao extends BaseDao<Customer>{

	List<Object[]> findBySource();
	
	// public void save(Customer customer);
	
	// public PageBean<Customer> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);

	// public Customer findById(Long cust_id);

	// public void delete(Customer customer);

	// public void update(Customer customer);

}
