package com.hpsvse.prj.entity;

import java.lang.Long;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.struts2.json.annotations.JSON;
import org.hibernate.annotations.GenericGenerator;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "USERINFO", schema = "SYSTEM")
public class Userinfo implements java.io.Serializable {

	// Fields

	private Long userid;
	private Deptinfo deptinfo;
	private String username;
	private String usersex;
	private String userpwd;
	private String usertel;
	private String useradd;
	private String userlevel;
	private String isallotman;
	private String isdirector;
	private String userstatus;
	private Set<Applyinfo> applyinfosForUserid = new HashSet<Applyinfo>(0);
	private Set<Applyinfo> applyinfosForAllotman = new HashSet<Applyinfo>(0);
	private Set<Applyinfo> applyinfosForAuditor = new HashSet<Applyinfo>(0);
	private Set<Applyinfo> applyinfosForDealby = new HashSet<Applyinfo>(0);
	private Set<Typeinfo> typeinfos = new HashSet<Typeinfo>(0);

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(String username, String usersex, String userpwd,
			String usertel, String useradd, String userlevel,
			String isallotman, String isdirector, String userstatus) {
		this.username = username;
		this.usersex = usersex;
		this.userpwd = userpwd;
		this.usertel = usertel;
		this.useradd = useradd;
		this.userlevel = userlevel;
		this.isallotman = isallotman;
		this.isdirector = isdirector;
		this.userstatus = userstatus;
	}

	/** full constructor */
	public Userinfo(Deptinfo deptinfo, String username, String usersex,
			String userpwd, String usertel, String useradd, String userlevel,
			String isallotman, String isdirector, String userstatus,
			Set<Applyinfo> applyinfosForUserid,
			Set<Applyinfo> applyinfosForAllotman,
			Set<Applyinfo> applyinfosForAuditor,
			Set<Applyinfo> applyinfosForDealby, Set<Typeinfo> typeinfos) {
		this.deptinfo = deptinfo;
		this.username = username;
		this.usersex = usersex;
		this.userpwd = userpwd;
		this.usertel = usertel;
		this.useradd = useradd;
		this.userlevel = userlevel;
		this.isallotman = isallotman;
		this.isdirector = isdirector;
		this.userstatus = userstatus;
		this.applyinfosForUserid = applyinfosForUserid;
		this.applyinfosForAllotman = applyinfosForAllotman;
		this.applyinfosForAuditor = applyinfosForAuditor;
		this.applyinfosForDealby = applyinfosForDealby;
		this.typeinfos = typeinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "USERID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DEPTID")
	public Deptinfo getDeptinfo() {
		return this.deptinfo;
	}

	public void setDeptinfo(Deptinfo deptinfo) {
		this.deptinfo = deptinfo;
	}

	@Column(name = "USERNAME", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "USERSEX", nullable = false, length = 2)
	public String getUsersex() {
		return this.usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	@Column(name = "USERPWD", nullable = false, length = 20)
	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	@Column(name = "USERTEL", nullable = false, length = 13)
	public String getUsertel() {
		return this.usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}

	@Column(name = "USERADD", nullable = false, length = 50)
	public String getUseradd() {
		return this.useradd;
	}

	public void setUseradd(String useradd) {
		this.useradd = useradd;
	}

	@Column(name = "USERLEVEL", nullable = false, length = 1)
	public String getUserlevel() {
		return this.userlevel;
	}

	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}

	@Column(name = "ISALLOTMAN", nullable = false, length = 1)
	public String getIsallotman() {
		return this.isallotman;
	}

	public void setIsallotman(String isallotman) {
		this.isallotman = isallotman;
	}

	@Column(name = "ISDIRECTOR", nullable = false, length = 1)
	public String getIsdirector() {
		return this.isdirector;
	}

	public void setIsdirector(String isdirector) {
		this.isdirector = isdirector;
	}

	@Column(name = "USERSTATUS", nullable = false, length = 1)
	public String getUserstatus() {
		return this.userstatus;
	}

	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userinfoByUserid")
	public Set<Applyinfo> getApplyinfosForUserid() {
		return this.applyinfosForUserid;
	}

	public void setApplyinfosForUserid(Set<Applyinfo> applyinfosForUserid) {
		this.applyinfosForUserid = applyinfosForUserid;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userinfoByAllotman")
	public Set<Applyinfo> getApplyinfosForAllotman() {
		return this.applyinfosForAllotman;
	}

	public void setApplyinfosForAllotman(Set<Applyinfo> applyinfosForAllotman) {
		this.applyinfosForAllotman = applyinfosForAllotman;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userinfoByAuditor")
	public Set<Applyinfo> getApplyinfosForAuditor() {
		return this.applyinfosForAuditor;
	}

	public void setApplyinfosForAuditor(Set<Applyinfo> applyinfosForAuditor) {
		this.applyinfosForAuditor = applyinfosForAuditor;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userinfoByDealby")
	public Set<Applyinfo> getApplyinfosForDealby() {
		return this.applyinfosForDealby;
	}

	public void setApplyinfosForDealby(Set<Applyinfo> applyinfosForDealby) {
		this.applyinfosForDealby = applyinfosForDealby;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userinfo")
	public Set<Typeinfo> getTypeinfos() {
		return this.typeinfos;
	}

	public void setTypeinfos(Set<Typeinfo> typeinfos) {
		this.typeinfos = typeinfos;
	}

}