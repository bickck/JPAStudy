package com.cos.blog.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;

import com.cos.blog.List.BoardList;

import lombok.Data;

@Entity
//@Table(name = "USER")
public class User{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8197753800476393295L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "USER_NAME",nullable = true)
	private String name;
	
	@Column(name = "USER_ID",nullable = true)
	private String user_id;
	
	@Column(name = "USER_PW",nullable = true)
	private String user_pw;
	
	@Column(name =" TYPE" ,nullable = true)
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	@OneToMany(mappedBy = "username")
	private List<BoardList> list = new ArrayList<BoardList>();
	
	
	@DateTimeFormat
	private Date date;
	
	@PrePersist
	public void beforeCreate() {
		date = new Date();
	}
	
	public User() {
		
	}
	
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userType=" + userType + "]";
	}

	
	public User(String name, String user_id, String user_pw, UserType userType) {
		super();
		this.name = name;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.userType = userType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public List<BoardList> getList() {
		return list;
	}

	public void setList(List<BoardList> list) {
		this.list = list;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
