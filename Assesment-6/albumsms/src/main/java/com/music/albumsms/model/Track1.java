package com.music.albumsms.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;


public class Track1 {

	@Id
	private String id;
	private String trackname;
	
	@DBRef
	private List<Artist> a2;

	public Track1(){
	}
	
	public Track1(String id, String trackname, List<Artist> a2) {
		super();
		this.id = id;
		this.trackname = trackname;
		this.a2 = a2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrackname() {
		return trackname;
	}

	public void setTrackname(String trackname) {
		this.trackname = trackname;
	}

	public List<Artist> geta2() {
		return a2;
	}

	public void seta2(List<Artist> a2) {
		this.a2 = a2;
	}

	
	
}
