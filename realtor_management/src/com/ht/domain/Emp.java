package com.ht.domain;

import java.util.Date;

public class Emp {
	private Long emp_id;
	private String emp_name;
	private Date emp_brithday;
	private String emp_phone;
	private String emp_address;
	//职位
	private String emp_post;
	
	//所属部门
	private Dept dept;
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Date getEmp_brithday() {
		return emp_brithday;
	}
	public void setEmp_brithday(Date emp_brithday) {
		this.emp_brithday = emp_brithday;
	}
	public String getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public String getEmp_post() {
		return emp_post;
	}
	public void setEmp_post(String emp_post) {
		this.emp_post = emp_post;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	

}
