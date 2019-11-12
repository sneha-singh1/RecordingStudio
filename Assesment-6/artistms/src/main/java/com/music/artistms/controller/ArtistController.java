package com.music.artistms.controller;

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

import com.music.artistms.model.Artist;
import com.music.artistms.repo.ArtistDALImpl;

@RestController
public class ArtistController {

	@Autowired
	private ArtistDALImpl repo;

	@RequestMapping(value = "/artist", method = RequestMethod.GET, produces = "application/json")
	public List<Artist> firstPage() {

		return repo.findAll();
	}

	@PostMapping("/artist")
	public void create(@RequestBody Artist a2) {
		repo.create(a2);
		System.out.println(a2 + " insert");
	}

	@DeleteMapping(path = { "/artist/{name}" })
	public Artist delete(@PathVariable("name") String name) {
		System.out.println("name " + name);
		Artist deleteda2 = repo.findByName(name);
		System.out.println(deleteda2);

		if (repo.delete(deleteda2))
			return deleteda2;
		else
			return null;
	}

	@PutMapping("/artist")
	public Artist update(@RequestBody Artist a2) {
		repo.update(a2);

		System.out.println(a2 + " updated");
		return a2;
	}

}

