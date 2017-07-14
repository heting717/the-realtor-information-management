package com.ht.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.Emp;
import com.ht.domain.PageBean;
import com.ht.domain.Salary;
import com.ht.service.SalaryService;
import com.ht.utils.FastJsonUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class SalaryAction extends BaseAction implements ModelDriven<Salary>{

	private Salary salary = new Salary();
	@Override
	public Salary getModel() {
		return salary;
	}
	
	private SalaryService salaryService;
	public void setSalaryService(SalaryService salaryService) {
		this.salaryService = salaryService;
	}
	
	// 属性驱动的方式
	// 当前页，默认值就是1  
	private Integer pageCode = 1;
	public void setPageCode(Integer pageCode) {
		if(pageCode == null){
			pageCode = 1;
		}
		this.pageCode = pageCode;
	}
	
	// 每页显示的数据的条数
	private Integer pageSize = 2;
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	/**
	 * 分页的查询方法
	 * @return
	 */
	public String findByPage(){
		// 调用service业务层
		DetachedCriteria criteria = DetachedCriteria.forClass(Salary.class);
		
		// 查询
		PageBean<Salary> page = salaryService.findByPage(pageCode,pageSize,criteria);
		// 压栈
		ValueStack vs = ActionContext.getContext().getValueStack();
		// 栈顶是map<"page",page对象>
		vs.set("page", page);
		return "page";
	}
	
	/**
	 * 初始化到添加的页面
	 * @return
	 */
	public String initAddUI(){
		return "initAddUI";
	}
	
	/**
	 * 保存客户的方法
	 * @return
	 * @throws IOException 
	 */
	public String save() throws IOException{
		// 保存客户成功了
		salaryService.save(salary);
		return "save";
	}
	
	/**
	 * 删除客户
	 * @return
	 */
	public String delete(){
		// 删除客户，获取客户的信息获取到，上传文件的路径
		salary = salaryService.findById(salary.getSalary_id());
		
		// 删除客户
		salaryService.delete(salary);
		return "delete";
	}
	
	/**
	 * 跳转到初始化修改的页面
	 * @return
	 */
	public String initUpdate(){
		// 默认customer压栈的了，Action默认压栈，model是Action类的书写  getModel(返回customer对象)
		salary = salaryService.findById(salary.getSalary_id());
		return "initUpdate";
	}
	
	/**
	 * 修改客户的功能
	 * @return
	 * @throws IOException 
	 */
	public String update() throws IOException{
		// 更新信息
		salaryService.update(salary);
		
		return "update";
	}
	
	/**
	 * 查询所有的客户
	 * @return
	 */
	public String findAll(){
		List<Salary> list = salaryService.findAll();
		// 转换成json
		String jsonString = FastJsonUtil.toJSONString(list);
		HttpServletResponse response = ServletActionContext.getResponse();
		FastJsonUtil.write_json(response, jsonString);
		return NONE;
	}

	
	
	

}
