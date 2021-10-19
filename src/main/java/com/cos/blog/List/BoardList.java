package com.cos.blog.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.cos.blog.User.User;


@Entity
public class BoardList {
	
	
	@Id
	@Column(name = "BOARD_ID")
	private int id;
	
	@Column(name = "LIST_NAME")
	private String name;
	
	@Column(name = "RECOMAND")
	private int recommand;
	

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = true)
	private User username;

}
