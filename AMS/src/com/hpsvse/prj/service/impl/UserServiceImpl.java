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

	
	


	//根据编号查询
	public Userinfo findById(Long id){
		return this.userinfoDAO.findById(id);
	}
	
	//删除
	public void deleteById(Long id){
		this.userinfoDAO.updateStatue(id);
	}

	//查询所有启用的用户
	public List<Userinfo> findAbledUser(){
		return this.userinfoDAO.findAbledUser();
	}
	
	
	//添加
	public void addUser(Userinfo user){
		this.userinfoDAO.save(user);
	}
	
	//修改
	public void update(Userinfo user){
		this.userinfoDAO.update(user);
	}
//根据部门ID查询所有用户
	public List<Userinfo> findUserByDept(Long deptid) {
		// TODO Auto-generated method stub
		return this.userinfoDAO.findUserByDept(deptid);
	}
//个人设置中的用户的修改与查询
	public Userinfo findByuserid(long userid) {
		// TODO Auto-generated method stub
		return this.userinfoDAO.findByuserid(userid);
	}

	public void updateforuserId(Userinfo user) {
		// TODO Auto-generated method stub
		this.userinfoDAO.updateforuserId(user);
	}

	
	//模糊查询
	public List<Userinfo> findBCondition(String name){
		return this.userinfoDAO.findBCondition(name);
	}
	
	//查询已经存在的用户
	public List<Userinfo> findbyUname(String name){
		return this.userinfoDAO.findbyUname(name);
	}
	
	//查询所有的分配人
	public List<Userinfo> findAllAbledAllotMan(){
		return this.userinfoDAO.findAllAbledAllotMan();
	}

}
