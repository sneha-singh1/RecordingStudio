package com.music.artistms.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.music.artistms.model.Artist;

@Repository
public class ArtistDALImpl implements ArtistDAL{

	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Artist create(Artist a2){
		return mongo.insert(a2); 
	}

	@Override
	public List<Artist> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Artist.class);
	}

	@Override
	public Artist findByName(String name) {
		// TODO Auto-generated method stub
		return (Artist) mongo.findAndRemove(new Query(Criteria.where("name").is(name)),Artist.class);
	}

	@Override
	public boolean delete(Artist a2) {
		// TODO Auto-generated method stub
		return mongo.remove(a2).wasAcknowledged();
	}

	@Override
	public Artist update(Artist a2) {
		// TODO Auto-generated method stub
		return mongo.save(a2);
	}
}
