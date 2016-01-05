package com.hpsvse.prj.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hpsvse.prj.entity.Allpkinfo;
import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.entity.Typeinfo;
import com.hpsvse.prj.entity.Userinfo;
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
public class ApplyAction extends BaseAction {
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
	
	@Action(value="app",results={@Result(type="json")})
	public String findApplyrove(){
		this.applist = this.applyService.findApprove(apply);
		return "success";
	}

	//根据编号查询
	public String findApplyById(){
		long appId = this.apply.getAppid();
		this.apply = this.applyService.findApplyById(appId);
		return "success";
	}
	//审批
	public String update(){
		long appId = this.apply.getAppid();
		long dictId = this.apply.getDictinfo().getDictid();
		this.apply = this.applyService.findApplyById(appId);
		this.apply.setDictinfo(this.dictService.findById(dictId));
		this.applyService.update(apply);
		return null;
	}
	//分配查询所有
	public String findApplyFenpei(){
		Long userId = this.apply.getUserinfoByUserid().getUserid();
		List<Typeinfo> list = this.typeService.findFeipei(userId);
		Allpkinfo allpk = new Allpkinfo();
		allpk.setTypeinfo(list.get(0));
		this.apply.setAllpkinfo(allpk);
		this.applist = this.applyService.findFenpei(apply); 
		return "success";
	}
	//查询所有处理人
	public String findAlluser(){
		Long deptid = this.apply.getUserinfoByUserid().getDeptinfo().getDeptid();
		Long appId = this.apply.getAppid();
		this.userlist =  this.userService.findUserByDept(deptid);
		this.apply = this.applyService.findApplyById(appId);
		return "success";
	}
	//分配给处理人
	public String findAllot(){
		long appId = this.apply.getAppid();
		long dictId = this.apply.getDictinfo().getDictid();
		long userid = this.apply.getUserinfoByDealby().getUserid();
		this.apply = this.applyService.findApplyById(appId);
		this.apply.setDictinfo(this.dictService.findById(dictId));
		this.apply.setUserinfoByDealby(this.userService.findById(userid));
		this.applyService.update(apply);
		return null;
	}
	//处理的查询所有
	public String findAllchuli(){	
		
		this.applist = this.applyService.findAllchuli(apply);
		return "success";
	}
	//处理 人  进行处理
	public String chuliupdate(){
		
		long appId = this.apply.getAppid();
		long dictId = this.apply.getDictinfo().getDictid();
		this.apply = this.applyService.findApplyById(appId);
		this.apply.setDictinfo(this.dictService.findById(dictId));
		this.applyService.update(apply);
		return null;
	}
//=========================================================================================
	
	//查询当前用户的所有申请单
	public String findAllById(){
		Long id=apply.getUserinfoByUserid().getUserid();
		
		this.applist=this.applyService.findAllById(id);	
		
		return "success";
	}
	
	//删除 根据编号
	public String deleteById(){
		System.out.println(apply.getAppid()+"-----------------------");
		
		
		//删除总申请单记录
		this.applyService.delete(apply.getAppid());
		
		
		//删除中间表  、申请单记录
		this.apkService.deleteById(apply.getAllpkinfo().getRid());
		
		return null;
	}
	
	
	//==========================谈层查询所有页面=======================
@Action(value="findAppforId",results={@Result(name="aa",location="/aa.jsp")})	
public String findAppforId(){
		long appId = this.apply.getAppid();
		this.apply = this.applyService.findApplyById(appId);
		return "aa";
	}

}
