package com.common.model;

public class Comments {
	private int id;
	private String username;
	private String commitdate;
	private String content;
	private int bioid;
	private int userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCommitdate() {
		return commitdate;
	}

	public void setCommitdate(String commitdate) {
		this.commitdate = commitdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBioid() {
		return bioid;
	}

	public void setBioid(int bioid) {
		this.bioid = bioid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}
