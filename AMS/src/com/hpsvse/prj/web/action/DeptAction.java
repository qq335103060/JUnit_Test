package com.hpsvse.prj.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hpsvse.prj.entity.Deptinfo;
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
public class DeptAction extends BaseAction {
	private List<Deptinfo> deptinfos;

	public List<Deptinfo> getDeptinfos() {
		return deptinfos;
	}
	public void setDeptinfos(List<Deptinfo> deptinfos) {
		this.deptinfos = deptinfos;
	}
	
	
	private Deptinfo dept;
	
	public Deptinfo getDept() {
		return dept;
	}
	public void setDept(Deptinfo dept) {
		this.dept = dept;
	}
	
	//查询所有可用的部门 
	@Action(value="allDept",results={@Result(type="json",name="success")})
	public String findAllAbledDept(){
		//部门
		this.deptinfos=this.deptService.findAbledDept();
		return "success";
	}
	
	//删除
	public String deleteDeptById(){
		System.out.println(dept.getDeptid()+"----------");
		this.deptService.deleteById(dept.getDeptid());
		return null;
	}
	
	//添加
	public String addDept(){
		this.deptService.addDept(dept);
		return null;
	}
	
	//修改
	public String updateDept(){
		this.deptService.updateDept(dept);
		return null;
	}
	
	//根据编号查询
	@Action(value="showDept",results={@Result(type="json")})
	public String findDeptById(){
		this.dept=this.deptService.findById(dept.getDeptid());
		return "success";
	}
	
}
