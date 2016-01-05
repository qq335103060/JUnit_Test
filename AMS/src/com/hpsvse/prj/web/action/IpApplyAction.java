package com.hpsvse.prj.web.action;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hpsvse.prj.entity.Allpkinfo;
import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.entity.Comminfo;
import com.hpsvse.prj.entity.Dictinfo;
import com.hpsvse.prj.entity.Ipaddrinfo;
import com.hpsvse.prj.entity.Mailinfo;
import com.hpsvse.prj.entity.Otherinfo;
import com.hpsvse.prj.entity.Strroominfo;
import com.hpsvse.prj.entity.Telmeeting;
import com.hpsvse.prj.entity.Userinfo;

@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
public class IpApplyAction extends BaseAction {
	private Ipaddrinfo ipadd;
	private Applyinfo apply;
	private Mailinfo mail;
	private Telmeeting telmeeting;
	private Comminfo comm;
	private Strroominfo str;
	private Otherinfo oth;
	public Otherinfo getOth() {
		return oth;
	}
	public void setOth(Otherinfo oth) {
		this.oth = oth;
	}
	public Strroominfo getStr() {
		return str;
	}
	public void setStr(Strroominfo str) {
		this.str = str;
	}
	public Telmeeting getTelmeeting() {
		return telmeeting;
	}
	public void setTelmeeting(Telmeeting telmeeting) {
		this.telmeeting = telmeeting;
	}
	public Comminfo getComm() {
		return comm;
	}
	public void setComm(Comminfo comm) {
		this.comm = comm;
	}
	public Mailinfo getMail() {
		return mail;
	}
	public void setMail(Mailinfo mail) {
		this.mail = mail;
	}
	public Ipaddrinfo getIpadd() {
		return ipadd;
	}
	public void setIpadd(Ipaddrinfo ipadd) {
		this.ipadd = ipadd;
	}
	public Applyinfo getApply() {
		return apply;
	}
	public void setApply(Applyinfo apply) {
		this.apply = apply;
	}
	//ip申请单的创建
	@Action(value="applyIp",results={@Result(type="json",name="success")})
	public String AddIpadd(){
		
		Long typeid = this.apply.getAllpkinfo().getTypeinfo().getTypeid();
		Long ipid = this.ipApplyService.addIpApp(ipadd);
		Long dictid = this.apply.getDictinfo().getDictid();
		Long userid = this.apply.getUserinfoByUserid().getUserid();
		this.ipadd = this.ipApplyService.findById(ipid);
		
		Allpkinfo allpk = new Allpkinfo();
		allpk.setIpaddrinfo(ipadd);
		allpk.setTypeinfo(this.typeService.findById(typeid));
		Long allpkid = this.ipApplyService.addAllpk(allpk);
		allpk=this.ipApplyService.findAllpkById(allpkid);
		
		Dictinfo dict = new Dictinfo();
		dict = this.ipApplyService.findDictById(dictid);
		
		Userinfo user = new Userinfo();
		user = this.ipApplyService.findUserById(userid);
		this.apply.setAllpkinfo(allpk);
		this.apply.setDictinfo(dict);
		this.apply.setUserinfoByUserid(user);
		Date date = new Date();
		this.apply.setAppdate(date);
		//添加申请单
		this.ipApplyService.addApplyinfo(apply);
		return "success";
	}
	
//邮箱地址申请单的创建
@Action(value="applyMail",results={@Result(type="json",name="success")})
	public String Addmail(){
		Long dictid = this.apply.getDictinfo().getDictid();
		Long userid = this.apply.getUserinfoByUserid().getUserid();
		Long typeid = this.apply.getAllpkinfo().getTypeinfo().getTypeid();
		Long dictid2 = this.mail.getDictinfo().getDictid();
		Dictinfo dict = new Dictinfo();
		dict = this.dictService.findById(dictid2);
		this.mail.setDictinfo(dict);
		
		Long mailid = this.ipApplyService.addMailApp(mail);
		
		this.mail = this.ipApplyService.findMailApp(mailid);
		
		Allpkinfo allpk = new Allpkinfo();
		allpk.setMailinfo(mail);
		allpk.setTypeinfo(this.typeService.findById(typeid));
		Long allpkid = this.ipApplyService.addAllpk(allpk);
		allpk=this.ipApplyService.findAllpkById(allpkid);
		
		
		dict = this.ipApplyService.findDictById(dictid);
		
		Userinfo user = new Userinfo();
		user = this.ipApplyService.findUserById(userid);
		this.apply.setAllpkinfo(allpk);
		this.apply.setDictinfo(dict);
		this.apply.setUserinfoByUserid(user);
		Date date = new Date();
		this.apply.setAppdate(date);
		//添加申请单
		this.ipApplyService.addApplyinfo(apply);
		return "success";
	}

//添加会议申请单
@Action(value="applyTel",results={@Result(type="json")})
public String Addtel(){
	
	Long typeid = this.apply.getAllpkinfo().getTypeinfo().getTypeid();
	Long telid = this.ipApplyService.addTelApp(telmeeting);
	Long dictid = this.apply.getDictinfo().getDictid();
	Long userid = this.apply.getUserinfoByUserid().getUserid();
	this.telmeeting = this.ipApplyService.findTelById(telid);
	
	Allpkinfo allpk = new Allpkinfo();
	allpk.setTelmeeting(telmeeting);
	allpk.setTypeinfo(this.typeService.findById(typeid));
	Long allpkid = this.ipApplyService.addAllpk(allpk);
	allpk=this.ipApplyService.findAllpkById(allpkid);
	
	Dictinfo dict = new Dictinfo();
	dict = this.ipApplyService.findDictById(dictid);
	
	Userinfo user = new Userinfo();
	user = this.ipApplyService.findUserById(userid);
	this.apply.setAllpkinfo(allpk);
	this.apply.setDictinfo(dict);
	this.apply.setUserinfoByUserid(user);
	Date date = new Date();
	this.apply.setAppdate(date);
	//添加申请单
	this.ipApplyService.addApplyinfo(apply);
	return "success";
}

//创建通讯业务申请单================
	@Action(value="applyComm",results={@Result(type="json")})
public String Addcomm(){
	Long dictid = this.apply.getDictinfo().getDictid();
	Long userid = this.apply.getUserinfoByUserid().getUserid();
	Long typeid = this.apply.getAllpkinfo().getTypeinfo().getTypeid();
	Long dictid2 = this.comm.getDictinfo().getDictid();
	Dictinfo dict = new Dictinfo();
	dict = this.dictService.findById(dictid2);
	this.comm.setDictinfo(dict);
	
	Long commid = this.ipApplyService.addCommApp(comm);
	
	this.comm = this.ipApplyService.findCommById(commid);
	
	Allpkinfo allpk = new Allpkinfo();
	allpk.setComminfo(comm);
	allpk.setTypeinfo(this.typeService.findById(typeid));
	Long allpkid = this.ipApplyService.addAllpk(allpk);
	allpk=this.ipApplyService.findAllpkById(allpkid);
	
	
	dict = this.ipApplyService.findDictById(dictid);
	
	Userinfo user = new Userinfo();
	user = this.ipApplyService.findUserById(userid);
	this.apply.setAllpkinfo(allpk);
	this.apply.setDictinfo(dict);
	this.apply.setUserinfoByUserid(user);
	Date date = new Date();
	this.apply.setAppdate(date);
	//添加申请单
	this.ipApplyService.addApplyinfo(apply);
	return "success";
}
//======存储空间申请单=====
@Action(value="applyStr",results={@Result(type="json",name="success")})
public String AddStr(){
		
		Long typeid = this.apply.getAllpkinfo().getTypeinfo().getTypeid();
		Long strid = this.ipApplyService.addStrApp(str);
		Long dictid = this.apply.getDictinfo().getDictid();
		Long userid = this.apply.getUserinfoByUserid().getUserid();
		this.str = this.ipApplyService.findStrById(strid);
		
		Allpkinfo allpk = new Allpkinfo();
		allpk.setStrroominfo(str);
		allpk.setTypeinfo(this.typeService.findById(typeid));
		Long allpkid = this.ipApplyService.addAllpk(allpk);
		allpk=this.ipApplyService.findAllpkById(allpkid);
		
		Dictinfo dict = new Dictinfo();
		dict = this.ipApplyService.findDictById(dictid);
		
		Userinfo user = new Userinfo();
		user = this.ipApplyService.findUserById(userid);
		this.apply.setAllpkinfo(allpk);
		this.apply.setDictinfo(dict);
		this.apply.setUserinfoByUserid(user);
		Date date = new Date();
		this.apply.setAppdate(date);
		//添加申请单
		this.ipApplyService.addApplyinfo(apply);
		return "success";
	}
//==========其他业务申请单=======

@Action(value="applyOth",results={@Result(type="json",name="success")})
public String AddOth(){
		
		Long typeid = this.apply.getAllpkinfo().getTypeinfo().getTypeid();
		Long othid = this.ipApplyService.addOtherApp(oth);
		Long dictid = this.apply.getDictinfo().getDictid();
		Long userid = this.apply.getUserinfoByUserid().getUserid();
		this.oth = this.ipApplyService.findOthById(othid);
		
		Allpkinfo allpk = new Allpkinfo();
		allpk.setOtherinfo(oth);
		allpk.setTypeinfo(this.typeService.findById(typeid));
		Long allpkid = this.ipApplyService.addAllpk(allpk);
		allpk=this.ipApplyService.findAllpkById(allpkid);
		
		Dictinfo dict = new Dictinfo();
		dict = this.ipApplyService.findDictById(dictid);
		
		Userinfo user = new Userinfo();
		user = this.ipApplyService.findUserById(userid);
		this.apply.setAllpkinfo(allpk);
		this.apply.setDictinfo(dict);
		this.apply.setUserinfoByUserid(user);
		Date date = new Date();
		this.apply.setAppdate(date);
		//添加申请单
		this.ipApplyService.addApplyinfo(apply);
		return "success";
	}
	
	

}
