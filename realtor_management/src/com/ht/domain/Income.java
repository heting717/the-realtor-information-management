package com.ht.domain;

import java.util.Date;

public class Income {
	
	private Long income_id;
	//收入来源
	private String income_source;
	//收入时间
	private Date income_time;
	//收入钱
	private double income_money;
	
	
	public Long getIncome_id() {
		return income_id;
	}
	public void setIncome_id(Long income_id) {
		this.income_id = income_id;
	}
	public String getIncome_source() {
		return income_source;
	}
	public void setIncome_source(String income_source) {
		this.income_source = income_source;
	}
	public Date getIncome_time() {
		return income_time;
	}
	public void setIncome_time(Date income_time) {
		this.income_time = income_time;
	}
	public double getIncome_money() {
		return income_money;
	}
	public void setIncome_money(double income_money) {
		this.income_money = income_money;
	}
}
