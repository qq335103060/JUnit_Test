package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Ipaddrinfo;

public interface IIpaddrinfoDAO {

	public abstract void save(Ipaddrinfo transientInstance);

	public abstract void delete(Ipaddrinfo persistentInstance);

	public abstract Ipaddrinfo findById(java.lang.Long id);

	public abstract List<Ipaddrinfo> findByExample(Ipaddrinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Ipaddrinfo> findByUseaddr(Object useaddr);

	public abstract List<Ipaddrinfo> findByNetnum(Object netnum);

	public abstract List<Ipaddrinfo> findByUsetime(Object usetime);

	public abstract List<Ipaddrinfo> findByIddesc(Object iddesc);

	public abstract List findAll();

	public abstract Ipaddrinfo merge(Ipaddrinfo detachedInstance);

	public abstract void attachDirty(Ipaddrinfo instance);

	public abstract void attachClean(Ipaddrinfo instance);
	
	public void delete(Long id);
	
	//ÃÌº”ip…Í«Îµ•
	public Long AddipApply(Ipaddrinfo ipadd);

}