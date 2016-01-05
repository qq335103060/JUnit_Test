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
	//���ip���뵥
	public Long addIpApp(Ipaddrinfo ipadd){
	return	this.ipaddDAO.AddipApply(ipadd);
	}
	//���ݱ�Ų�ѯ
	public Ipaddrinfo findById(Long ipid){
		
		return this.ipaddDAO.findById(ipid);
	}
	//�����Դ������
	public Long addAllpk(Allpkinfo allpk){
		
		return this.apkDAO.addAllpk(allpk);
	}
//������Դ��Ų�ѯ��Դ��
	public Allpkinfo findAllpkById(Long allpkid) {
		// TODO Auto-generated method stub
		return this.apkDAO.findById(allpkid);
	}
	//���������ֵ��Ų�ѯ
	public Dictinfo findDictById(Long dictid) {
		// TODO Auto-generated method stub
		return this.dictinfoDAO.findById(dictid);
	}
	//�����û���Ų�ѯ
	public Userinfo findUserById(Long userid){	
		return this.userinfoDAO.findById(userid);
	}
	//������뵥
	public void addApplyinfo(Applyinfo apply){
		this.applyinfoDAO.save(apply);
	}
	
	//==================================================================================
	//����������뵥
	public Long addMailApp(Mailinfo mail) {
		// TODO Auto-generated method stub
		return this.mailDAO.addMailApp(mail);
	}
	//���ݱ�Ų�ѯ
	public Mailinfo findMailApp(Long mailid){
		
		return this.mailDAO.findById(mailid);
	}
	//��ӵ绰�������뵥=======================================
	public Long addTelApp(Telmeeting telmeet){
		return this.telDAO.addTelApp(telmeet);
		
	}
	public Telmeeting findTelById(Long telId) {
		// TODO Auto-generated method stub
		return this.telDAO.findById(telId);
	}
	//ͨѶҵ��==============================================
	public Long addCommApp(Comminfo comm) {
		// TODO Auto-generated method stub
		return this.commDAO.addCommApp(comm);
	}
	public Comminfo findCommById(Long commId) {
		// TODO Auto-generated method stub
		return this.commDAO.findById(commId);
	}
	//======����ҵ�����뵥=====
	public Long addOtherApp(Otherinfo oth) {
		// TODO Auto-generated method stub
		return null;
	}
	public Otherinfo findOthById(Long othid) {
		// TODO Auto-generated method stub
		return null;
	}
	//====�洢�ռ����뵥=====
	public Long addStrApp(Strroominfo str) {
		// TODO Auto-generated method stub
		return null;
	}
	public Strroominfo findStrById(Long strid) {
		// TODO Auto-generated method stub
		return null;
	}	

}
