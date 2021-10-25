package com.cos.blog.List;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GeneratorType;

import com.cos.blog.User.User;


@Entity
public class BoardList {
	
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BOARDID")
	private Long id;
	
	@Column(name = "LISTNAME")
	private String head;
	
	@Column(name = "RECOMAND")
	@ColumnDefault(value = "0")
	private int recommand;
	
	@Column(name ="BODY")
	private String listBody;
	
	@Column(name ="USERNAME")
	private String userName;

	
	
	@OneToMany(mappedBy = "boardID")
	private List<Reply> replies = new ArrayList<Reply>();
	
	
	public BoardList(String head, String listBody, String username) {
		super();
		this.head = head;
		this.listBody = listBody;
		this.userName = username;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public String getUsername() {
		return userName;
	}


	public void setUsername(String username) {
		this.userName = username;
	}
	
	

}
