package com.hpsvse.prj.dao;

import java.util.List;


import com.hpsvse.prj.entity.Dictinfo;

public interface IDictinfoDAO {
     //添加
	public abstract void save(Dictinfo transientInstance);

	public abstract void delete(Dictinfo persistentInstance);
	//根据编号查询
	public abstract Dictinfo findById(java.lang.Long id);

	public abstract List<Dictinfo> findByExample(Dictinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Dictinfo> findByDictitem(Object dictitem);

	public abstract List<Dictinfo> findByDictvalue(Object dictvalue);

	public abstract List<Dictinfo> findByDictstatus(Object dictstatus);

	public abstract List findAll();

	public abstract Dictinfo merge(Dictinfo detachedInstance);

	public abstract void attachDirty(Dictinfo instance);

	public abstract void attachClean(Dictinfo instance);
	
	//查询所有启用字典值
	public List<Dictinfo> findAbledDict(); 
	

	
	//删除字典
	public void deleteById(Long id);
	
	//修改字典
	public abstract void update(Dictinfo dict);


}