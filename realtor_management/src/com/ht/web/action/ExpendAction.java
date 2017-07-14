package com.ht.web.action;

import java.io.IOException;

import org.hibernate.criterion.DetachedCriteria;

import com.ht.domain.Expend;
import com.ht.domain.Income;
import com.ht.domain.PageBean;
import com.ht.service.ExpendService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class ExpendAction extends BaseAction implements ModelDriven<Expend>{

	private Expend expend = new Expend();
	@Override
	public Expend getModel() {
		return expend;
	}
	private ExpendService expendService;
	public void setExpendService(ExpendService expendService) {
		this.expendService = expendService;
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
			DetachedCriteria criteria = DetachedCriteria.forClass(Expend.class);
			
			// 查询
			PageBean<Expend> page = (PageBean<Expend>) expendService.findByPage(pageCode,pageSize,criteria);
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
			expendService.save(expend);
			return "save";
		}
		/**
		 * 加载修改页面
		 */
		public String initUpdate(){
			// 默认customer压栈的了，Action默认压栈，model是Action类的书写  getModel(返回customer对象)
			expend = expendService.findById(expend.getExpend_id());
			return "initUpdate";
		}
		/**
		 * 修改客户的功能
		 * @return
		 * @throws IOException 
		 */
		public String update() throws IOException{
			// 更新
			expendService.update(expend);
			
			return "update";
		}
		/**
		 * 删除
		 */
		public String delete(){
			// 删除，获取收入的信息获取到
			expend = expendService.findById(expend.getExpend_id());
			// 删除
			expendService.delete(expend);
			return "delete";
		}

}
