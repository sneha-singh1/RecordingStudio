package com.music.track1ms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.music.track1ms.model.Track1;
import com.music.track1ms.repo.Track1DALImpl;

@RestController
public class Track1Controller {

	@Autowired
	private Track1DALImpl repo;

	@RequestMapping(value = "/track", method = RequestMethod.GET, produces = "application/json")
	public List<Track1> firstPage() {

		return repo.findAll();
	}

	@PostMapping("/track")
	public void create(@RequestBody Track1 t1) {
		repo.create(t1);
		System.out.println(t1 + " insert");
	}

	@DeleteMapping(path = { "/Track1/{id}" })
	public Track1 delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Track1 deletedt1 = repo.findById(id);
		System.out.println(deletedt1);

		if (repo.delete(deletedt1))
			return deletedt1;
		else
			return null;
	}

	@PutMapping("/Track1")
	public Track1 update(@RequestBody Track1 t1) {
		repo.update(t1);

		System.out.println(t1 + " updated");
		return t1;
	}

}

