package com.ht.web.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.ht.domain.Customer;
import com.ht.domain.Dept;
import com.ht.domain.Dict;
import com.ht.domain.PageBean;
import com.ht.service.DeptService;
import com.ht.utils.FastJsonUtil;
import com.ht.utils.UploadUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class DeptAction extends BaseAction implements ModelDriven<Dept> {

	private Dept dept = new Dept();
	@Override
	public Dept getModel() {
		return dept;
	}
	private DeptService deptService;
	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
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
			DetachedCriteria criteria = DetachedCriteria.forClass(Dept.class);
			
			// 查询
			PageBean<Dept> page = deptService.findByPage(pageCode,pageSize,criteria);
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
			deptService.save(dept);
			return "save";
		}
		
		/**
		 * 删除客户
		 * @return
		 */
		public String delete(){
			// 删除客户，获取客户的信息获取到，上传文件的路径
			dept = deptService.findById(dept.getDept_id());
			
			// 删除客户
			deptService.delete(dept);
			return "delete";
		}
		
		/**
		 * 跳转到初始化修改的页面
		 * @return
		 */
		public String initUpdate(){
			// 默认customer压栈的了，Action默认压栈，model是Action类的书写  getModel(返回customer对象)
			dept = deptService.findById(dept.getDept_id());
			return "initUpdate";
		}
		
		/**
		 * 修改客户的功能
		 * @return
		 * @throws IOException 
		 */
		public String update() throws IOException{
			// 更新信息
			deptService.update(dept);
			
			return "update";
		}
		
		/**
		 * 查询所有的客户
		 * @return
		 */
		public String findAll(){
			List<Dept> list = deptService.findAll();
			// 转换成json
			String jsonString = FastJsonUtil.toJSONString(list);
			HttpServletResponse response = ServletActionContext.getResponse();
			FastJsonUtil.write_json(response, jsonString);
			return NONE;
		}

}
