package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Mailinfo;

public interface IMailinfoDAO {

	public abstract void save(Mailinfo transientInstance);

	public abstract void delete(Mailinfo persistentInstance);

	public abstract Mailinfo findById(java.lang.Long id);

	public abstract List<Mailinfo> findByExample(Mailinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Mailinfo> findByRoomsize(Object roomsize);

	public abstract List<Mailinfo> findByUseadd(Object useadd);

	public abstract List<Mailinfo> findByUseuser(Object useuser);

	public abstract List<Mailinfo> findByNamespell(Object namespell);

	public abstract List<Mailinfo> findByUsetime(Object usetime);

	public abstract List<Mailinfo> findByAddamendreason(Object addamendreason);

	public abstract List<Mailinfo> findByMaildesc(Object maildesc);

	public abstract List findAll();

	public abstract Mailinfo merge(Mailinfo detachedInstance);

	public abstract void attachDirty(Mailinfo instance);

	public abstract void attachClean(Mailinfo instance);
	
	
	public void delete(Long id);
	
	//Ìí¼Ó
	public Long addMailApp(Mailinfo mail);
}