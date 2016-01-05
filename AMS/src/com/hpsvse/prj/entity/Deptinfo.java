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
 * Deptinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DEPTINFO", schema = "SYSTEM")
public class Deptinfo implements java.io.Serializable {

	// Fields

	private Long deptid;
	private String deptname;
	private String deptdesc;
	private String isabled;
	private Set<Userinfo> userinfos = new HashSet<Userinfo>(0);

	// Constructors

	/** default constructor */
	public Deptinfo() {
	}

	/** minimal constructor */
	public Deptinfo(String deptname, String isabled) {
		this.deptname = deptname;
		this.isabled = isabled;
	}

	/** full constructor */
	public Deptinfo(String deptname, String deptdesc, String isabled,
			Set<Userinfo> userinfos) {
		this.deptname = deptname;
		this.deptdesc = deptdesc;
		this.isabled = isabled;
		this.userinfos = userinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "DEPTID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getDeptid() {
		return this.deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}

	@Column(name = "DEPTNAME", nullable = false, length = 20)
	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@Column(name = "DEPTDESC", length = 50)
	public String getDeptdesc() {
		return this.deptdesc;
	}

	public void setDeptdesc(String deptdesc) {
		this.deptdesc = deptdesc;
	}

	@Column(name = "ISABLED", nullable = false, length = 1)
	public String getIsabled() {
		return this.isabled;
	}

	public void setIsabled(String isabled) {
		this.isabled = isabled;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "deptinfo")
	public Set<Userinfo> getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set<Userinfo> userinfos) {
		this.userinfos = userinfos;
	}

}