package com.hpsvse.prj.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import com.hpsvse.prj.dao.IDictinfoDAO;
import com.hpsvse.prj.entity.Dictinfo;


/**
 * A data access object (DAO) providing persistence and search support for
 * Dictinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Dictinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class DictinfoDAOImpl extends BaseDAOImpl implements IDictinfoDAO {
	private static final Log log = LogFactory.getLog(DictinfoDAOImpl.class);
	// property constants
	public static final String DICTITEM = "dictitem";
	public static final String DICTVALUE = "dictvalue";
	public static final String DICTSTATUS = "dictstatus";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#save(com.hpsvse.prj.entity.Dictinfo)
	 */
          //Ìí¼Ó×Öµä
	public void save(Dictinfo transientInstance) {
		log.debug("saving Dictinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#delete(com.hpsvse.prj.entity.Dictinfo)
	 */
	public void delete(Dictinfo persistentInstance) {
		log.debug("deleting Dictinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#findById(java.lang.Long)
	 */
	public Dictinfo findById(java.lang.Long id) {
		log.debug("getting Dictinfo instance with id: " + id);
		try {
			Dictinfo instance = (Dictinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Dictinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#findByExample(com.hpsvse.prj.entity.Dictinfo)
	 */
	public List<Dictinfo> findByExample(Dictinfo instance) {
		log.debug("finding Dictinfo instance by example");
		try {
			List<Dictinfo> results = (List<Dictinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Dictinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dictinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#findByDictitem(java.lang.Object)
	 */
	public List<Dictinfo> findByDictitem(Object dictitem) {
		return findByProperty(DICTITEM, dictitem);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#findByDictvalue(java.lang.Object)
	 */
	public List<Dictinfo> findByDictvalue(Object dictvalue) {
		return findByProperty(DICTVALUE, dictvalue);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#findByDictstatus(java.lang.Object)
	 */
	public List<Dictinfo> findByDictstatus(Object dictstatus) {
		return findByProperty(DICTSTATUS, dictstatus);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Dictinfo instances");
		try {
			String queryString = "from Dictinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#merge(com.hpsvse.prj.entity.Dictinfo)
	 */
	public Dictinfo merge(Dictinfo detachedInstance) {
		log.debug("merging Dictinfo instance");
		try {
			Dictinfo result = (Dictinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#attachDirty(com.hpsvse.prj.entity.Dictinfo)
	 */
	public void attachDirty(Dictinfo instance) {
		log.debug("attaching dirty Dictinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDictinfoDAO#attachClean(com.hpsvse.prj.entity.Dictinfo)
	 */
	public void attachClean(Dictinfo instance) {
		log.debug("attaching clean Dictinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IDictinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IDictinfoDAO) ctx.getBean("DictinfoDAO");
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		Dictinfo u=this.findById(id);
		
		u.setDictstatus(String.valueOf(0));
		
		this.getHibernateTemplate().update(u);
		
	}

	public List<Dictinfo> findAbledDict() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Dictinfo d where d.dictstatus='1'");
	}

	public void update(Dictinfo dict) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(dict);
		
	}


}