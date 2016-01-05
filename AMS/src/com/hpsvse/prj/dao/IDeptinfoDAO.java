package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Deptinfo;

public interface IDeptinfoDAO {

	public abstract void save(Deptinfo transientInstance);

	public abstract void delete(Deptinfo persistentInstance);

	public abstract Deptinfo findById(java.lang.Long id);

	public abstract List<Deptinfo> findByExample(Deptinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Deptinfo> findByDeptname(Object deptname);

	public abstract List<Deptinfo> findByDeptdesc(Object deptdesc);

	public abstract List<Deptinfo> findByIsabled(Object isabled);

	public abstract List findAll();

	public abstract Deptinfo merge(Deptinfo detachedInstance);

	public abstract void attachDirty(Deptinfo instance);

	public abstract void attachClean(Deptinfo instance);

	
	//查询所有启用的部门
	public List<Deptinfo> findAbledDept(); 
	
	
	//删除
	public void deleteById(Long id);
	
	//修改
	public abstract void update(Deptinfo dept);
}