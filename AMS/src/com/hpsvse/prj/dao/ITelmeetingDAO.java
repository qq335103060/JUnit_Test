package com.hpsvse.prj.dao;

import java.util.List;

import com.hpsvse.prj.entity.Telmeeting;

public interface ITelmeetingDAO {

	public abstract void save(Telmeeting transientInstance);

	public abstract void delete(Telmeeting persistentInstance);

	public abstract Telmeeting findById(java.lang.Long id);

	public abstract List<Telmeeting> findByExample(Telmeeting instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Telmeeting> findByMeetadd(Object meetadd);

	public abstract List<Telmeeting> findByIsgived(Object isgived);

	public abstract List<Telmeeting> findByEspecialrequest(
			Object especialrequest);

	public abstract List<Telmeeting> findByMeetdesc(Object meetdesc);

	public abstract List findAll();

	public abstract Telmeeting merge(Telmeeting detachedInstance);

	public abstract void attachDirty(Telmeeting instance);

	public abstract void attachClean(Telmeeting instance);
	public void delete(Long id);

	public Long addTelApp(Telmeeting telmeet);

}