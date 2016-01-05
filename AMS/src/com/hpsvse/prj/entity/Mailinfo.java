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
 * Mailinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MAILINFO", schema = "SYSTEM")
public class Mailinfo implements java.io.Serializable {

	// Fields

	private Long mailid;
	private Dictinfo dictinfo;
	private String roomsize;
	private String useadd;
	private String useuser;
	private String namespell;
	private String usetime;
	private String addamendreason;
	private String maildesc;
	private Set<Allpkinfo> allpkinfos = new HashSet<Allpkinfo>(0);

	// Constructors

	/** default constructor */
	public Mailinfo() {
	}

	/** minimal constructor */
	public Mailinfo(String roomsize, String useadd, String useuser,
			String namespell, String usetime, String addamendreason) {
		this.roomsize = roomsize;
		this.useadd = useadd;
		this.useuser = useuser;
		this.namespell = namespell;
		this.usetime = usetime;
		this.addamendreason = addamendreason;
	}

	/** full constructor */
	public Mailinfo(Dictinfo dictinfo, String roomsize, String useadd,
			String useuser, String namespell, String usetime,
			String addamendreason, String maildesc, Set<Allpkinfo> allpkinfos) {
		this.dictinfo = dictinfo;
		this.roomsize = roomsize;
		this.useadd = useadd;
		this.useuser = useuser;
		this.namespell = namespell;
		this.usetime = usetime;
		this.addamendreason = addamendreason;
		this.maildesc = maildesc;
		this.allpkinfos = allpkinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "MAILID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getMailid() {
		return this.mailid;
	}

	public void setMailid(Long mailid) {
		this.mailid = mailid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "APPTYPE")
	public Dictinfo getDictinfo() {
		return this.dictinfo;
	}

	public void setDictinfo(Dictinfo dictinfo) {
		this.dictinfo = dictinfo;
	}

	@Column(name = "ROOMSIZE", nullable = false, length = 20)
	public String getRoomsize() {
		return this.roomsize;
	}

	public void setRoomsize(String roomsize) {
		this.roomsize = roomsize;
	}

	@Column(name = "USEADD", nullable = false, length = 20)
	public String getUseadd() {
		return this.useadd;
	}

	public void setUseadd(String useadd) {
		this.useadd = useadd;
	}

	@Column(name = "USEUSER", nullable = false, length = 20)
	public String getUseuser() {
		return this.useuser;
	}

	public void setUseuser(String useuser) {
		this.useuser = useuser;
	}

	@Column(name = "NAMESPELL", nullable = false, length = 30)
	public String getNamespell() {
		return this.namespell;
	}

	public void setNamespell(String namespell) {
		this.namespell = namespell;
	}

	@Column(name = "USETIME", nullable = false, length = 20)
	public String getUsetime() {
		return this.usetime;
	}

	public void setUsetime(String usetime) {
		this.usetime = usetime;
	}

	@Column(name = "ADDAMENDREASON", nullable = false, length = 100)
	public String getAddamendreason() {
		return this.addamendreason;
	}

	public void setAddamendreason(String addamendreason) {
		this.addamendreason = addamendreason;
	}

	@Column(name = "MAILDESC", length = 20)
	public String getMaildesc() {
		return this.maildesc;
	}

	public void setMaildesc(String maildesc) {
		this.maildesc = maildesc;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "mailinfo")
	public Set<Allpkinfo> getAllpkinfos() {
		return this.allpkinfos;
	}

	public void setAllpkinfos(Set<Allpkinfo> allpkinfos) {
		this.allpkinfos = allpkinfos;
	}

}