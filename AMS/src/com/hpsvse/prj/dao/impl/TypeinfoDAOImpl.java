package com.hpsvse.prj.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.ITypeinfo;
import com.hpsvse.prj.entity.Typeinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Typeinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Typeinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class TypeinfoDAOImpl extends BaseDAOImpl implements ITypeinfo {
	private static final Log log = LogFactory.getLog(TypeinfoDAOImpl.class);
	// property constants
	public static final String TYPENAME = "typename";
	public static final String TYPEDESC = "typedesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#save(com.hpsvse.prj.entity.Typeinfo)
	 */
	public void save(Typeinfo transientInstance) {
		log.debug("saving Typeinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#delete(com.hpsvse.prj.entity.Typeinfo)
	 */
	public void delete(Typeinfo persistentInstance) {
		log.debug("deleting Typeinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#findById(java.lang.Long)
	 */
	public Typeinfo findById(java.lang.Long id) {
		log.debug("getting Typeinfo instance with id: " + id);
		try {
			Typeinfo instance = (Typeinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Typeinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#findByExample(com.hpsvse.prj.entity.Typeinfo)
	 */
	public List<Typeinfo> findByExample(Typeinfo instance) {
		log.debug("finding Typeinfo instance by example");
		try {
			List<Typeinfo> results = (List<Typeinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Typeinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Typeinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#findByTypename(java.lang.Object)
	 */
	public List<Typeinfo> findByTypename(Object typename) {
		return findByProperty(TYPENAME, typename);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#findByTypedesc(java.lang.Object)
	 */
	public List<Typeinfo> findByTypedesc(Object typedesc) {
		return findByProperty(TYPEDESC, typedesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#findAll()
	 */
	public List findAll() {
		log.debug("finding all Typeinfo instances");
		try {
			String queryString = "from Typeinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#merge(com.hpsvse.prj.entity.Typeinfo)
	 */
	public Typeinfo merge(Typeinfo detachedInstance) {
		log.debug("merging Typeinfo instance");
		try {
			Typeinfo result = (Typeinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#attachDirty(com.hpsvse.prj.entity.Typeinfo)
	 */
	public void attachDirty(Typeinfo instance) {
		log.debug("attaching dirty Typeinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.ITypeinfo#attachClean(com.hpsvse.prj.entity.Typeinfo)
	 */
	public void attachClean(Typeinfo instance) {
		log.debug("attaching clean Typeinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITypeinfo getFromApplicationContext(ApplicationContext ctx) {
		return (ITypeinfo) ctx.getBean("TypeinfoDAO");
	}
	public List<Typeinfo> findByuserId(Long userId){	
		
		List<Typeinfo> list = this.getHibernateTemplate().find("from Typeinfo type where type.userinfo.userid=?",userId);
		
		return list;
	}
	
	public List findAbledType(){
		return this.getHibernateTemplate().find("from Typeinfo t where t.isabled='1'");
	}
	
	//É¾³ý
	public void deleteById(Long id){
		Typeinfo t=this.findById(id);
		t.setIsabled(String.valueOf(0));
		
		this.getHibernateTemplate().update(t);
		
	}
	
	
	//ÐÞ¸Ä
	public  void update(Typeinfo type){
		this.getHibernateTemplate().update(type);
	}

	
}
