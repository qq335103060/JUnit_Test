package com.hpsvse.prj.web.action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hpsvse.prj.entity.Comminfo;
import com.hpsvse.prj.entity.Ipaddrinfo;
import com.hpsvse.prj.entity.Mailinfo;
import com.hpsvse.prj.entity.Otherinfo;
import com.hpsvse.prj.entity.Strroominfo;
import com.hpsvse.prj.entity.Telmeeting;

@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
public class AppUpdateAction extends BaseAction {
	private Ipaddrinfo ipaddrinfo;
	private Mailinfo mailinfo;
	private Comminfo comminfo;
	private Otherinfo otherinfo;
	private Strroominfo strroominfo;
	private Telmeeting telmeeting;
	public Ipaddrinfo getIpaddrinfo() {
		return ipaddrinfo;
	}
	public void setIpaddrinfo(Ipaddrinfo ipaddrinfo) {
		this.ipaddrinfo = ipaddrinfo;
	}
	public Mailinfo getMailinfo() {
		return mailinfo;
	}
	public void setMailinfo(Mailinfo mailinfo) {
		this.mailinfo = mailinfo;
	}
	public Comminfo getComminfo() {
		return comminfo;
	}
	public void setComminfo(Comminfo comminfo) {
		this.comminfo = comminfo;
	}
	public Otherinfo getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(Otherinfo otherinfo) {
		this.otherinfo = otherinfo;
	}
	public Strroominfo getStrroominfo() {
		return strroominfo;
	}
	public void setStrroominfo(Strroominfo strroominfo) {
		this.strroominfo = strroominfo;
	}
	public Telmeeting getTelmeeting() {
		return telmeeting;
	}
	public void setTelmeeting(Telmeeting telmeeting) {
		this.telmeeting = telmeeting;
	}
	
	//修改ip地址申请
	@Action(value="updateApp",results={@Result(type="json",name="success")})
	public String ipUpdate(){
		this.appUpdateService.updateIp(ipaddrinfo);
		return "success";
	}
	
	//telmeeting 修改
	public String telUpdate(){
		this.appUpdateService.updateTel(telmeeting);
		return "success";
	}
	
	//comminfo
	public String commUpdate(){
		this.appUpdateService.updateComm(comminfo);
		return "success";
	}
	
	//strroming 修改
	public String strUpdate(){
		this.appUpdateService.updateStr(strroominfo);
		return "success";
	}
	
	//otherinfo
	public String otherUpdate(){
		this.appUpdateService.updateOther(otherinfo);
		return "success";
	}
	
	//mailinfo 修改
	public String mailUpdate(){
		this.appUpdateService.updateMail(mailinfo);
		return "success";
	}
	
	
}
