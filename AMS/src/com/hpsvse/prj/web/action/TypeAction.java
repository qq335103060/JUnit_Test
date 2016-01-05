package com.hpsvse.prj.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hpsvse.prj.entity.Typeinfo;
import com.hpsvse.prj.entity.Userinfo;

@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
public class TypeAction extends BaseAction {
	private List<Userinfo> userList;
	
	private List<Typeinfo> typeList;
	private Typeinfo type;
	public List<Typeinfo> getTypeList() {
		return typeList;
	}
	public void setTypeList(List<Typeinfo> typeList) {
		this.typeList = typeList;
	}
	
	public Typeinfo getType() {
		return type;
	}
	public void setType(Typeinfo type) {
		this.type = type;
	}
	
	
	public List<Userinfo> getUserList() {
		return userList;
	}
	public void setUserList(List<Userinfo> userList) {
		this.userList = userList;
	}
	//查询所有可用的类型
	@Action(value="allType",results={@Result(type="json",name="success")})
	public String findAllAbledType(){
		//部门
		this.typeList=this.typeService.findAbledType();
		return "success";
	}
	
	//删除
	public String deleteTypeById(){
		this.typeService.deleteById(type.getTypeid());
		return null;
	}
	
	//添加
	public String addType(){
		this.typeService.addType(type);
		return null;
	}
	
	//修改
	public String updateType(){
		this.typeService.updateType(type);
		return null;
	}
	
	//根据编号查询
	@Action(value="showType",results={@Result(type="json")})
	public String findTypeById(){
		//this.typeList=this.typeService.findAbledType();
		this.type=this.typeService.findById(type.getTypeid());
		this.userList=this.userService.findAllAbledAllotMan();
		return "success";
	}
	
}
