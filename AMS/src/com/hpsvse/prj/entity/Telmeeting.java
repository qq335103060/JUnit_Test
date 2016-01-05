package com.hpsvse.prj.entity;
import java.lang.Long;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.struts2.json.annotations.JSON;
import org.hibernate.annotations.GenericGenerator;

/**
 * Telmeeting entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "TELMEETING", schema = "SYSTEM")
public class Telmeeting implements java.io.Serializable {

	// Fields

	private Long telid;
	private String meetadd;
	private Date startdate;
	private Date enddate;
	private Long jionnum;
	private String isgived;
	private String especialrequest;
	private String meetdesc;
	private Set<Allpkinfo> allpkinfos = new HashSet<Allpkinfo>(0);

	// Constructors

	/** default constructor */
	public Telmeeting() {
	}

	/** full constructor */
	public Telmeeting(String meetadd, Date startdate, Date enddate,
			Long jionnum, String isgived, String especialrequest,
			String meetdesc, Set<Allpkinfo> allpkinfos) {
		this.meetadd = meetadd;
		this.startdate = startdate;
		this.enddate = enddate;
		this.jionnum = jionnum;
		this.isgived = isgived;
		this.especialrequest = especialrequest;
		this.meetdesc = meetdesc;
		this.allpkinfos = allpkinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "TELID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getTelid() {
		return this.telid;
	}

	public void setTelid(Long telid) {
		this.telid = telid;
	}

	@Column(name = "MEETADD", length = 50)
	public String getMeetadd() {
		return this.meetadd;
	}

	public void setMeetadd(String meetadd) {
		this.meetadd = meetadd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STARTDATE", length = 7)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ENDDATE", length = 7)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column(name = "JIONNUM", precision = 22, scale = 0)
	public Long getJionnum() {
		return this.jionnum;
	}

	public void setJionnum(Long jionnum) {
		this.jionnum = jionnum;
	}

	@Column(name = "ISGIVED", length = 1)
	public String getIsgived() {
		return this.isgived;
	}

	public void setIsgived(String isgived) {
		this.isgived = isgived;
	}

	@Column(name = "ESPECIALREQUEST", length = 100)
	public String getEspecialrequest() {
		return this.especialrequest;
	}

	public void setEspecialrequest(String especialrequest) {
		this.especialrequest = especialrequest;
	}

	@Column(name = "MEETDESC", length = 20)
	public String getMeetdesc() {
		return this.meetdesc;
	}

	public void setMeetdesc(String meetdesc) {
		this.meetdesc = meetdesc;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "telmeeting")
	public Set<Allpkinfo> getAllpkinfos() {
		return this.allpkinfos;
	}

	public void setAllpkinfos(Set<Allpkinfo> allpkinfos) {
		this.allpkinfos = allpkinfos;
	}

}