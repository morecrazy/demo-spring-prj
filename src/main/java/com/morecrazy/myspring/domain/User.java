package com.morecrazy.myspring.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3905789144255988661L;

	/**
	 * 锁定用户对应的状态值
	 */
	public static final int USER_LOCK = 1;
	/**
	 * 用户解锁对应的状态值
	 */
	public static final int USER_UNLOCK = 0;
	/**
	 * 管理员类型
	 */
	public static final int FORUM_ADMIN = 2;
	/**
	 * 普通用户类型
	 */
	public static final int NORMAL_USER = 1;

	private int userId;
	private String userName;
	private String password;
	private int credit;
	private int locked;
	private int userType = NORMAL_USER;
	private String lastIp;
	private Date lastVisit;

	private Set<Board> manBoards = new HashSet<Board>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public Date getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}

	public int getLocked() {
		return locked;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public Set<Board> getManBoards() {
		return manBoards;
	}

	public void setManBoards(Set<Board> manBoards) {
		this.manBoards = manBoards;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

}
