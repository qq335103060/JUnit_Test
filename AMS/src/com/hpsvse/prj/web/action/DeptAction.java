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
	
	//��ѯ���п��õĲ��� 
	@Action(value="allDept",results={@Result(type="json",name="success")})
	public String findAllAbledDept(){
		//����
		this.deptinfos=this.deptService.findAbledDept();
		return "success";
	}
	
	//ɾ��
	public String deleteDeptById(){
		System.out.println(dept.getDeptid()+"----------");
		this.deptService.deleteById(dept.getDeptid());
		return null;
	}
	
	//���
	public String addDept(){
		this.deptService.addDept(dept);
		return null;
	}
	
	//�޸�
	public String updateDept(){
		this.deptService.updateDept(dept);
		return null;
	}
	
	//���ݱ�Ų�ѯ
	@Action(value="showDept",results={@Result(type="json")})
	public String findDeptById(){
		this.dept=this.deptService.findById(dept.getDeptid());
		return "success";
	}
	
}
