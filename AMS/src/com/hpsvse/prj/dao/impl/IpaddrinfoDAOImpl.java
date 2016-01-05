package com.hpsvse.prj.dao.impl;

import java.lang.Long;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import com.hpsvse.prj.dao.IIpaddrinfoDAO;
import com.hpsvse.prj.entity.Ipaddrinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ipaddrinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Ipaddrinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class IpaddrinfoDAOImpl extends BaseDAOImpl implements IIpaddrinfoDAO {
	private static final Log log = LogFactory.getLog(IpaddrinfoDAOImpl.class);
	// property constants
	public static final String USEADDR = "useaddr";
	public static final String NETNUM = "netnum";
	public static final String USETIME = "usetime";
	public static final String IDDESC = "iddesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#save(com.hpsvse.prj.entity.Ipaddrinfo)
	 */
	public void save(Ipaddrinfo transientInstance) {
		log.debug("saving Ipaddrinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#delete(com.hpsvse.prj.entity.Ipaddrinfo)
	 */
	public void delete(Ipaddrinfo persistentInstance) {
		log.debug("deleting Ipaddrinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#findById(java.lang.Long)
	 */
	public Ipaddrinfo findById(java.lang.Long id) {
		log.debug("getting Ipaddrinfo instance with id: " + id);
		try {
			Ipaddrinfo instance = (Ipaddrinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Ipaddrinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#findByExample(com.hpsvse.prj.entity.Ipaddrinfo)
	 */
	public List<Ipaddrinfo> findByExample(Ipaddrinfo instance) {
		log.debug("finding Ipaddrinfo instance by example");
		try {
			List<Ipaddrinfo> results = (List<Ipaddrinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Ipaddrinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ipaddrinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#findByUseaddr(java.lang.Object)
	 */
	public List<Ipaddrinfo> findByUseaddr(Object useaddr) {
		return findByProperty(USEADDR, useaddr);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#findByNetnum(java.lang.Object)
	 */
	public List<Ipaddrinfo> findByNetnum(Object netnum) {
		return findByProperty(NETNUM, netnum);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#findByUsetime(java.lang.Object)
	 */
	public List<Ipaddrinfo> findByUsetime(Object usetime) {
		return findByProperty(USETIME, usetime);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#findByIddesc(java.lang.Object)
	 */
	public List<Ipaddrinfo> findByIddesc(Object iddesc) {
		return findByProperty(IDDESC, iddesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Ipaddrinfo instances");
		try {
			String queryString = "from Ipaddrinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#merge(com.hpsvse.prj.entity.Ipaddrinfo)
	 */
	public Ipaddrinfo merge(Ipaddrinfo detachedInstance) {
		log.debug("merging Ipaddrinfo instance");
		try {
			Ipaddrinfo result = (Ipaddrinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#attachDirty(com.hpsvse.prj.entity.Ipaddrinfo)
	 */
	public void attachDirty(Ipaddrinfo instance) {
		log.debug("attaching dirty Ipaddrinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IIpaddrinfoDAO#attachClean(com.hpsvse.prj.entity.Ipaddrinfo)
	 */
	public void attachClean(Ipaddrinfo instance) {
		log.debug("attaching clean Ipaddrinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IIpaddrinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IIpaddrinfoDAO) ctx.getBean("IpaddrinfoDAO");
	}
	
	public void delete(Long id){
		Ipaddrinfo ipadd=this.findById(id);
		this.getHibernateTemplate().delete(ipadd);
	}
	//ÃÌº”ip…Í«Îµ•  
	public Long AddipApply(Ipaddrinfo ipadd){
		
		return (Long) this.getHibernateTemplate().save(ipadd);
	}
}