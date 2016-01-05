package com.hpsvse.prj.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.IDeptinfoDAO;
import com.hpsvse.prj.entity.Deptinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Deptinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Deptinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class DeptinfoDAOImpl extends BaseDAOImpl implements IDeptinfoDAO {
	private static final Log log = LogFactory.getLog(DeptinfoDAOImpl.class);
	// property constants
	public static final String DEPTNAME = "deptname";
	public static final String DEPTDESC = "deptdesc";
	public static final String ISABLED = "isabled";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#save(com.hpsvse.prj.entity.Deptinfo)
	 */
	public void save(Deptinfo transientInstance) {
		log.debug("saving Deptinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#delete(com.hpsvse.prj.entity.Deptinfo)
	 */
	public void delete(Deptinfo persistentInstance) {
		log.debug("deleting Deptinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#findById(java.lang.Long)
	 */
	public Deptinfo findById(java.lang.Long id) {
		log.debug("getting Deptinfo instance with id: " + id);
		try {
			Deptinfo instance = (Deptinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Deptinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#findByExample(com.hpsvse.prj.entity.Deptinfo)
	 */
	public List<Deptinfo> findByExample(Deptinfo instance) {
		log.debug("finding Deptinfo instance by example");
		try {
			List<Deptinfo> results = (List<Deptinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Deptinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Deptinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#findByDeptname(java.lang.Object)
	 */
	public List<Deptinfo> findByDeptname(Object deptname) {
		return findByProperty(DEPTNAME, deptname);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#findByDeptdesc(java.lang.Object)
	 */
	public List<Deptinfo> findByDeptdesc(Object deptdesc) {
		return findByProperty(DEPTDESC, deptdesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#findByIsabled(java.lang.Object)
	 */
	public List<Deptinfo> findByIsabled(Object isabled) {
		return findByProperty(ISABLED, isabled);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Deptinfo instances");
		try {
			String queryString = "from Deptinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#merge(com.hpsvse.prj.entity.Deptinfo)
	 */
	public Deptinfo merge(Deptinfo detachedInstance) {
		log.debug("merging Deptinfo instance");
		try {
			Deptinfo result = (Deptinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#attachDirty(com.hpsvse.prj.entity.Deptinfo)
	 */
	public void attachDirty(Deptinfo instance) {
		log.debug("attaching dirty Deptinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IDeptinfoDAO#attachClean(com.hpsvse.prj.entity.Deptinfo)
	 */
	public void attachClean(Deptinfo instance) {
		log.debug("attaching clean Deptinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IDeptinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IDeptinfoDAO) ctx.getBean("DeptinfoDAO");
	}
	
	
	
	//查询所有启用的部门
	public List<Deptinfo> findAbledDept(){
		return this.getHibernateTemplate().find("from Deptinfo d where d.isabled='1'");
	}
	
	
	//删除
	public void deleteById(Long id){
		Deptinfo d=this.findById(id);
		d.setIsabled(String.valueOf(0));
		
		this.getHibernateTemplate().update(d);	
	}
	
	
	//修改
	public  void update(Deptinfo dept){
		this.getHibernateTemplate().update(dept);
	}
}