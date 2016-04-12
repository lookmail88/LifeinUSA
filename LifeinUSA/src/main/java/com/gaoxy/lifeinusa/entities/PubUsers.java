package com.gaoxy.lifeinusa.entities;
// Generated 2015-9-1 22:37:47 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PubUsers generated by hbm2java
 */
@Entity
@Table(name = "pub_users")
public class PubUsers implements java.io.Serializable {

	private String userId;
	private String userAccount;
	private String userName;
	private String userPassword;
	private int enabled;
	private int issys;
	private String userDesc;
	private Set<PubUsersRoles> pubUsersRoleses = new HashSet<PubUsersRoles>(0);

	public PubUsers() {
	}

	public PubUsers(String userId, String userAccount, String userName, String userPassword, int enabled, int issys) {
		this.userId = userId;
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPassword = userPassword;
		this.enabled = enabled;
		this.issys = issys;
	}

	public PubUsers(String userId, String userAccount, String userName, String userPassword, int enabled, int issys,
			String userDesc, Set<PubUsersRoles> pubUsersRoleses) {
		this.userId = userId;
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPassword = userPassword;
		this.enabled = enabled;
		this.issys = issys;
		this.userDesc = userDesc;
		this.pubUsersRoleses = pubUsersRoleses;
	}

	@Id

	@Column(name = "user_id", unique = true, nullable = false, length = 32)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "user_account", nullable = false, length = 30)
	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	@Column(name = "user_name", nullable = false, length = 40)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_password", nullable = false, length = 100)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "enabled", nullable = false)
	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	@Column(name = "issys", nullable = false)
	public int getIssys() {
		return this.issys;
	}

	public void setIssys(int issys) {
		this.issys = issys;
	}

	@Column(name = "user_desc", length = 100)
	public String getUserDesc() {
		return this.userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pubUsers")
	public Set<PubUsersRoles> getPubUsersRoleses() {
		return this.pubUsersRoleses;
	}

	public void setPubUsersRoleses(Set<PubUsersRoles> pubUsersRoleses) {
		this.pubUsersRoleses = pubUsersRoleses;
	}

}
