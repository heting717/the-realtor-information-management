package com.ht.domain;

import java.util.Date;

public class Salary {
	private Long salary_id;
	private double salary_base;
	private double salary_bonus;
	private double salary_money;
	private Date salary_time;
	private Emp emp;
	public Long getSalary_id() {
		return salary_id;
	}
	public void setSalary_id(Long salary_id) {
		this.salary_id = salary_id;
	}
	public double getSalary_base() {
		return salary_base;
	}
	public void setSalary_base(double salary_base) {
		this.salary_base = salary_base;
	}
	public double getSalary_bonus() {
		return salary_bonus;
	}
	public void setSalary_bonus(double salary_bonus) {
		this.salary_bonus = salary_bonus;
	}
	public double getSalary_money() {
		return salary_money;
	}
	public void setSalary_money(double salary_money) {
		this.salary_money = this.salary_bonus+this.salary_bonus;
	}
	public Date getSalary_time() {
		return salary_time;
	}
	public void setSalary_time(Date salary_time) {
		this.salary_time = salary_time;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
}
