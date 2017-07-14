<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>修改员工信息</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
<META content="MSHTML 6.00.2900.3492" name=GENERATOR>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/datepicker/WdatePicker.js"></script>

<script type="text/javascript">
	$(function(){
		// 发送ajax的请求
		var url = "${ pageContext.request.contextPath }/dept_findAll.action";
		$.post(url,function(data){
			// 遍历
			$(data).each(function(i,n){
				// 先获取值栈中的值，使用EL表达式
				var vsId = "${model.dept.dept_id}";
				// 值栈中的id值和遍历的id值相同，让被选中
				if(vsId == n.dept_id){
					// JQ的DOM操作
					$("#deptId").append("<option value='"+n.dept_id+"' selected>"+n.dept_name+"</option>");
				}else{
					$("#deptId").append("<option value='"+n.dept_id+"'>"+n.dept_name+"</option>");
				}
			});
			
		},"json");
	});
	
</script>


</HEAD>
<BODY>
	
	<!-- 修改客户，需要文件上传，必须提供属性：enctype="multipart/form-data" -->
	<FORM id=form1 name=form1 action="${pageContext.request.contextPath }/emp_update.action" method="post" enctype="multipart/form-data">
		
		<!-- 隐藏的客户的主键，不能忘记 -->
		<input type="hidden" name="emp_id" value="${model.emp_id}"/>
		
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background=${pageContext.request.contextPath }/images/new_020.jpg
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：人事管理 &gt; 修改员工信息</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing=0 cellPadding=5  border=0>
							<TR>
								<td>员工姓名：</td>
								<td>
								<INPUT class=textbox id=sChannel2
											style="WIDTH: 180px" maxLength=50 name="emp_name" value="${model.emp_name }">
								</td>
								
								<td>所属部门 ：</td>
								<td>
									<select name="dept" id="deptId"></select>
								</td>
							</TR>
							
							<TR>
								<td>生日 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
										style="WIDTH: 220px" maxLength=100 name="emp_brithday" value="${model.emp_brithday }" onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd'})">
								</td>
								<td>联系电话：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="emp_phone" value="${model.emp_phone }">
								</td>
							</TR>
							
							<TR>
								
								
								<td>家庭住址 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="emp_address" value="${model.emp_address }">
								</td>
								<td>职位 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="emp_post" value="${model.emp_post }">
								</td>
							</TR>
							
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
