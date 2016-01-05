package com.hpsvse.prj.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hpsvse.prj.dao.IApplyinfoDAO;
import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.entity.Userinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Applyinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Applyinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class ApplyinfoDAOImpl extends BaseDAOImpl implements IApplyinfoDAO {
	private static final Log log = LogFactory.getLog(ApplyinfoDAOImpl.class);
	// property constants
	public static final String APPTITLE = "apptitle";
	public static final String APPREASON = "appreason";
	public static final String DEALRESULT = "dealresult";
	public static final String SATISFACTYDEGREE = "satisfactydegree";
	public static final String APPDESC = "appdesc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#save(com.hpsvse.prj.entity.Applyinfo)
	 */
	public void save(Applyinfo transientInstance) {
		log.debug("saving Applyinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#delete(com.hpsvse.prj.entity.Applyinfo)
	 */
	public void delete(Applyinfo persistentInstance) {
		log.debug("deleting Applyinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findById(java.lang.Long)
	 */
	public Applyinfo findById(java.lang.Long id) {
		log.debug("getting Applyinfo instance with id: " + id);
		try {
			Applyinfo instance = (Applyinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Applyinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findByExample(com.hpsvse.prj.entity.Applyinfo)
	 */
	public List<Applyinfo> findByExample(Applyinfo instance) {
		log.debug("finding Applyinfo instance by example");
		try {
			List<Applyinfo> results = (List<Applyinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Applyinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Applyinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findByApptitle(java.lang.Object)
	 */
	public List<Applyinfo> findByApptitle(Object apptitle) {
		return findByProperty(APPTITLE, apptitle);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findByAppreason(java.lang.Object)
	 */
	public List<Applyinfo> findByAppreason(Object appreason) {
		return findByProperty(APPREASON, appreason);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findByDealresult(java.lang.Object)
	 */
	public List<Applyinfo> findByDealresult(Object dealresult) {
		return findByProperty(DEALRESULT, dealresult);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findBySatisfactydegree(java.lang.Object)
	 */
	public List<Applyinfo> findBySatisfactydegree(Object satisfactydegree) {
		return findByProperty(SATISFACTYDEGREE, satisfactydegree);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findByAppdesc(java.lang.Object)
	 */
	public List<Applyinfo> findByAppdesc(Object appdesc) {
		return findByProperty(APPDESC, appdesc);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Applyinfo instances");
		try {
			String queryString = "from Applyinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#merge(com.hpsvse.prj.entity.Applyinfo)
	 */
	public Applyinfo merge(Applyinfo detachedInstance) {
		log.debug("merging Applyinfo instance");
		try {
			Applyinfo result = (Applyinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#attachDirty(com.hpsvse.prj.entity.Applyinfo)
	 */
	public void attachDirty(Applyinfo instance) {
		log.debug("attaching dirty Applyinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IApplyinfoDAO#attachClean(com.hpsvse.prj.entity.Applyinfo)
	 */
	public void attachClean(Applyinfo instance) {
		log.debug("attaching clean Applyinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IApplyinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IApplyinfoDAO) ctx.getBean("ApplyinfoDAO");
	}
	public List<Applyinfo> findAllApprove(Applyinfo apply){
		Object[] obj = {apply.getDictinfo().getDictid(),apply.getUserinfoByUserid().getDeptinfo().getDeptid()};
		List<Applyinfo> list =this.getHibernateTemplate().find("from Applyinfo app inner join fetch app.userinfoByUserid " +
				" inner join fetch app.userinfoByUserid.deptinfo where  app.dictinfo.dictid=? and app.userinfoByUserid.deptinfo.deptid=?",obj);
		return list;
	}
	//分配人
	public List<Applyinfo> findAllFenpei(Applyinfo apply){
		Object[] obj = {apply.getDictinfo().getDictid(),apply.getAllpkinfo().getTypeinfo().getTypeid()};
		List<Applyinfo> list =this.getHibernateTemplate().find("from Applyinfo app " +
				"  where  app.dictinfo.dictid=? and app.allpkinfo.typeinfo.typeid=?",obj);
		
		return list;
	}
	
	//查询所有该处理的申请单
	public List<Applyinfo> findAllchuli(Applyinfo apply){
		Object[] obj = {apply.getDictinfo().getDictid(),apply.getUserinfoByDealby().getUserid()};
		List<Applyinfo> list =this.getHibernateTemplate().find("from Applyinfo app inner join fetch app.userinfoByUserid " +
				"where  app.dictinfo.dictid=? and app.userinfoByDealby.userid=?",obj);
		return list;
	}
	
	
	//查询当前编号
	public List<Applyinfo> findAllById(Long id){
		return this.getHibernateTemplate().find("from Applyinfo a where a.userinfoByUserid.userid=?",id);
	}
	
	//删除
	public void delete(Long id){
			Applyinfo app=this.findById(id);
			this.getHibernateTemplate().delete(app);
	}
	
	//修改
	public void update(Applyinfo apply){
		this.getHibernateTemplate().update(apply);
	}
	
	
}