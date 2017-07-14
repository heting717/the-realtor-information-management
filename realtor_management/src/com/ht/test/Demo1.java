package com.ht.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ht.domain.Customer;

public class Demo1 {
	
	/**
	 * 演示fastjson的简单的使用
	 */
	@Test
	public void run1(){
		Customer c = new Customer();
		c.setCust_id(20L);
		c.setCust_name("测试");
		c.setCust_phone("120");
		
		// 转换成json的字符串
		String jsonString = JSON.toJSONString(c);
		System.out.println(jsonString);
	}
	
	@Test
	public void run2(){
		List<Customer> list = new ArrayList<Customer>();
		Customer c = new Customer();
		c.setCust_id(20L);
		c.setCust_name("测试");
		c.setCust_phone("120");
		list.add(c);
		
		Customer c2 = new Customer();
		c2.setCust_id(30L);
		c2.setCust_name("测试2");
		c2.setCust_phone("12000");
		list.add(c2);
		
		// 转换成json的字符串
		String jsonString = JSON.toJSONString(list);
		System.out.println(jsonString);
	}
	
	/**
	 * 默认的情况下，fastjson禁止循环的引用
	 */
	@Test
	public void run3(){
		List<Customer> list = new ArrayList<Customer>();
		Customer c = new Customer();
		c.setCust_id(20L);
		c.setCust_name("测试");
		c.setCust_phone("120");
		list.add(c);
		list.add(c);
		
		// 转换成json的字符串
		// String jsonString = JSON.toJSONString(list);
		
		// 禁止循环的引用
		String jsonString = JSON.toJSONString(list, SerializerFeature.DisableCircularReferenceDetect);
		System.out.println(jsonString);
	}
	
	/**
	 * 死循环的问题
	 */
	@Test
	public void run4(){
		Person p = new Person();
		p.setPname("美美");
		Role r = new Role();
		r.setRname("管理员");
		p.setRole(r);
		r.setPerson(p);
		
		// 禁止循环的引用
		String jsonString = JSON.toJSONString(r,SerializerFeature.DisableCircularReferenceDetect);
		System.out.println(jsonString);
	}

}









