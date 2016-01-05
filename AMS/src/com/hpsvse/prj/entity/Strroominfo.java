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
 * Strroominfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "STRROOMINFO", schema = "SYSTEM")
public class Strroominfo implements java.io.Serializable {

	// Fields

	private Long roomid;
	private String roomneed;
	private String useradd;
	private String usetime;
	private String strdesc;
	private Set<Allpkinfo> allpkinfos = new HashSet<Allpkinfo>(0);

	// Constructors

	/** default constructor */
	public Strroominfo() {
	}

	/** minimal constructor */
	public Strroominfo(String roomneed, String useradd) {
		this.roomneed = roomneed;
		this.useradd = useradd;
	}

	/** full constructor */
	public Strroominfo(String roomneed, String useradd, String usetime,
			String strdesc, Set<Allpkinfo> allpkinfos) {
		this.roomneed = roomneed;
		this.useradd = useradd;
		this.usetime = usetime;
		this.strdesc = strdesc;
		this.allpkinfos = allpkinfos;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ROOMID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getRoomid() {
		return this.roomid;
	}

	public void setRoomid(Long roomid) {
		this.roomid = roomid;
	}

	@Column(name = "ROOMNEED", nullable = false, length = 20)
	public String getRoomneed() {
		return this.roomneed;
	}

	public void setRoomneed(String roomneed) {
		this.roomneed = roomneed;
	}

	@Column(name = "USERADD", nullable = false, length = 50)
	public String getUseradd() {
		return this.useradd;
	}

	public void setUseradd(String useradd) {
		this.useradd = useradd;
	}

	@Column(name = "USETIME", length = 25)
	public String getUsetime() {
		return this.usetime;
	}

	public void setUsetime(String usetime) {
		this.usetime = usetime;
	}

	@Column(name = "STRDESC", length = 20)
	public String getStrdesc() {
		return this.strdesc;
	}

	public void setStrdesc(String strdesc) {
		this.strdesc = strdesc;
	}
	@JSON(serialize=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "strroominfo")
	public Set<Allpkinfo> getAllpkinfos() {
		return this.allpkinfos;
	}

	public void setAllpkinfos(Set<Allpkinfo> allpkinfos) {
		this.allpkinfos = allpkinfos;
	}

}