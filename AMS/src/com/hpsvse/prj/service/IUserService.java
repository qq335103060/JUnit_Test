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
	
	//根据编号查询
	public Userinfo findById(Long id);
	
	//删除
	public void deleteById(Long id);
	
	//根据用户名查询
	public List<Userinfo> findAbledUser();
	
	//添加
	public void addUser(Userinfo user);

	public void update(Userinfo user);
	//根据部门查询用户
	public List<Userinfo> findUserByDept(Long deptid);
	
	//--个人设置上的用户的修改与查询
	public Userinfo findByuserid(long userid);
	public void updateforuserId(Userinfo user);
	
	//模糊查询
	public List<Userinfo> findBCondition(String name);
	
	//查询已经存在的用户
	public List<Userinfo> findbyUname(String name);
	
	
	//查询所有的分配人
	public List<Userinfo> findAllAbledAllotMan();
}
