package com.ht.web.action;

import java.io.IOException;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.Income;
import com.ht.domain.PageBean;
import com.ht.service.IncomeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class IncomeAction extends BaseAction implements ModelDriven<Income> {

	private Income income = new Income();
	@Override
	public Income getModel() {
		return income;
	}
	
	private IncomeService incomeService;
	public void setIncomeService(IncomeService incomeService) {
		this.incomeService = incomeService;
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
		DetachedCriteria criteria = DetachedCriteria.forClass(Income.class);
		System.out.println("~~~~~~~~~~~");
		// 查询
		PageBean<Income> page = (PageBean<Income>) incomeService.findByPage(pageCode,pageSize,criteria);
		System.out.println("#################");
		// 压栈
		ValueStack vs = ActionContext.getContext().getValueStack();
		// 栈顶是map<"page",page对象>
		vs.set("page", page);
		return "page";
	}
	/**
	 * 加载添加页面
	 */
	public String initAddUI(){
		return "initAddUI";
	}
	/**
	 * 保存收入的方法
	 * @return
	 * @throws IOException 
	 */
	public String save() throws IOException{
		// 保存成功
		incomeService.save(income);
		return "save";
	}
	/**
	 * 加载修改页面
	 */
	public String initUpdate(){
		// 默认customer压栈的了，Action默认压栈，model是Action类的书写  getModel(返回customer对象)
		income = incomeService.findById(income.getIncome_id());
		return "initUpdate";
	}
	/**
	 * 修改客户的功能
	 * @return
	 * @throws IOException 
	 */
	public String update() throws IOException{
		// 更新
		incomeService.update(income);
		
		return "update";
	}
	/**
	 * 删除
	 */
	public String delete(){
		// 删除，获取收入的信息获取到
		income = incomeService.findById(income.getIncome_id());
		// 删除
		incomeService.delete(income);
		return "delete";
	}
		
}
