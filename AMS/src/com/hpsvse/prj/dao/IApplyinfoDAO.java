package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Applyinfo;

public interface IApplyinfoDAO {

	public abstract void save(Applyinfo transientInstance);

	public abstract void delete(Applyinfo persistentInstance);

	public abstract Applyinfo findById(java.lang.Long id);

	public abstract List<Applyinfo> findByExample(Applyinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Applyinfo> findByApptitle(Object apptitle);

	public abstract List<Applyinfo> findByAppreason(Object appreason);

	public abstract List<Applyinfo> findByDealresult(Object dealresult);

	public abstract List<Applyinfo> findBySatisfactydegree(
			Object satisfactydegree);

	public abstract List<Applyinfo> findByAppdesc(Object appdesc);

	public abstract List findAll();

	public abstract Applyinfo merge(Applyinfo detachedInstance);

	public abstract void attachDirty(Applyinfo instance);

	public abstract void attachClean(Applyinfo instance);
	
	public List<Applyinfo> findAllApprove(Applyinfo apply);
	
	public List<Applyinfo> findAllFenpei(Applyinfo apply);
	//查询所有当前登陆人的需要处理的申请单	
	public List<Applyinfo> findAllchuli(Applyinfo apply);

	//查询当前编号用户所有的申请单
	public List<Applyinfo> findAllById(Long id);
	
	//删除
	public void delete(Long id);
	
	//修改
	public void update(Applyinfo apply);
	
}