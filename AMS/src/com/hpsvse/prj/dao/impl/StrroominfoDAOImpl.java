package com.hpsvse.prj.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.IStrroominfoDAO;
import com.hpsvse.prj.entity.Strroominfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Strroominfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Strroominfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class StrroominfoDAOImpl extends BaseDAOImpl implements IStrroominfoDAO {
	private static final Log log = LogFactory.getLog(StrroominfoDAOImpl.class);
	// property constants
	public static final String ROOMNEED = "roomneed";
	public static final String USERADD = "useradd";
	public static final String USETIME = "usetime";
	public static final String STRDESC = "strdesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#save(com.hpsvse.prj.entity.Strroominfo)
	 */
	public void save(Strroominfo transientInstance) {
		log.debug("saving Strroominfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#delete(com.hpsvse.prj.entity.Strroominfo)
	 */
	public void delete(Strroominfo persistentInstance) {
		log.debug("deleting Strroominfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#findById(java.lang.Long)
	 */
	public Strroominfo findById(java.lang.Long id) {
		log.debug("getting Strroominfo instance with id: " + id);
		try {
			Strroominfo instance = (Strroominfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Strroominfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#findByExample(com.hpsvse.prj.entity.Strroominfo)
	 */
	public List<Strroominfo> findByExample(Strroominfo instance) {
		log.debug("finding Strroominfo instance by example");
		try {
			List<Strroominfo> results = (List<Strroominfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Strroominfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Strroominfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#findByRoomneed(java.lang.Object)
	 */
	public List<Strroominfo> findByRoomneed(Object roomneed) {
		return findByProperty(ROOMNEED, roomneed);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#findByUseradd(java.lang.Object)
	 */
	public List<Strroominfo> findByUseradd(Object useradd) {
		return findByProperty(USERADD, useradd);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#findByUsetime(java.lang.Object)
	 */
	public List<Strroominfo> findByUsetime(Object usetime) {
		return findByProperty(USETIME, usetime);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#findByStrdesc(java.lang.Object)
	 */
	public List<Strroominfo> findByStrdesc(Object strdesc) {
		return findByProperty(STRDESC, strdesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Strroominfo instances");
		try {
			String queryString = "from Strroominfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#merge(com.hpsvse.prj.entity.Strroominfo)
	 */
	public Strroominfo merge(Strroominfo detachedInstance) {
		log.debug("merging Strroominfo instance");
		try {
			Strroominfo result = (Strroominfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#attachDirty(com.hpsvse.prj.entity.Strroominfo)
	 */
	public void attachDirty(Strroominfo instance) {
		log.debug("attaching dirty Strroominfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IStrroominfoDAO#attachClean(com.hpsvse.prj.entity.Strroominfo)
	 */
	public void attachClean(Strroominfo instance) {
		log.debug("attaching clean Strroominfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IStrroominfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (IStrroominfoDAO) ctx.getBean("StrroominfoDAO");
	}
	
	public void delete(Long id){
		this.getHibernateTemplate().delete(this.findById(id));
	}

	public Long addStrApp(Strroominfo str) {
		// TODO Auto-generated method stub
		return (Long) this.getHibernateTemplate().save(str);
	}
}