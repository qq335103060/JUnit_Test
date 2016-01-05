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
	
	//ɾ��
	public abstract void updateStatue(Long id);
	
	//��ѯ���е����õ��û� 
	public abstract List findAbledUser();
	
	//�޸�
	public abstract void update(Userinfo user);
	//���ݲ��Ų�ѯ�û�
	public List<Userinfo> findUserByDept(Long deptid);
	//���������еĲ�ѯ���޸�
	public Userinfo findByuserid(long userid);
	public void updateforuserId(Userinfo user);
	
	public List<Userinfo> findBCondition(String name);

	//�����û�����ѯ
	public List<Userinfo> findbyUname(String name);
	
	//��ѯ���еķ�����
	public List<Userinfo> findAllAbledAllotMan();
}