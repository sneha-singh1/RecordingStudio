package com.music.track1ms.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.music.track1ms.model.Track1;

@Repository
public class Track1DALImpl implements Track1DAL{

	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Track1 create(Track1 t1){
		return mongo.insert(t1); 
	}

	@Override
	public List<Track1> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Track1.class);
	}

	@Override
	public Track1 findById(String id) {
		// TODO Auto-generated method stub
		return (Track1) mongo.findAndRemove(new Query(Criteria.where("id").is(id)),Track1.class);
	}

	@Override
	public boolean delete(Track1 t1) {
		// TODO Auto-generated method stub
		return mongo.remove(t1).wasAcknowledged();
	}

	@Override
	public Track1 update(Track1 t1) {
		// TODO Auto-generated method stub
		return mongo.save(t1);
	}
}
