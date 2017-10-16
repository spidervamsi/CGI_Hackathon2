package com.stackroute.movieapp1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document(collection="Hackathon")
public class MovieModel {
	@Id
	private String Emailid;
//	public MovieModel(String emailid, String username) {
//		super();
//		this.Emailid = emailid;
//		this.username = username;
//	}
	private String username;
	public MovieModel() {
		
	}
    public MovieModel(String Emailid,String username) {
		this.Emailid=Emailid;
		this.username=username;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	
}