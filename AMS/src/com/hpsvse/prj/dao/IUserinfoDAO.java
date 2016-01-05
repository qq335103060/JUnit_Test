package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Userinfo;

public interface IUserinfoDAO {

	public abstract void save(Userinfo transientInstance);

	public abstract void delete(Userinfo persistentInstance);

	public abstract Userinfo findById(java.lang.Long id);

	public abstract List<Userinfo> findByExample(Userinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Userinfo> findByUsername(Object username);

	public abstract List<Userinfo> findByUsersex(Object usersex);

	public abstract List<Userinfo> findByUserpwd(Object userpwd);

	public abstract List<Userinfo> findByUsertel(Object usertel);

	public abstract List<Userinfo> findByUseradd(Object useradd);

	public abstract List<Userinfo> findByUserlevel(Object userlevel);

	public abstract List<Userinfo> findByIsallotman(Object isallotman);

	public abstract List<Userinfo> findByIscontroller(Object iscontroller);

	public abstract List<Userinfo> findByUserstatus(Object userstatus);

	public abstract List findAll();

	public abstract Userinfo merge(Userinfo detachedInstance);

	public abstract void attachDirty(Userinfo instance);

	public abstract void attachClean(Userinfo instance);
	
	//删除
	public abstract void updateStatue(Long id);
	
	//查询所有的启用的用户 
	public abstract List findAbledUser();
	
	//修改
	public abstract void update(Userinfo user);
	//根据部门查询用户
	public List<Userinfo> findUserByDept(Long deptid);
	//个人设置中的查询与修改
	public Userinfo findByuserid(long userid);
	public void updateforuserId(Userinfo user);
	
	public List<Userinfo> findBCondition(String name);

	//根据用户名查询
	public List<Userinfo> findbyUname(String name);
	
	//查询所有的分配人
	public List<Userinfo> findAllAbledAllotMan();
}