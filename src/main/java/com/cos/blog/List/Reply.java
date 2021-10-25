package com.cos.blog.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Reply {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name ="CONTENT")
	private String content;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BOARDID")
	private BoardList boardID;
	
	@Column(name ="RECOMMAND")
	@ColumnDefault(value = "0")
	private int recommand;
	
	

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	//public Long getBoardID() {
	//	return boardID;
	//}

	//public void setBoardID(Long boardID) {
	//	this.boardID = boardID;
	//}

	public int getRecommand() {
		return recommand;
	}

	public void setRecommand(int recommand) {
		this.recommand = recommand;
	}
	
	
	

}
