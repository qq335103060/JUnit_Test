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
 * Comminfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "COMMINFO", schema = "SYSTEM")
public class Comminfo implements java.io.Serializable {

	// Fields

	private Long commid;
	private Dictinfo dictinfo;
	private Long finishdate;
	private String useadd;
	private Long usercount;
	private String operateexplain;
	private String commdesc;
	private Set<Allpkinfo> allpkinfos = new HashSet<Allpkinfo>(0);

	// Constructors

	/** default constructor */
	public Comminfo() {
	}

	/** minimal constructor */
	public Comminfo(Long finishdate, String useadd, Long usercount) {
		this.finishdate = finishdate;
		this.useadd = useadd;
		this.usercount = usercount;
	}

	/** full constructor */
	public Comminfo(Dictinfo dictinfo, Long finishdate, String useadd,
			Long usercount, String operateexplain, String commdesc,
			Set<Allpkinfo> allpkinfos) {
		this.dictinfo = dictinfo;
		this.finishdate = finishdate;
		this.useadd = useadd;
		this.usercount = usercount;
		this.operateexplain = operateexplain;
		this.commdesc = commdesc;
		this.allpkinfos = allpkinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "COMMID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getCommid() {
		return this.commid;
	}

	public void setCommid(Long commid) {
		this.commid = commid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PROPERTY")
	public Dictinfo getDictinfo() {
		return this.dictinfo;
	}

	public void setDictinfo(Dictinfo dictinfo) {
		this.dictinfo = dictinfo;
	}

	@Column(name = "FINISHDATE", nullable = false, precision = 22, scale = 0)
	public Long getFinishdate() {
		return this.finishdate;
	}

	public void setFinishdate(Long finishdate) {
		this.finishdate = finishdate;
	}

	@Column(name = "USEADD", nullable = false, length = 50)
	public String getUseadd() {
		return this.useadd;
	}

	public void setUseadd(String useadd) {
		this.useadd = useadd;
	}

	@Column(name = "USERCOUNT", nullable = false, precision = 22, scale = 0)
	public Long getUsercount() {
		return this.usercount;
	}

	public void setUsercount(Long usercount) {
		this.usercount = usercount;
	}

	@Column(name = "OPERATEEXPLAIN", length = 25)
	public String getOperateexplain() {
		return this.operateexplain;
	}

	public void setOperateexplain(String operateexplain) {
		this.operateexplain = operateexplain;
	}

	@Column(name = "COMMDESC", length = 20)
	public String getCommdesc() {
		return this.commdesc;
	}

	public void setCommdesc(String commdesc) {
		this.commdesc = commdesc;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "comminfo")
	public Set<Allpkinfo> getAllpkinfos() {
		return this.allpkinfos;
	}

	public void setAllpkinfos(Set<Allpkinfo> allpkinfos) {
		this.allpkinfos = allpkinfos;
	}

}