package com.music.albumsms.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.music.albumsms.model.Album;

@Repository
public class AlbumDALImpl implements AlbumDAL{

	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Album create(Album a1){
		return mongo.insert(a1); 
	}

	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Album.class);
	}

	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return (Album) mongo.findAndRemove(new Query(Criteria.where("id").is(id)),Album.class);
	}

	@Override
	public boolean delete(Album a1) {
		// TODO Auto-generated method stub
		return mongo.remove(a1).wasAcknowledged();
	}

	@Override
	public Album update(Album a1) {
		// TODO Auto-generated method stub
		return mongo.save(a1);
	}
}
