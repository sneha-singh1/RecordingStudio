package com.music.track1ms.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Album {

	@Id
	private String id;
	private String albumname;
	
	@DBRef
	private List <Artist> a2;
	
	@DBRef
	private List <Track1> t1;
	
	public Album(){
	}
	

	public Album(String id, String albumname, List<Artist> a2, List<Track1> t1) {
		super();
		this.id = id;
		this.albumname = albumname;
		this.a2 = a2;
		this.t1 = t1;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlbumname() {
		return albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public List<Artist> getA2() {
		return a2;
	}

	public void setA2(List<Artist> a2) {
		this.a2 = a2;
	}

	public List<Track1> getT1() {
		return t1;
	}

	public void setT1(List<Track1> t1) {
		this.t1 = t1;
	}

	
}
