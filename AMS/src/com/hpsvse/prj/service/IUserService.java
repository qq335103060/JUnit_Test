package com.hpsvse.prj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.entity.Userinfo;
@Service
public interface IUserService {
	public Userinfo findByName(Userinfo user);

	
	//
	public List<Userinfo> findAll(); 
	
	//���ݱ�Ų�ѯ
	public Userinfo findById(Long id);
	
	//ɾ��
	public void deleteById(Long id);
	
	//�����û�����ѯ
	public List<Userinfo> findAbledUser();
	
	//���
	public void addUser(Userinfo user);

	public void update(Userinfo user);
	//���ݲ��Ų�ѯ�û�
	public List<Userinfo> findUserByDept(Long deptid);
	
	//--���������ϵ��û����޸����ѯ
	public Userinfo findByuserid(long userid);
	public void updateforuserId(Userinfo user);
	
	//ģ����ѯ
	public List<Userinfo> findBCondition(String name);
	
	//��ѯ�Ѿ����ڵ��û�
	public List<Userinfo> findbyUname(String name);
	
	
	//��ѯ���еķ�����
	public List<Userinfo> findAllAbledAllotMan();
}
