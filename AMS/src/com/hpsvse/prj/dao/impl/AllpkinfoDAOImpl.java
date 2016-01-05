package com.hpsvse.prj.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.IAllpkinfoDAO;
import com.hpsvse.prj.entity.Allpkinfo;
import com.hpsvse.prj.entity.Applyinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Allpkinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Allpkinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class AllpkinfoDAOImpl extends BaseDAOImpl implements IAllpkinfoDAO {
	private static final Log log = LogFactory.getLog(AllpkinfoDAOImpl.class);
	// property constants
	public static final String PKDESC = "pkdesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#save(com.hpsvse.prj.entity.Allpkinfo)
	 */
	public void save(Allpkinfo transientInstance) {
		log.debug("saving Allpkinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#delete(com.hpsvse.prj.entity.Allpkinfo)
	 */
	public void delete(Allpkinfo persistentInstance) {
		log.debug("deleting Allpkinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#findById(java.lang.Long)
	 */
	public Allpkinfo findById(java.lang.Long id) {
		log.debug("getting Allpkinfo instance with id: " + id);
		try {
			Allpkinfo instance = (Allpkinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Allpkinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#findByExample(com.hpsvse.prj.entity.Allpkinfo)
	 */
	public List<Allpkinfo> findByExample(Allpkinfo instance) {
		log.debug("finding Allpkinfo instance by example");
		try {
			List<Allpkinfo> results = (List<Allpkinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Allpkinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Allpkinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#findByPkdesc(java.lang.Object)
	 */
	public List<Allpkinfo> findByPkdesc(Object pkdesc) {
		return findByProperty(PKDESC, pkdesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Allpkinfo instances");
		try {
			String queryString = "from Allpkinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#merge(com.hpsvse.prj.entity.Allpkinfo)
	 */
	public Allpkinfo merge(Allpkinfo detachedInstance) {
		log.debug("merging Allpkinfo instance");
		try {
			Allpkinfo result = (Allpkinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#attachDirty(com.hpsvse.prj.entity.Allpkinfo)
	 */
	public void attachDirty(Allpkinfo instance) {
		log.debug("attaching dirty Allpkinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IAllpkinfoDAO#attachClean(com.hpsvse.prj.entity.Allpkinfo)
	 */
	public void attachClean(Allpkinfo instance) {
		log.debug("attaching clean Allpkinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IAllpkinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IAllpkinfoDAO) ctx.getBean("AllpkinfoDAO");
	}
	
	//根据编号删除
	public void deleteById(Long id){
		Allpkinfo apk=this.findById(id);
		this.getHibernateTemplate().delete(apk);
		//this.getHibernateTemplate().clear();
	}
	//添加数据
	public Long addAllpk(Allpkinfo allpk){
		
		return (Long) this.getHibernateTemplate().save(allpk);
	}
}