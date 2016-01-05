package com.hpsvse.prj.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.IOtherinfoDAO;
import com.hpsvse.prj.entity.Otherinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Otherinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Otherinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class OtherinfoDAOImpl extends BaseDAOImpl implements IOtherinfoDAO {
	private static final Log log = LogFactory.getLog(OtherinfoDAOImpl.class);
	// property constants
	public static final String OTHERDETAIL = "otherdetail";
	public static final String OTHERDESC = "otherdesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#save(com.hpsvse.prj.entity.Otherinfo)
	 */
	public void save(Otherinfo transientInstance) {
		log.debug("saving Otherinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#delete(com.hpsvse.prj.entity.Otherinfo)
	 */
	public void delete(Otherinfo persistentInstance) {
		log.debug("deleting Otherinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#findById(java.lang.Long)
	 */
	public Otherinfo findById(java.lang.Long id) {
		log.debug("getting Otherinfo instance with id: " + id);
		try {
			Otherinfo instance = (Otherinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Otherinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#findByExample(com.hpsvse.prj.entity.Otherinfo)
	 */
	public List<Otherinfo> findByExample(Otherinfo instance) {
		log.debug("finding Otherinfo instance by example");
		try {
			List<Otherinfo> results = (List<Otherinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Otherinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Otherinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#findByOtherdetail(java.lang.Object)
	 */
	public List<Otherinfo> findByOtherdetail(Object otherdetail) {
		return findByProperty(OTHERDETAIL, otherdetail);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#findByOtherdesc(java.lang.Object)
	 */
	public List<Otherinfo> findByOtherdesc(Object otherdesc) {
		return findByProperty(OTHERDESC, otherdesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#findAll()
	 */
	public List findAll() {
		log.debug("finding all Otherinfo instances");
		try {
			String queryString = "from Otherinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#merge(com.hpsvse.prj.entity.Otherinfo)
	 */
	public Otherinfo merge(Otherinfo detachedInstance) {
		log.debug("merging Otherinfo instance");
		try {
			Otherinfo result = (Otherinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#attachDirty(com.hpsvse.prj.entity.Otherinfo)
	 */
	public void attachDirty(Otherinfo instance) {
		log.debug("attaching dirty Otherinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IOtherinfo#attachClean(com.hpsvse.prj.entity.Otherinfo)
	 */
	public void attachClean(Otherinfo instance) {
		log.debug("attaching clean Otherinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IOtherinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IOtherinfoDAO) ctx.getBean("OtherinfoDAO");
	}
	
	public void delete(Long id){
		this.getHibernateTemplate().delete(this.findById(id));
	}

	public Long addOthApp(Otherinfo oth) {
		// TODO Auto-generated method stub
		return (Long) this.getHibernateTemplate().save(oth);
	}
}