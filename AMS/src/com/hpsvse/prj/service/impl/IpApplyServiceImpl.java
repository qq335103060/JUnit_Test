package com.hpsvse.prj.service.impl;

import org.springframework.stereotype.Service;

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
import com.hpsvse.prj.service.IIpApplyService;
@Service
public class IpApplyServiceImpl extends BaseService implements IIpApplyService {
	//添加ip申请单
	public Long addIpApp(Ipaddrinfo ipadd){
	return	this.ipaddDAO.AddipApply(ipadd);
	}
	//根据编号查询
	public Ipaddrinfo findById(Long ipid){
		
		return this.ipaddDAO.findById(ipid);
	}
	//添加资源表数据
	public Long addAllpk(Allpkinfo allpk){
		
		return this.apkDAO.addAllpk(allpk);
	}
//根据资源编号查询资源表
	public Allpkinfo findAllpkById(Long allpkid) {
		// TODO Auto-generated method stub
		return this.apkDAO.findById(allpkid);
	}
	//根据数据字典编号查询
	public Dictinfo findDictById(Long dictid) {
		// TODO Auto-generated method stub
		return this.dictinfoDAO.findById(dictid);
	}
	//根据用户编号查询
	public Userinfo findUserById(Long userid){	
		return this.userinfoDAO.findById(userid);
	}
	//添加申请单
	public void addApplyinfo(Applyinfo apply){
		this.applyinfoDAO.save(apply);
	}
	
	//==================================================================================
	//添加邮箱申请单
	public Long addMailApp(Mailinfo mail) {
		// TODO Auto-generated method stub
		return this.mailDAO.addMailApp(mail);
	}
	//根据编号查询
	public Mailinfo findMailApp(Long mailid){
		
		return this.mailDAO.findById(mailid);
	}
	//添加电话会议申请单=======================================
	public Long addTelApp(Telmeeting telmeet){
		return this.telDAO.addTelApp(telmeet);
		
	}
	public Telmeeting findTelById(Long telId) {
		// TODO Auto-generated method stub
		return this.telDAO.findById(telId);
	}
	//通讯业务==============================================
	public Long addCommApp(Comminfo comm) {
		// TODO Auto-generated method stub
		return this.commDAO.addCommApp(comm);
	}
	public Comminfo findCommById(Long commId) {
		// TODO Auto-generated method stub
		return this.commDAO.findById(commId);
	}
	//======其他业务申请单=====
	public Long addOtherApp(Otherinfo oth) {
		// TODO Auto-generated method stub
		return null;
	}
	public Otherinfo findOthById(Long othid) {
		// TODO Auto-generated method stub
		return null;
	}
	//====存储空间申请单=====
	public Long addStrApp(Strroominfo str) {
		// TODO Auto-generated method stub
		return null;
	}
	public Strroominfo findStrById(Long strid) {
		// TODO Auto-generated method stub
		return null;
	}	

}
