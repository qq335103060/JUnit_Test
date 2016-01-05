package com.hpsvse.prj.service.impl;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Allpkinfo;
import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.service.IAllPKService;


@Service
public class AllPKServiceImpl extends BaseService implements IAllPKService {

	//
	public void deleteById(Long id) {
		//根据删除中间表记录
		this.apkDAO.deleteById(id);
		
	     
		
		//根据当前编号找到  中间表记录
		Allpkinfo apk=this.apkDAO.findById(id);
		
		
		//删除子表记录 
		if(apk.getComminfo().getCommid()!=null){
			this.commDAO.delete(apk.getComminfo().getCommid());
		}
		else if(apk.getIpaddrinfo().getIpid()!=null){
			this.ipaddDAO.delete(apk.getIpaddrinfo().getIpid());
		}
		else if(apk.getMailinfo().getMailid()!=null){
			this.mailDAO.delete(apk.getMailinfo().getMailid());
		}
		else if(apk.getOtherinfo().getOtherid()!=null){
			this.otherDAO.delete(apk.getOtherinfo().getOtherid());
		}
		else if(apk.getStrroominfo().getRoomid()!=null){
			this.strDAO.delete(apk.getStrroominfo().getRoomid());
		}
		else if(apk.getTelmeeting().getTelid()!=null){
			this.telDAO.delete(apk.getTelmeeting().getTelid());
		}
	}


}
