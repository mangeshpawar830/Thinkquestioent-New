package com.fileHandling.serialization;

import java.io.Serializable;

public class User implements Serializable{
	private int userid;
	private String userName;
	private transient String passWord;
	
	
	
	public User() {
		super();
	}

	public User(int userid, String userName, String passWord) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.passWord = passWord;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
	

}
