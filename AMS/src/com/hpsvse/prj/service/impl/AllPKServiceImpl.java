package com.hpsvse.prj.service.impl;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Allpkinfo;
import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.service.IAllPKService;


@Service
public class AllPKServiceImpl extends BaseService implements IAllPKService {

	//
	public void deleteById(Long id) {
		//����ɾ���м���¼
		this.apkDAO.deleteById(id);
		
	     
		
		//���ݵ�ǰ����ҵ�  �м���¼
		Allpkinfo apk=this.apkDAO.findById(id);
		
		
		//ɾ���ӱ��¼ 
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
