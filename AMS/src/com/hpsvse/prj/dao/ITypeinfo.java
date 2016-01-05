package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Typeinfo;

public interface ITypeinfo {

	public abstract void save(Typeinfo transientInstance);

	public abstract void delete(Typeinfo persistentInstance);

	public abstract Typeinfo findById(java.lang.Long id);

	public abstract List<Typeinfo> findByExample(Typeinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Typeinfo> findByTypename(Object typename);

	public abstract List<Typeinfo> findByTypedesc(Object typedesc);

	public abstract List findAll();

	public abstract Typeinfo merge(Typeinfo detachedInstance);

	public abstract void attachDirty(Typeinfo instance);

	public abstract void attachClean(Typeinfo instance);
	
	public List<Typeinfo> findByuserId(Long userId);

	public List findAbledType();
	
	//É¾³ý
	public void deleteById(Long id);
	
	//ÐÞ¸Ä
	public abstract void update(Typeinfo type);
	
}