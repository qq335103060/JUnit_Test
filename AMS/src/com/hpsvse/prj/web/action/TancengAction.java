package com.hpsvse.prj.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.entity.Userinfo;
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
public class TancengAction extends BaseAction {
	
	private List<Applyinfo> applist;
	private Applyinfo apply;
	private List<Userinfo> userlist;
	public List<Userinfo> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<Userinfo> userlist) {
		this.userlist = userlist;
	}
	public void setApplist(List<Applyinfo> applist) {
		this.applist = applist;
	}
	public Applyinfo getApply() {
		return apply;
	}
	public void setApply(Applyinfo apply) {
		this.apply = apply;
	}

	public List<Applyinfo> getApplist() {
		return applist;
	}
	
	//审批
	@Action(value="findapp",results={@Result(name="success",location="/shenpi.jsp")})
	public String findApplyById(){
		long appId = this.apply.getAppid();
		this.apply = this.applyService.findApplyById(appId);
		return "success";
	}
	//分配
	
	@Action(value="userAllot",results={@Result(name="success",location="/fenpei.jsp")})
	//查询所有处理人
	public String findAlluser(){
		Long deptid = this.apply.getUserinfoByUserid().getDeptinfo().getDeptid();
		Long appId = this.apply.getAppid();
		this.userlist =  this.userService.findUserByDept(deptid);
		this.apply = this.applyService.findApplyById(appId);
		return "success";
	}
	

}
