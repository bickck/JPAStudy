package com.cos.blog.User;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8197753800476393295L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "USER_NAME")
	private String name;
	
	@Column(name = "USER_ID")
	private String user_id;
	
	@Column(name = "USER_PW")
	private String user_pw;
	
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	
	private Date date;
	
	@PrePersist
	public void beforeCreate() {
		date = new Date();
	}
	
	public User() {
		
	}

	public User(int id, String name, String user_id, String user_pw) {
		super();
		this.id = id;
		this.name = name;
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	
}
