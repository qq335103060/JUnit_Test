package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Applyinfo;

public interface IApplyinfoDAO {

	public abstract void save(Applyinfo transientInstance);

	public abstract void delete(Applyinfo persistentInstance);

	public abstract Applyinfo findById(java.lang.Long id);

	public abstract List<Applyinfo> findByExample(Applyinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Applyinfo> findByApptitle(Object apptitle);

	public abstract List<Applyinfo> findByAppreason(Object appreason);

	public abstract List<Applyinfo> findByDealresult(Object dealresult);

	public abstract List<Applyinfo> findBySatisfactydegree(
			Object satisfactydegree);

	public abstract List<Applyinfo> findByAppdesc(Object appdesc);

	public abstract List findAll();

	public abstract Applyinfo merge(Applyinfo detachedInstance);

	public abstract void attachDirty(Applyinfo instance);

	public abstract void attachClean(Applyinfo instance);
	
	public List<Applyinfo> findAllApprove(Applyinfo apply);
	
	public List<Applyinfo> findAllFenpei(Applyinfo apply);
	//��ѯ���е�ǰ��½�˵���Ҫ��������뵥	
	public List<Applyinfo> findAllchuli(Applyinfo apply);

	//��ѯ��ǰ����û����е����뵥
	public List<Applyinfo> findAllById(Long id);
	
	//ɾ��
	public void delete(Long id);
	
	//�޸�
	public void update(Applyinfo apply);
	
}