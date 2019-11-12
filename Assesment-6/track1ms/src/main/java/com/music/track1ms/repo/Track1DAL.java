package com.music.track1ms.repo;

import java.util.List;

import com.music.track1ms.model.Track1;

public interface Track1DAL {

	public Track1 create(Track1 t1);
	
	public List<Track1> findAll();
	
	public Track1 findById(String id);
	
	public boolean delete(Track1 t1);
	
	public Track1 update(Track1 t1);
}

