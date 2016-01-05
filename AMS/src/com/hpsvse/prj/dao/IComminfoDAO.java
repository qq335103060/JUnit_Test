package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Comminfo;

public interface IComminfoDAO {

	public abstract void save(Comminfo transientInstance);

	public abstract void delete(Comminfo persistentInstance);

	public abstract Comminfo findById(java.lang.Long id);

	public abstract List<Comminfo> findByExample(Comminfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Comminfo> findByUseadd(Object useadd);

	public abstract List<Comminfo> findByOperateexplain(Object operateexplain);

	public abstract List<Comminfo> findByCommdesc(Object commdesc);

	public abstract List findAll();

	public abstract Comminfo merge(Comminfo detachedInstance);

	public abstract void attachDirty(Comminfo instance);

	public abstract void attachClean(Comminfo instance);
	
	public void delete(Long id);

	public Long addCommApp(Comminfo comm);

}