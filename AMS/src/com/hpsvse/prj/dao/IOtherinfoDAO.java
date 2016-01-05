package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Otherinfo;
import com.hpsvse.prj.entity.Strroominfo;

public interface IOtherinfoDAO {

	public abstract void save(Otherinfo transientInstance);

	public abstract void delete(Otherinfo persistentInstance);

	public abstract Otherinfo findById(java.lang.Long id);

	public abstract List<Otherinfo> findByExample(Otherinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Otherinfo> findByOtherdetail(Object otherdetail);

	public abstract List<Otherinfo> findByOtherdesc(Object otherdesc);

	public abstract List findAll();

	public abstract Otherinfo merge(Otherinfo detachedInstance);

	public abstract void attachDirty(Otherinfo instance);

	public abstract void attachClean(Otherinfo instance);
	public void delete(Long id);
	//======
	public Long addOthApp(Otherinfo oth);

}