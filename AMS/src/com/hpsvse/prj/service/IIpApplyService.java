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
	//���ip���뵥
	public Long addIpApp(Ipaddrinfo ipadd);
	//���ݱ�Ų�ѯ
	public Ipaddrinfo findById(Long ipid);
	//�����Դ������
	public Long addAllpk(Allpkinfo allpk);
	//������Դ��Ų�ѯ��Դ��
	public Allpkinfo findAllpkById(Long allpkid);
	//���������ֵ��ѯ
	public Dictinfo findDictById(Long dictid);
	//�����û���Ų�ѯ
	public Userinfo findUserById(Long userid);
	//������뵥
	public void addApplyinfo(Applyinfo apply);
	//=========================================================
	//���mail����һ��Id
	public Long addMailApp(Mailinfo mail);
	//���ݱ�Ų�ѯ
	public Mailinfo findMailApp(Long mailid);
	//==d�绰����=====================================
	public Long addTelApp(Telmeeting telmeet);
	public Telmeeting findTelById(Long telId);
	//ͨѶҵ��========================================
	public Long addCommApp(Comminfo comm);
	public Comminfo findCommById(Long commId);
	//�洢�ռ����뵥=========
	public Long addStrApp(Strroominfo str);
	public Strroominfo findStrById(Long strid);
	//����ҵ�����뵥
	public Long addOtherApp(Otherinfo oth);
	public Otherinfo findOthById(Long othid);

}
