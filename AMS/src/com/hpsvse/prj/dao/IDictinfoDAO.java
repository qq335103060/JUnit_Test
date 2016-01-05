package com.hpsvse.prj.dao;

import java.util.List;


import com.hpsvse.prj.entity.Dictinfo;

public interface IDictinfoDAO {
     //���
	public abstract void save(Dictinfo transientInstance);

	public abstract void delete(Dictinfo persistentInstance);
	//���ݱ�Ų�ѯ
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
	
	//��ѯ���������ֵ�ֵ
	public List<Dictinfo> findAbledDict(); 
	

	
	//ɾ���ֵ�
	public void deleteById(Long id);
	
	//�޸��ֵ�
	public abstract void update(Dictinfo dict);


}