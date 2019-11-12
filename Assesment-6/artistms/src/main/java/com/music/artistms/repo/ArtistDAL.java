package com.music.artistms.repo;

import java.util.List;

import com.music.artistms.model.Artist;

public interface ArtistDAL {

	public Artist create(Artist a2);
	
	public List<Artist> findAll();
	
	public Artist findByName(String name);
	
	public boolean delete(Artist a2);
	
	public Artist update(Artist a2);
}
