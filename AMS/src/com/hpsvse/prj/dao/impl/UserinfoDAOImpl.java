package com.hpsvse.prj.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import com.hpsvse.prj.dao.IUserinfoDAO;
import com.hpsvse.prj.entity.Userinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Userinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hpsvse.prj.entity.Userinfo
 * @author MyEclipse Persistence Tools
 */
@Repository
public class UserinfoDAOImpl extends BaseDAOImpl implements IUserinfoDAO {
	private static final Log log = LogFactory.getLog(UserinfoDAOImpl.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String USERSEX = "usersex";
	public static final String USERPWD = "userpwd";
	public static final String USERTEL = "usertel";
	public static final String USERADD = "useradd";
	public static final String USERLEVEL = "userlevel";
	public static final String ISALLOTMAN = "isallotman";
	public static final String ISCONTROLLER = "iscontroller";
	public static final String USERSTATUS = "userstatus";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#save(com.hpsvse.prj.entity.Userinfo)
	 */
	public void save(Userinfo transientInstance) {
		log.debug("saving Userinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#delete(com.hpsvse.prj.entity.Userinfo)
	 */
	public void delete(Userinfo persistentInstance) {
		log.debug("deleting Userinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findById(java.lang.Long)
	 */
	public Userinfo findById(java.lang.Long id) {
		log.debug("getting Userinfo instance with id: " + id);
		try {
			Userinfo instance = (Userinfo) getHibernateTemplate().get(
					"com.hpsvse.prj.entity.Userinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByExample(com.hpsvse.prj.entity.Userinfo)
	 */
	public List<Userinfo> findByExample(Userinfo instance) {
		log.debug("finding Userinfo instance by example");
		try {
			List<Userinfo> results = (List<Userinfo>) getHibernateTemplate()
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
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Userinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Userinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByUsername(java.lang.Object)
	 */
	public List<Userinfo> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByUsersex(java.lang.Object)
	 */
	public List<Userinfo> findByUsersex(Object usersex) {
		return findByProperty(USERSEX, usersex);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByUserpwd(java.lang.Object)
	 */
	public List<Userinfo> findByUserpwd(Object userpwd) {
		return findByProperty(USERPWD, userpwd);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByUsertel(java.lang.Object)
	 */
	public List<Userinfo> findByUsertel(Object usertel) {
		return findByProperty(USERTEL, usertel);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByUseradd(java.lang.Object)
	 */
	public List<Userinfo> findByUseradd(Object useradd) {
		return findByProperty(USERADD, useradd);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByUserlevel(java.lang.Object)
	 */
	public List<Userinfo> findByUserlevel(Object userlevel) {
		return findByProperty(USERLEVEL, userlevel);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByIsallotman(java.lang.Object)
	 */
	public List<Userinfo> findByIsallotman(Object isallotman) {
		return findByProperty(ISALLOTMAN, isallotman);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByIscontroller(java.lang.Object)
	 */
	public List<Userinfo> findByIscontroller(Object iscontroller) {
		return findByProperty(ISCONTROLLER, iscontroller);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findByUserstatus(java.lang.Object)
	 */
	public List<Userinfo> findByUserstatus(Object userstatus) {
		return findByProperty(USERSTATUS, userstatus);
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Userinfo instances");
		try {
			String queryString = "from Userinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#merge(com.hpsvse.prj.entity.Userinfo)
	 */
	public Userinfo merge(Userinfo detachedInstance) {
		log.debug("merging Userinfo instance");
		try {
			Userinfo result = (Userinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#attachDirty(com.hpsvse.prj.entity.Userinfo)
	 */
	public void attachDirty(Userinfo instance) {
		log.debug("attaching dirty Userinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hpsvse.prj.dao.impl.IUserinfoDAO#attachClean(com.hpsvse.prj.entity.Userinfo)
	 */
	public void attachClean(Userinfo instance) {
		log.debug("attaching clean Userinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IUserinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IUserinfoDAO) ctx.getBean("UserinfoDAO");
	}
	
	
	//删除用户  修改用户状态为  【未启用 0】
	public  void updateStatue(Long id){
		Userinfo u=this.findById(id);
		u.setUserstatus(String.valueOf(0));
		
		this.getHibernateTemplate().update(u);
	}
	
	
	
	//查询所有的启用的用户 
	public List<Userinfo> findAbledUser(){
		return this.getHibernateTemplate().find("from Userinfo u where u.userstatus='1' and u.userlevel!='0' and u.userlevel!='1'");
	}
	
	//修改
	public void update(Userinfo user){
		this.getHibernateTemplate().update(user);
	}
	//根据部门查询用户
	public List<Userinfo> findUserByDept(Long deptid){
		List<Userinfo> userlist =this.getHibernateTemplate().find("from Userinfo user where user.deptinfo.deptid=? and user.userstatus='1'",deptid);
		return userlist;
	}
	
	//个人设置中的用户修改与查询
	public Userinfo findByuserid(long userid) {
		return this.getHibernateTemplate().get(Userinfo.class, userid);
	}

	public void updateforuserId(Userinfo user) {
		this.getHibernateTemplate().update(user);
	}
	
	
	
	//根据用户名 模糊查询
	public List<Userinfo> findBCondition(String name){
		return this.getHibernateTemplate().find("from Userinfo u where u.userstatus='1' and u.userlevel!='0' and u.userlevel!='1' and u.username like ?",name+"%");
	}
	
	//根据用户名查询呢
	public List<Userinfo> findbyUname(String name){
		return this.getHibernateTemplate().find("from Userinfo u where u.username=?",name);
	}
	
	//查询所有的分配人
	public List<Userinfo> findAllAbledAllotMan(){
		return this.getHibernateTemplate().find("from Userinfo u where u.userstatus='1' and u.isallotman='1'");
	}
}