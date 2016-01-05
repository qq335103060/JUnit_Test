package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Allpkinfo;

public interface IAllpkinfoDAO {

	public abstract void save(Allpkinfo transientInstance);

	public abstract void delete(Allpkinfo persistentInstance);

	public abstract Allpkinfo findById(java.lang.Long id);

	public abstract List<Allpkinfo> findByExample(Allpkinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Allpkinfo> findByPkdesc(Object pkdesc);

	public abstract List findAll();

	public abstract Allpkinfo merge(Allpkinfo detachedInstance);

	public abstract void attachDirty(Allpkinfo instance);

	public abstract void attachClean(Allpkinfo instance);
	
	public void deleteById(Long id);
	//Ìí¼ÓÊý¾Ý
	public Long addAllpk(Allpkinfo allpk);

}