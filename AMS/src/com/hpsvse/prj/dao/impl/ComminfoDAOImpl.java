package com.hpsvse.prj.dao.impl;

import java.lang.Long;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.IComminfoDAO;
import com.hpsvse.prj.entity.Comminfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Comminfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Comminfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class ComminfoDAOImpl extends BaseDAOImpl implements IComminfoDAO {
	private static final Log log = LogFactory.getLog(ComminfoDAOImpl.class);
	// property constants
	public static final String USEADD = "useadd";
	public static final String OPERATEEXPLAIN = "operateexplain";
	public static final String COMMDESC = "commdesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#save(com.hpsvse.prj.entity.Comminfo)
	 */
	public void save(Comminfo transientInstance) {
		log.debug("saving Comminfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#delete(com.hpsvse.prj.entity.Comminfo)
	 */
	public void delete(Comminfo persistentInstance) {
		log.debug("deleting Comminfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#findById(java.lang.Long)
	 */
	public Comminfo findById(java.lang.Long id) {
		log.debug("getting Comminfo instance with id: " + id);
		try {
			Comminfo instance = (Comminfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Comminfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#findByExample(com.hpsvse.prj.entity.Comminfo)
	 */
	public List<Comminfo> findByExample(Comminfo instance) {
		log.debug("finding Comminfo instance by example");
		try {
			List<Comminfo> results = (List<Comminfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Comminfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Comminfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#findByUseadd(java.lang.Object)
	 */
	public List<Comminfo> findByUseadd(Object useadd) {
		return findByProperty(USEADD, useadd);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#findByOperateexplain(java.lang.Object)
	 */
	public List<Comminfo> findByOperateexplain(Object operateexplain) {
		return findByProperty(OPERATEEXPLAIN, operateexplain);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#findByCommdesc(java.lang.Object)
	 */
	public List<Comminfo> findByCommdesc(Object commdesc) {
		return findByProperty(COMMDESC, commdesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Comminfo instances");
		try {
			String queryString = "from Comminfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#merge(com.hpsvse.prj.entity.Comminfo)
	 */
	public Comminfo merge(Comminfo detachedInstance) {
		log.debug("merging Comminfo instance");
		try {
			Comminfo result = (Comminfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#attachDirty(com.hpsvse.prj.entity.Comminfo)
	 */
	public void attachDirty(Comminfo instance) {
		log.debug("attaching dirty Comminfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IComminfoDAO#attachClean(com.hpsvse.prj.entity.Comminfo)
	 */
	public void attachClean(Comminfo instance) {
		log.debug("attaching clean Comminfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IComminfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IComminfoDAO) ctx.getBean("ComminfoDAO");
	}
	

	public void delete(Long id){
		Comminfo comm=this.findById(id);
		this.getHibernateTemplate().delete(comm);
	}
	public Long addCommApp(Comminfo comm) {
		// TODO Auto-generated method stub
		return (Long) this.getHibernateTemplate().save(comm);
	}
}