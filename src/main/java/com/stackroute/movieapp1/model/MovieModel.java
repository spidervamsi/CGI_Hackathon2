package com.stackroute.movieapp1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document(collection="movies")
public class MovieModel {
	@Id
	private String id;
	private String MovieName;
	
	private String Description;
//	public String getMovieID() {
//		return id;
//	}
//	public void setMovieID(String movieID) {
//		id = movieID;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
//	
//	public MovieModel(String id, String movieName, String description) {
//		super();
//		this.id = id;
//		MovieName = movieName;
//		Description = description;
//	}
//	public MovieModel()
//	{}	
	
}
