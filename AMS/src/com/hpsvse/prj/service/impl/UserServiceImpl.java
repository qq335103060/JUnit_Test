package com.hpsvse.prj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Userinfo;
import com.hpsvse.prj.service.IUserService;
@Service
public class UserServiceImpl extends BaseService implements IUserService {
	public Userinfo findByName(Userinfo user){
		Userinfo userinfo = new Userinfo();
		List<Userinfo> list = this.userinfoDAO.findByUsername(user.getUsername());
		if(list.size()==0){
			userinfo=null;
		}
		else{
			if(list.get(0).getUserpwd().equals(user.getUserpwd())){
				userinfo = list.get(0);
			}
			else{
				userinfo = null;
			}
		}
		return userinfo;
	}

	public List<Userinfo> findAll() {
		return this.userinfoDAO.findAll();
	}

	
	


	//���ݱ�Ų�ѯ
	public Userinfo findById(Long id){
		return this.userinfoDAO.findById(id);
	}
	
	//ɾ��
	public void deleteById(Long id){
		this.userinfoDAO.updateStatue(id);
	}

	//��ѯ�������õ��û�
	public List<Userinfo> findAbledUser(){
		return this.userinfoDAO.findAbledUser();
	}
	
	
	//���
	public void addUser(Userinfo user){
		this.userinfoDAO.save(user);
	}
	
	//�޸�
	public void update(Userinfo user){
		this.userinfoDAO.update(user);
	}
//���ݲ���ID��ѯ�����û�
	public List<Userinfo> findUserByDept(Long deptid) {
		// TODO Auto-generated method stub
		return this.userinfoDAO.findUserByDept(deptid);
	}
//���������е��û����޸����ѯ
	public Userinfo findByuserid(long userid) {
		// TODO Auto-generated method stub
		return this.userinfoDAO.findByuserid(userid);
	}

	public void updateforuserId(Userinfo user) {
		// TODO Auto-generated method stub
		this.userinfoDAO.updateforuserId(user);
	}

	
	//ģ����ѯ
	public List<Userinfo> findBCondition(String name){
		return this.userinfoDAO.findBCondition(name);
	}
	
	//��ѯ�Ѿ����ڵ��û�
	public List<Userinfo> findbyUname(String name){
		return this.userinfoDAO.findbyUname(name);
	}
	
	//��ѯ���еķ�����
	public List<Userinfo> findAllAbledAllotMan(){
		return this.userinfoDAO.findAllAbledAllotMan();
	}

}
