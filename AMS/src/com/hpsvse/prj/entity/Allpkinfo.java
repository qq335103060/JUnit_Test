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
 * Allpkinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ALLPKINFO", schema = "SYSTEM")
public class Allpkinfo implements java.io.Serializable {

	// Fields

	private Long rid;
	private Ipaddrinfo ipaddrinfo;
	private Mailinfo mailinfo;
	private Otherinfo otherinfo;
	private Comminfo comminfo;
	private Typeinfo typeinfo;
	private Telmeeting telmeeting;
	private Strroominfo strroominfo;
	private String pkdesc;
	private Set<Applyinfo> applyinfos = new HashSet<Applyinfo>(0);

	// Constructors

	/** default constructor */
	public Allpkinfo() {
	}

	/** full constructor */
	public Allpkinfo(Ipaddrinfo ipaddrinfo, Mailinfo mailinfo,
			Otherinfo otherinfo, Comminfo comminfo, Typeinfo typeinfo,
			Telmeeting telmeeting, Strroominfo strroominfo, String pkdesc,
			Set<Applyinfo> applyinfos) {
		this.ipaddrinfo = ipaddrinfo;
		this.mailinfo = mailinfo;
		this.otherinfo = otherinfo;
		this.comminfo = comminfo;
		this.typeinfo = typeinfo;
		this.telmeeting = telmeeting;
		this.strroominfo = strroominfo;
		this.pkdesc = pkdesc;
		this.applyinfos = applyinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "RID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getRid() {
		return this.rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IPID")
	public Ipaddrinfo getIpaddrinfo() {
		return this.ipaddrinfo;
	}

	public void setIpaddrinfo(Ipaddrinfo ipaddrinfo) {
		this.ipaddrinfo = ipaddrinfo;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MAILID")
	public Mailinfo getMailinfo() {
		return this.mailinfo;
	}

	public void setMailinfo(Mailinfo mailinfo) {
		this.mailinfo = mailinfo;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "OTHERID")
	public Otherinfo getOtherinfo() {
		return this.otherinfo;
	}

	public void setOtherinfo(Otherinfo otherinfo) {
		this.otherinfo = otherinfo;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "COMMID")
	public Comminfo getComminfo() {
		return this.comminfo;
	}

	public void setComminfo(Comminfo comminfo) {
		this.comminfo = comminfo;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TYPEID")
	public Typeinfo getTypeinfo() {
		return this.typeinfo;
	}

	public void setTypeinfo(Typeinfo typeinfo) {
		this.typeinfo = typeinfo;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TELID")
	public Telmeeting getTelmeeting() {
		return this.telmeeting;
	}

	public void setTelmeeting(Telmeeting telmeeting) {
		this.telmeeting = telmeeting;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ROOMID")
	public Strroominfo getStrroominfo() {
		return this.strroominfo;
	}

	public void setStrroominfo(Strroominfo strroominfo) {
		this.strroominfo = strroominfo;
	}

	@Column(name = "PKDESC", length = 20)
	public String getPkdesc() {
		return this.pkdesc;
	}

	public void setPkdesc(String pkdesc) {
		this.pkdesc = pkdesc;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "allpkinfo")
	public Set<Applyinfo> getApplyinfos() {
		return this.applyinfos;
	}

	public void setApplyinfos(Set<Applyinfo> applyinfos) {
		this.applyinfos = applyinfos;
	}

}