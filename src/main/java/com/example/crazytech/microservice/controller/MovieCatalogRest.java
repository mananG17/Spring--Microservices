package com.example.crazytech.microservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crazytech.microservice.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogRest {

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		return Collections.singletonList(new CatalogItem("Transformer", "Test", 4));
	}

}
