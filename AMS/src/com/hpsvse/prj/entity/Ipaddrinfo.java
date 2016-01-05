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
 * Ipaddrinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "IPADDRINFO", schema = "SYSTEM")
public class Ipaddrinfo implements java.io.Serializable {

	// Fields

	private Long ipid;
	private Long appnumber;
	private String useaddr;
	private String netnum;
	private String usetime;
	private String iddesc;
	private Set<Allpkinfo> allpkinfos = new HashSet<Allpkinfo>(0);

	// Constructors

	/** default constructor */
	public Ipaddrinfo() {
	}

	/** minimal constructor */
	public Ipaddrinfo(Long appnumber, String useaddr, String netnum) {
		this.appnumber = appnumber;
		this.useaddr = useaddr;
		this.netnum = netnum;
	}

	/** full constructor */
	public Ipaddrinfo(Long appnumber, String useaddr, String netnum,
			String usetime, String iddesc, Set<Allpkinfo> allpkinfos) {
		this.appnumber = appnumber;
		this.useaddr = useaddr;
		this.netnum = netnum;
		this.usetime = usetime;
		this.iddesc = iddesc;
		this.allpkinfos = allpkinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "IPID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getIpid() {
		return this.ipid;
	}

	public void setIpid(Long ipid) {
		this.ipid = ipid;
	}

	@Column(name = "APPNUMBER", nullable = false, precision = 22, scale = 0)
	public Long getAppnumber() {
		return this.appnumber;
	}

	public void setAppnumber(Long appnumber) {
		this.appnumber = appnumber;
	}

	@Column(name = "USEADDR", nullable = false, length = 30)
	public String getUseaddr() {
		return this.useaddr;
	}

	public void setUseaddr(String useaddr) {
		this.useaddr = useaddr;
	}

	@Column(name = "NETNUM", nullable = false, length = 20)
	public String getNetnum() {
		return this.netnum;
	}

	public void setNetnum(String netnum) {
		this.netnum = netnum;
	}

	@Column(name = "USETIME", length = 25)
	public String getUsetime() {
		return this.usetime;
	}

	public void setUsetime(String usetime) {
		this.usetime = usetime;
	}

	@Column(name = "IDDESC", length = 20)
	public String getIddesc() {
		return this.iddesc;
	}

	public void setIddesc(String iddesc) {
		this.iddesc = iddesc;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "ipaddrinfo")
	public Set<Allpkinfo> getAllpkinfos() {
		return this.allpkinfos;
	}

	public void setAllpkinfos(Set<Allpkinfo> allpkinfos) {
		this.allpkinfos = allpkinfos;
	}

}