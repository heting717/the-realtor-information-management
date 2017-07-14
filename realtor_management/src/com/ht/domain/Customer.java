package com.ht.domain;

import java.util.HashSet;
import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;

public class Customer {
	
	
	private Long cust_id;
	// 客户名称
	private String cust_name;
	private Long cust_user_id;
	private Long cust_create_id;
	
	/*// 客户的来源
	private String cust_source;
	// 所属于行业
	private String cust_industry;
	// 客户的级别
	private String cust_level;*/
	
	// 联系人名称
	private String cust_linkman;
	// 固定电话
	private String cust_phone;
	// 移动电话
	private String cust_mobile;
	
	//面积
	private double cust_area;
	
	//地理位置
	private String cust_address;
	//最低价格
	private int cust_low_price;
	//最高价格
	private int cust_high_price;
	
	// 描述的是 一客户的来源，多是客户
	private Dict source;
	// 一客户的行业 多是客户
	private Dict industry;
	// 一客户级别 多是客户
	private Dict level;
	
	// 上传文件保存的路径
	private String filepath;
	
	// 和联系人配置一对多
	// 默认不把set集合进行json的转换
	@JSONField(serialize=false)
	private Set<Linkman> linkmans = new HashSet<Linkman>();
	
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public Long getCust_user_id() {
		return cust_user_id;
	}
	public void setCust_user_id(Long cust_user_id) {
		this.cust_user_id = cust_user_id;
	}
	public Long getCust_create_id() {
		return cust_create_id;
	}
	public void setCust_create_id(Long cust_create_id) {
		this.cust_create_id = cust_create_id;
	}
	public String getCust_linkman() {
		return cust_linkman;
	}
	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	public Dict getSource() {
		return source;
	}
	public void setSource(Dict source) {
		this.source = source;
	}
	public Dict getIndustry() {
		return industry;
	}
	public void setIndustry(Dict industry) {
		this.industry = industry;
	}
	public Dict getLevel() {
		return level;
	}
	public void setLevel(Dict level) {
		this.level = level;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public Set<Linkman> getLinkmans() {
		return linkmans;
	}
	public void setLinkmans(Set<Linkman> linkmans) {
		this.linkmans = linkmans;
	}
	public double getCust_area() {
		return cust_area;
	}
	public void setCust_area(double cust_area) {
		this.cust_area = cust_area;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public int getCust_low_price() {
		return cust_low_price;
	}
	public void setCust_low_price(int cust_low_price) {
		this.cust_low_price = cust_low_price;
	}
	public int getCust_high_price() {
		return cust_high_price;
	}
	public void setCust_high_price(int cust_high_price) {
		this.cust_high_price = cust_high_price;
	}
	
}
