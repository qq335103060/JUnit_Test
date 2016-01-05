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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.struts2.json.annotations.JSON;
import org.hibernate.annotations.GenericGenerator;

/**
 * Dictinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DICTINFO", schema = "SYSTEM")
public class Dictinfo implements java.io.Serializable {

	// Fields

	private Long dictid;
	private String dictitem;
	private String dictvalue;
	private String dictstatus;
	private Set<Applyinfo> applyinfos = new HashSet<Applyinfo>(0);
	private Set<Mailinfo> mailinfos = new HashSet<Mailinfo>(0);
	private Set<Comminfo> comminfos = new HashSet<Comminfo>(0);

	// Constructors

	/** default constructor */
	public Dictinfo() {
	}

	/** minimal constructor */
	public Dictinfo(String dictitem, String dictvalue, String dictstatus) {
		this.dictitem = dictitem;
		this.dictvalue = dictvalue;
		this.dictstatus = dictstatus;
	}

	/** full constructor */
	public Dictinfo(String dictitem, String dictvalue, String dictstatus,
			Set<Applyinfo> applyinfos, Set<Mailinfo> mailinfos,
			Set<Comminfo> comminfos) {
		this.dictitem = dictitem;
		this.dictvalue = dictvalue;
		this.dictstatus = dictstatus;
		this.applyinfos = applyinfos;
		this.mailinfos = mailinfos;
		this.comminfos = comminfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "DICTID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getDictid() {
		return this.dictid;
	}

	public void setDictid(Long dictid) {
		this.dictid = dictid;
	}

	@Column(name = "DICTITEM", nullable = false, length = 10)
	public String getDictitem() {
		return this.dictitem;
	}

	public void setDictitem(String dictitem) {
		this.dictitem = dictitem;
	}

	@Column(name = "DICTVALUE", nullable = false, length = 5)
	public String getDictvalue() {
		return this.dictvalue;
	}

	public void setDictvalue(String dictvalue) {
		this.dictvalue = dictvalue;
	}

	@Column(name = "DICTSTATUS", nullable = false, length = 1)
	public String getDictstatus() {
		return this.dictstatus;
	}

	public void setDictstatus(String dictstatus) {
		this.dictstatus = dictstatus;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dictinfo")
	public Set<Applyinfo> getApplyinfos() {
		return this.applyinfos;
	}

	public void setApplyinfos(Set<Applyinfo> applyinfos) {
		this.applyinfos = applyinfos;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dictinfo")
	public Set<Mailinfo> getMailinfos() {
		return this.mailinfos;
	}

	public void setMailinfos(Set<Mailinfo> mailinfos) {
		this.mailinfos = mailinfos;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dictinfo")
	public Set<Comminfo> getComminfos() {
		return this.comminfos;
	}

	public void setComminfos(Set<Comminfo> comminfos) {
		this.comminfos = comminfos;
	}

}