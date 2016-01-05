package com.hpsvse.prj.service.impl;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Comminfo;
import com.hpsvse.prj.entity.Ipaddrinfo;
import com.hpsvse.prj.entity.Mailinfo;
import com.hpsvse.prj.entity.Otherinfo;
import com.hpsvse.prj.entity.Strroominfo;
import com.hpsvse.prj.entity.Telmeeting;
import com.hpsvse.prj.service.AppUpdateService;
@Service
public class AppUpdateServiceImpl extends BaseService implements AppUpdateService {
	//ipµØÖ·ÐÞ¸Ä
	public void updateIp(Ipaddrinfo ipinfo) {
		this.ipaddDAO.attachDirty(ipinfo);
	}
	
	//telmeeting ÐÞ¸Ä
	public void updateTel(Telmeeting tel){
		this.telDAO.attachDirty(tel);	
	}
	
	//strroom 
	public void updateStr(Strroominfo str){
		this.strDAO.attachDirty(str);
	}
	
	//other 
	public void updateOther(Otherinfo other){
		this.otherDAO.attachDirty(other);
	}
	
	//mialinfo
	public void updateMail(Mailinfo mail){
		this.mailDAO.attachDirty(mail);
	}
	
	//comminfo
	public void updateComm(Comminfo comm){
		this.commDAO.attachDirty(comm);
	}

}
