package com.ht.test;

import com.alibaba.fastjson.annotation.JSONField;

public class Person {
	
	private String pname;
	
	@JSONField(serialize=false)
	private Role role;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

}
