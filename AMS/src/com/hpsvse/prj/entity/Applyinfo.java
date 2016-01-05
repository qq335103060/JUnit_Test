package com.hpsvse.prj.entity;
import java.lang.Long;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

/**
 * Applyinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "APPLYINFO", schema = "SYSTEM")
public class Applyinfo implements java.io.Serializable {

	// Fields

	private Long appid;
	private Userinfo userinfoByAuditor;
	private Userinfo userinfoByAllotman;
	private Userinfo userinfoByUserid;
	private Userinfo userinfoByDealby;
	private Dictinfo dictinfo;
	private Allpkinfo allpkinfo;
	private String apptitle;
	private String appreason;
	private Date appdate;
	private Date auditdate;
	private Date allotdate;
	private Date dealdate;
	private String dealresult;
	private String satisfactydegree;
	private String appdesc;

	// Constructors

	/** default constructor */
	public Applyinfo() {
	}

	/** minimal constructor */
	public Applyinfo(String apptitle, String appreason) {
		this.apptitle = apptitle;
		this.appreason = appreason;
	}

	/** full constructor */
	public Applyinfo(Userinfo userinfoByAuditor, Userinfo userinfoByAllotman,
			Userinfo userinfoByUserid, Userinfo userinfoByDealby,
			Dictinfo dictinfo, Allpkinfo allpkinfo, String apptitle,
			String appreason, Date appdate, Date auditdate, Date allotdate,
			Date dealdate, String dealresult, String satisfactydegree,
			String appdesc) {
		this.userinfoByAuditor = userinfoByAuditor;
		this.userinfoByAllotman = userinfoByAllotman;
		this.userinfoByUserid = userinfoByUserid;
		this.userinfoByDealby = userinfoByDealby;
		this.dictinfo = dictinfo;
		this.allpkinfo = allpkinfo;
		this.apptitle = apptitle;
		this.appreason = appreason;
		this.appdate = appdate;
		this.auditdate = auditdate;
		this.allotdate = allotdate;
		this.dealdate = dealdate;
		this.dealresult = dealresult;
		this.satisfactydegree = satisfactydegree;
		this.appdesc = appdesc;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "APPID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getAppid() {
		return this.appid;
	}

	public void setAppid(Long appid) {
		this.appid = appid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "AUDITOR")
	public Userinfo getUserinfoByAuditor() {
		return this.userinfoByAuditor;
	}

	public void setUserinfoByAuditor(Userinfo userinfoByAuditor) {
		this.userinfoByAuditor = userinfoByAuditor;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ALLOTMAN")
	public Userinfo getUserinfoByAllotman() {
		return this.userinfoByAllotman;
	}

	public void setUserinfoByAllotman(Userinfo userinfoByAllotman) {
		this.userinfoByAllotman = userinfoByAllotman;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USERID")
	public Userinfo getUserinfoByUserid() {
		return this.userinfoByUserid;
	}

	public void setUserinfoByUserid(Userinfo userinfoByUserid) {
		this.userinfoByUserid = userinfoByUserid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DEALBY")
	public Userinfo getUserinfoByDealby() {
		return this.userinfoByDealby;
	}

	public void setUserinfoByDealby(Userinfo userinfoByDealby) {
		this.userinfoByDealby = userinfoByDealby;
	}

	@ManyToOne(fetch = FetchType.EAGER,cascade={CascadeType.ALL})
	@JoinColumn(name = "APPSTATUS")
	public Dictinfo getDictinfo() {
		return this.dictinfo;
	}

	public void setDictinfo(Dictinfo dictinfo) {
		this.dictinfo = dictinfo;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "RID")
	public Allpkinfo getAllpkinfo() {
		return this.allpkinfo;
	}

	public void setAllpkinfo(Allpkinfo allpkinfo) {
		this.allpkinfo = allpkinfo;
	}

	@Column(name = "APPTITLE", nullable = false, length = 30)
	public String getApptitle() {
		return this.apptitle;
	}

	public void setApptitle(String apptitle) {
		this.apptitle = apptitle;
	}

	@Column(name = "APPREASON", nullable = false, length = 50)
	public String getAppreason() {
		return this.appreason;
	}

	public void setAppreason(String appreason) {
		this.appreason = appreason;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "APPDATE", length = 7)
	public Date getAppdate() {
		return this.appdate;
	}

	public void setAppdate(Date appdate) {
		this.appdate = appdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AUDITDATE", length = 7)
	public Date getAuditdate() {
		return this.auditdate;
	}

	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ALLOTDATE", length = 7)
	public Date getAllotdate() {
		return this.allotdate;
	}

	public void setAllotdate(Date allotdate) {
		this.allotdate = allotdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DEALDATE", length = 7)
	public Date getDealdate() {
		return this.dealdate;
	}

	public void setDealdate(Date dealdate) {
		this.dealdate = dealdate;
	}

	@Column(name = "DEALRESULT", length = 20)
	public String getDealresult() {
		return this.dealresult;
	}

	public void setDealresult(String dealresult) {
		this.dealresult = dealresult;
	}

	@Column(name = "SATISFACTYDEGREE", length = 2)
	public String getSatisfactydegree() {
		return this.satisfactydegree;
	}

	public void setSatisfactydegree(String satisfactydegree) {
		this.satisfactydegree = satisfactydegree;
	}

	@Column(name = "APPDESC", length = 20)
	public String getAppdesc() {
		return this.appdesc;
	}

	public void setAppdesc(String appdesc) {
		this.appdesc = appdesc;
	}

}