package com.br.netflix.springbootnetflix.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.services.NetflixService;

@RestController
@RequestMapping(value="/filmes")  
public class NetflixResources { 

	@Autowired
	private NetflixService service;
	
	@RequestMapping(method = RequestMethod.GET)   
	public ResponseEntity<List<Netflix>> findAll() {
		
		List<Netflix> list = service.findAll();
		return ResponseEntity.ok().body(list);    
	}  

}
