package com.gaoxy.lifeinusa.entities;
// Generated 2015-9-1 22:37:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TWxAppinfo generated by hbm2java
 */
@Entity
@Table(name = "t_wx_appinfo")
public class TWxAppinfo implements java.io.Serializable {

	private String id;
	private String username;
	private String servicetype;
	private String wxname;
	private String wxdesc;
	private String appid;
	private String appsecret;
	private String appurl;
	private String apptoken;
	private String ecodingaeskey;
	private String encodingtype;
	private Date createtime;
	private Date lastupdatetime;

	public TWxAppinfo() {
	}

	public TWxAppinfo(String id, String username, String servicetype, String wxname, String wxdesc, String appid,
			String appsecret, String appurl, String apptoken, String ecodingaeskey, String encodingtype) {
		this.id = id;
		this.username = username;
		this.servicetype = servicetype;
		this.wxname = wxname;
		this.wxdesc = wxdesc;
		this.appid = appid;
		this.appsecret = appsecret;
		this.appurl = appurl;
		this.apptoken = apptoken;
		this.ecodingaeskey = ecodingaeskey;
		this.encodingtype = encodingtype;
	}

	public TWxAppinfo(String id, String username, String servicetype, String wxname, String wxdesc, String appid,
			String appsecret, String appurl, String apptoken, String ecodingaeskey, String encodingtype,
			Date createtime, Date lastupdatetime) {
		this.id = id;
		this.username = username;
		this.servicetype = servicetype;
		this.wxname = wxname;
		this.wxdesc = wxdesc;
		this.appid = appid;
		this.appsecret = appsecret;
		this.appurl = appurl;
		this.apptoken = apptoken;
		this.ecodingaeskey = ecodingaeskey;
		this.encodingtype = encodingtype;
		this.createtime = createtime;
		this.lastupdatetime = lastupdatetime;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false, length = 25)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "username", nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "servicetype", nullable = false, length = 10)
	public String getServicetype() {
		return this.servicetype;
	}

	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}

	@Column(name = "wxname", nullable = false, length = 45)
	public String getWxname() {
		return this.wxname;
	}

	public void setWxname(String wxname) {
		this.wxname = wxname;
	}

	@Column(name = "wxdesc", nullable = false, length = 200)
	public String getWxdesc() {
		return this.wxdesc;
	}

	public void setWxdesc(String wxdesc) {
		this.wxdesc = wxdesc;
	}

	@Column(name = "appid", nullable = false, length = 45)
	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	@Column(name = "appsecret", nullable = false, length = 45)
	public String getAppsecret() {
		return this.appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	@Column(name = "appurl", nullable = false, length = 256)
	public String getAppurl() {
		return this.appurl;
	}

	public void setAppurl(String appurl) {
		this.appurl = appurl;
	}

	@Column(name = "apptoken", nullable = false, length = 45)
	public String getApptoken() {
		return this.apptoken;
	}

	public void setApptoken(String apptoken) {
		this.apptoken = apptoken;
	}

	@Column(name = "ecodingaeskey", nullable = false, length = 45)
	public String getEcodingaeskey() {
		return this.ecodingaeskey;
	}

	public void setEcodingaeskey(String ecodingaeskey) {
		this.ecodingaeskey = ecodingaeskey;
	}

	@Column(name = "encodingtype", nullable = false, length = 10)
	public String getEncodingtype() {
		return this.encodingtype;
	}

	public void setEncodingtype(String encodingtype) {
		this.encodingtype = encodingtype;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createtime", length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastupdatetime", length = 0)
	public Date getLastupdatetime() {
		return this.lastupdatetime;
	}

	public void setLastupdatetime(Date lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

}
