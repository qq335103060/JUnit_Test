package com.hpsvse.prj.service;

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
@Service
public interface IIpApplyService {
	//添加ip申请单
	public Long addIpApp(Ipaddrinfo ipadd);
	//根据编号查询
	public Ipaddrinfo findById(Long ipid);
	//添加资源表数据
	public Long addAllpk(Allpkinfo allpk);
	//根据资源编号查询资源表
	public Allpkinfo findAllpkById(Long allpkid);
	//根据数据字典查询
	public Dictinfo findDictById(Long dictid);
	//根据用户编号查询
	public Userinfo findUserById(Long userid);
	//添加申请单
	public void addApplyinfo(Applyinfo apply);
	//=========================================================
	//添加mail表返回一个Id
	public Long addMailApp(Mailinfo mail);
	//根据编号查询
	public Mailinfo findMailApp(Long mailid);
	//==d电话会议=====================================
	public Long addTelApp(Telmeeting telmeet);
	public Telmeeting findTelById(Long telId);
	//通讯业务========================================
	public Long addCommApp(Comminfo comm);
	public Comminfo findCommById(Long commId);
	//存储空间申请单=========
	public Long addStrApp(Strroominfo str);
	public Strroominfo findStrById(Long strid);
	//其他业务申请单
	public Long addOtherApp(Otherinfo oth);
	public Otherinfo findOthById(Long othid);

}
