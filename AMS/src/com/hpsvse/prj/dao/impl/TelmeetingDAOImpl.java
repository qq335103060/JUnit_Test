package com.hpsvse.prj.dao.impl;

import java.lang.Long;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.ITelmeetingDAO;
import com.hpsvse.prj.entity.Telmeeting;

/**
 * A data access object (DAO) providing persistence and search support for
 * Telmeeting entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Telmeeting
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TelmeetingDAOImpl extends BaseDAOImpl implements ITelmeetingDAO {
	private static final Log log = LogFactory.getLog(TelmeetingDAOImpl.class);
	// property constants
	public static final String MEETADD = "meetadd";
	public static final String ISGIVED = "isgived";
	public static final String ESPECIALREQUEST = "especialrequest";
	public static final String MEETDESC = "meetdesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#save(com.hpsvse.prj.entity.Telmeeting)
	 */
	public void save(Telmeeting transientInstance) {
		log.debug("saving Telmeeting instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#delete(com.hpsvse.prj.entity.Telmeeting)
	 */
	public void delete(Telmeeting persistentInstance) {
		log.debug("deleting Telmeeting instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#findById(java.lang.Long)
	 */
	public Telmeeting findById(java.lang.Long id) {
		log.debug("getting Telmeeting instance with id: " + id);
		try {
			Telmeeting instance = (Telmeeting) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Telmeeting", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#findByExample(com.hpsvse.prj.entity.Telmeeting)
	 */
	public List<Telmeeting> findByExample(Telmeeting instance) {
		log.debug("finding Telmeeting instance by example");
		try {
			List<Telmeeting> results = (List<Telmeeting>) getHibernateTemplate()
					.findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Telmeeting instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Telmeeting as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#findByMeetadd(java.lang.Object)
	 */
	public List<Telmeeting> findByMeetadd(Object meetadd) {
		return findByProperty(MEETADD, meetadd);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#findByIsgived(java.lang.Object)
	 */
	public List<Telmeeting> findByIsgived(Object isgived) {
		return findByProperty(ISGIVED, isgived);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#findByEspecialrequest(java.lang.Object)
	 */
	public List<Telmeeting> findByEspecialrequest(Object especialrequest) {
		return findByProperty(ESPECIALREQUEST, especialrequest);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#findByMeetdesc(java.lang.Object)
	 */
	public List<Telmeeting> findByMeetdesc(Object meetdesc) {
		return findByProperty(MEETDESC, meetdesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Telmeeting instances");
		try {
			String queryString = "from Telmeeting";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#merge(com.hpsvse.prj.entity.Telmeeting)
	 */
	public Telmeeting merge(Telmeeting detachedInstance) {
		log.debug("merging Telmeeting instance");
		try {
			Telmeeting result = (Telmeeting) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#attachDirty(com.hpsvse.prj.entity.Telmeeting)
	 */
	public void attachDirty(Telmeeting instance) {
		log.debug("attaching dirty Telmeeting instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITelmeetingDAO#attachClean(com.hpsvse.prj.entity.Telmeeting)
	 */
	public void attachClean(Telmeeting instance) {
		log.debug("attaching clean Telmeeting instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITelmeetingDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ITelmeetingDAO) ctx.getBean("TelmeetingDAO");
	}
	
	public void delete(Long id){
		this.getHibernateTemplate().delete(this.findById(id));
	}
	//添加电话会议申请单
	public Long addTelApp(Telmeeting telmeet) {
		// TODO Auto-generated method stub
		return (Long) this.getHibernateTemplate().save(telmeet);
	}
}