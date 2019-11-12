package com.music.albumsms.repo;

import java.util.List;

import com.music.albumsms.model.Album;

public interface AlbumDAL {

	public Album create(Album a1);
	
	public List<Album> findAll();
	
	public Album findById(String id);
	
	public boolean delete(Album a1);
	
	public Album update(Album a1);
}
