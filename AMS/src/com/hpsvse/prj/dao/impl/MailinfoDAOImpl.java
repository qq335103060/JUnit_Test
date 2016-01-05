package com.hpsvse.prj.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.IMailinfoDAO;
import com.hpsvse.prj.entity.Mailinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Mailinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Mailinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class MailinfoDAOImpl extends BaseDAOImpl implements IMailinfoDAO {
	private static final Log log = LogFactory.getLog(MailinfoDAOImpl.class);
	// property constants
	public static final String ROOMSIZE = "roomsize";
	public static final String USEADD = "useadd";
	public static final String USEUSER = "useuser";
	public static final String NAMESPELL = "namespell";
	public static final String USETIME = "usetime";
	public static final String ADDAMENDREASON = "addamendreason";
	public static final String MAILDESC = "maildesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#save(com.hpsvse.prj.entity.Mailinfo)
	 */
	public void save(Mailinfo transientInstance) {
		log.debug("saving Mailinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#delete(com.hpsvse.prj.entity.Mailinfo)
	 */
	public void delete(Mailinfo persistentInstance) {
		log.debug("deleting Mailinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findById(java.lang.Long)
	 */
	public Mailinfo findById(java.lang.Long id) {
		log.debug("getting Mailinfo instance with id: " + id);
		try {
			Mailinfo instance = (Mailinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Mailinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByExample(com.hpsvse.prj.entity.Mailinfo)
	 */
	public List<Mailinfo> findByExample(Mailinfo instance) {
		log.debug("finding Mailinfo instance by example");
		try {
			List<Mailinfo> results = (List<Mailinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Mailinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Mailinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByRoomsize(java.lang.Object)
	 */
	public List<Mailinfo> findByRoomsize(Object roomsize) {
		return findByProperty(ROOMSIZE, roomsize);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByUseadd(java.lang.Object)
	 */
	public List<Mailinfo> findByUseadd(Object useadd) {
		return findByProperty(USEADD, useadd);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByUseuser(java.lang.Object)
	 */
	public List<Mailinfo> findByUseuser(Object useuser) {
		return findByProperty(USEUSER, useuser);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByNamespell(java.lang.Object)
	 */
	public List<Mailinfo> findByNamespell(Object namespell) {
		return findByProperty(NAMESPELL, namespell);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByUsetime(java.lang.Object)
	 */
	public List<Mailinfo> findByUsetime(Object usetime) {
		return findByProperty(USETIME, usetime);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByAddamendreason(java.lang.Object)
	 */
	public List<Mailinfo> findByAddamendreason(Object addamendreason) {
		return findByProperty(ADDAMENDREASON, addamendreason);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findByMaildesc(java.lang.Object)
	 */
	public List<Mailinfo> findByMaildesc(Object maildesc) {
		return findByProperty(MAILDESC, maildesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Mailinfo instances");
		try {
			String queryString = "from Mailinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#merge(com.hpsvse.prj.entity.Mailinfo)
	 */
	public Mailinfo merge(Mailinfo detachedInstance) {
		log.debug("merging Mailinfo instance");
		try {
			Mailinfo result = (Mailinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#attachDirty(com.hpsvse.prj.entity.Mailinfo)
	 */
	public void attachDirty(Mailinfo instance) {
		log.debug("attaching dirty Mailinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IMailinfoDAO#attachClean(com.hpsvse.prj.entity.Mailinfo)
	 */
	public void attachClean(Mailinfo instance) {
		log.debug("attaching clean Mailinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IMailinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IMailinfoDAO) ctx.getBean("MailinfoDAO");
	}
	
	public void delete(Long id){
		Mailinfo m=this.findById(id);
		this.getHibernateTemplate().delete(m);
	}
//Ìí¼Ó
	public Long addMailApp(Mailinfo mail) {
		// TODO Auto-generated method stub
		return (Long) this.getHibernateTemplate().save(mail);
	}
}