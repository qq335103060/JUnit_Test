package com.hpsvse.prj.service;

import com.hpsvse.prj.entity.Comminfo;
import com.hpsvse.prj.entity.Ipaddrinfo;
import com.hpsvse.prj.entity.Mailinfo;
import com.hpsvse.prj.entity.Otherinfo;
import com.hpsvse.prj.entity.Strroominfo;
import com.hpsvse.prj.entity.Telmeeting;

public interface AppUpdateService {
	//ip地址申请单修改
	public void updateIp(Ipaddrinfo ipinfo);	
	
	//telmeeting 修改
	public void updateTel(Telmeeting tel);
	
	//strroom 
	public void updateStr(Strroominfo str);
	
	//other 
	public void updateOther(Otherinfo other);
	
	//mialinfo
	public void updateMail(Mailinfo mail);
	
	//comminfo
	public void updateComm(Comminfo comm);
	
}
