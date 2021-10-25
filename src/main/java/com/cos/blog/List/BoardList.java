package com.cos.blog.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GeneratorType;

import com.cos.blog.User.User;


@Entity
public class BoardList {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOARD_ID")
	private int id;
	
	@Column(name = "LIST_NAME")
	private String head;
	
	@Column(name = "RECOMAND")
	private int recommand;
	
	@Column(name ="Body")
	private String listBody;
	
	@ManyToOne
	private User username;


	
	
	public BoardList(String head, String listBody, User username) {
		super();
		this.head = head;
		this.listBody = listBody;
		this.username = username;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHead() {
		return head;
	}


	public void setHead(String head) {
		this.head = head;
	}


	public String getListBody() {
		return listBody;
	}


	public void setListBody(String listBody) {
		this.listBody = listBody;
	}


	public int getRecommand() {
		return recommand;
	}


	public void setRecommand(int recommand) {
		this.recommand = recommand;
	}


	public User getUsername() {
		return username;
	}


	public void setUsername(User username) {
		this.username = username;
	}
	
}
