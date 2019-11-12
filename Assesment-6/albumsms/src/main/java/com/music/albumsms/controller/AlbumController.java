package com.music.albumsms.controller;

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

import com.music.albumsms.model.Album;
import com.music.albumsms.repo.AlbumDALImpl;


@RestController
public class AlbumController {

	@Autowired
	private AlbumDALImpl repo;

	@RequestMapping(value = "/album", method = RequestMethod.GET, produces = "application/json")
	public List<Album> firstPage() {

		return repo.findAll();
	}

	@PostMapping("/album")
	public void create(@RequestBody Album a1) {
		repo.create(a1);
		System.out.println(a1 + " insert");
	}

	@DeleteMapping(path = { "/album/{id}" })
	public Album delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Album deleteda1 = repo.findById(id);
		System.out.println(deleteda1);

		if (repo.delete(deleteda1))
			return deleteda1;
		else
			return null;
	}

	@PutMapping("/album")
	public Album update(@RequestBody Album a1) {
		repo.update(a1);

		System.out.println(a1 + " updated");
		return a1;
	}

}

