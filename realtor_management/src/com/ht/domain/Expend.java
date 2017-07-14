package com.ht.domain;

import java.util.Date;

public class Expend {
	private Long expend_id;
	//支出原因
	private String expend_reason;
	//支出时间
	private Date expend_time;
	//支出钱
	private double expend_money;
	public Long getExpend_id() {
		return expend_id;
	}
	public void setExpend_id(Long expend_id) {
		this.expend_id = expend_id;
	}
	public String getExpend_reason() {
		return expend_reason;
	}
	public void setExpend_reason(String expend_reason) {
		this.expend_reason = expend_reason;
	}
	public Date getExpend_time() {
		return expend_time;
	}
	public void setExpend_time(Date expend_time) {
		this.expend_time = expend_time;
	}
	public double getExpend_money() {
		return expend_money;
	}
	public void setExpend_money(double expend_money) {
		this.expend_money = expend_money;
	}
	
}
