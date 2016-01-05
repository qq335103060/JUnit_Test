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
 * Otherinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "OTHERINFO", schema = "SYSTEM")
public class Otherinfo implements java.io.Serializable {

	// Fields

	private Long otherid;
	private String otherdetail;
	private String otherdesc;
	private Set<Allpkinfo> allpkinfos = new HashSet<Allpkinfo>(0);

	// Constructors

	/** default constructor */
	public Otherinfo() {
	}

	/** minimal constructor */
	public Otherinfo(String otherdetail) {
		this.otherdetail = otherdetail;
	}

	/** full constructor */
	public Otherinfo(String otherdetail, String otherdesc,
			Set<Allpkinfo> allpkinfos) {
		this.otherdetail = otherdetail;
		this.otherdesc = otherdesc;
		this.allpkinfos = allpkinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "OTHERID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getOtherid() {
		return this.otherid;
	}

	public void setOtherid(Long otherid) {
		this.otherid = otherid;
	}

	@Column(name = "OTHERDETAIL", nullable = false, length = 100)
	public String getOtherdetail() {
		return this.otherdetail;
	}

	public void setOtherdetail(String otherdetail) {
		this.otherdetail = otherdetail;
	}

	@Column(name = "OTHERDESC", length = 20)
	public String getOtherdesc() {
		return this.otherdesc;
	}

	public void setOtherdesc(String otherdesc) {
		this.otherdesc = otherdesc;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "otherinfo")
	public Set<Allpkinfo> getAllpkinfos() {
		return this.allpkinfos;
	}

	public void setAllpkinfos(Set<Allpkinfo> allpkinfos) {
		this.allpkinfos = allpkinfos;
	}

}