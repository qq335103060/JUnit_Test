package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Strroominfo;

public interface IStrroominfoDAO {

	public abstract void save(Strroominfo transientInstance);

	public abstract void delete(Strroominfo persistentInstance);

	public abstract Strroominfo findById(java.lang.Long id);

	public abstract List<Strroominfo> findByExample(Strroominfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Strroominfo> findByRoomneed(Object roomneed);

	public abstract List<Strroominfo> findByUseradd(Object useradd);

	public abstract List<Strroominfo> findByUsetime(Object usetime);

	public abstract List<Strroominfo> findByStrdesc(Object strdesc);

	public abstract List findAll();

	public abstract Strroominfo merge(Strroominfo detachedInstance);

	public abstract void attachDirty(Strroominfo instance);

	public abstract void attachClean(Strroominfo instance);
	public void delete(Long id);
	//============
	public Long addStrApp(Strroominfo str);

}