package com.music.albumsms.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
public class Artist {

	@Id
	private String id;
	private String name;
	
	@DBRef
	private List <Album> a1;
	
	@DBRef
	private List <Track1> t1;
	
	public Artist(){
	}

	
	public Artist(String id, String name, List<Album> a1, List<Track1> t1) {
		super();
		this.id = id;
		this.name = name;
		this.a1 = a1;
		this.t1 = t1;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Album> getA1() {
		return a1;
	}

	public void setA1(List<Album> a1) {
		this.a1 = a1;
	}

	public List<Track1> getT1() {
		return t1;
	}

	public void setT1(List<Track1> t1) {
		this.t1 = t1;
	}
	
	
}
