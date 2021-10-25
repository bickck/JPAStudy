package com.cos.blog.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import org.springframework.format.annotation.DateTimeFormat;

import com.cos.blog.List.BoardList;

@Entity
public class User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id 
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "USERNAME",nullable = true)
	private String name;
	
	
	@Column(name = "USERID",nullable = true)
	private String userId;
	
	@Column(name = "USERPW",nullable = true)
	private String userPw;
	
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
		return "User [id=" + id + ", name=" + name + ", user_id=" + userId + ", user_pw=" + userPw + ", userType="
				+ userType + ", list=" + list + ", date=" + date + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, id, list, name, userType, userId, userPw);
	}

	// 동일성 비교 : 인스턴스 참조 값을 비교, ==사용
	// 동등성 비교 : 인스턴스 값을 비교, equals()
	
	public User(String name, String user_id, String user_pw, UserType userType) {
		super();
		this.name = name;
		this.userId = user_id;
		this.userPw = user_pw;
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

	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
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
}
