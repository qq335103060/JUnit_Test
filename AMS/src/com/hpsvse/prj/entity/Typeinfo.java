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
 * Typeinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "TYPEINFO", schema = "SYSTEM")
public class Typeinfo implements java.io.Serializable {

	// Fields

	private Long typeid;
	private Userinfo userinfo;
	private String typename;
	private String isabled;
	private String typedesc;
	private Set<Allpkinfo> allpkinfos = new HashSet<Allpkinfo>(0);

	// Constructors

	/** default constructor */
	public Typeinfo() {
	}

	/** minimal constructor */
	public Typeinfo(Userinfo userinfo, String typename,String isabled) {
		this.userinfo = userinfo;
		this.typename = typename;
		this.isabled=isabled;
	}

	/** full constructor */
	public Typeinfo(Userinfo userinfo, String typename, String typedesc,String isabled,
			Set<Allpkinfo> allpkinfos) {
		this.userinfo = userinfo;
		this.typename = typename;
		this.typedesc = typedesc;
		this.isabled=isabled;
		this.allpkinfos = allpkinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "TYPEID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TYPEUSERID", nullable = false)
	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	@Column(name = "TYPENAME", nullable = false, length = 50)
	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	@Column(name = "ISABLED", nullable = false, length = 1)
	public String getIsabled() {
		return isabled;
	}

	public void setIsabled(String isabled) {
		this.isabled = isabled;
	}

	
	
	
	@Column(name = "TYPEDESC", length = 20)
	public String getTypedesc() {
		return this.typedesc;
	}

	public void setTypedesc(String typedesc) {
		this.typedesc = typedesc;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "typeinfo")
	public Set<Allpkinfo> getAllpkinfos() {
		return this.allpkinfos;
	}

	public void setAllpkinfos(Set<Allpkinfo> allpkinfos) {
		this.allpkinfos = allpkinfos;
	}

}