package com.br.netflix.springbootnetflix.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.dto.NetflixDTO;
import com.br.netflix.springbootnetflix.resources.util.URL;
import com.br.netflix.springbootnetflix.services.NetflixService;

@RestController
@RequestMapping(value = "/filmes")
public class NetflixResources {

	@Autowired
	private NetflixService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<NetflixDTO>> findAll() {

		List<Netflix> list = service.findAll();
		List<NetflixDTO> listDto = list.stream().map(filmes -> new NetflixDTO(filmes)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);

	}

	@RequestMapping(value = "/titulo", method = RequestMethod.GET)
	public ResponseEntity<List<Netflix>> findByFilme(@RequestParam(value = "nome", defaultValue = "") String text) {
		text = URL.decodeParam(text);
		List<Netflix> list = service.findByFilme(text);
 
		return ResponseEntity.ok().body(list);

	}
	
	@RequestMapping(value = "/genero", method = RequestMethod.GET)
	public ResponseEntity<List<Netflix>> findByGenero(@RequestParam(value = "nome", defaultValue = "") String text) {
		text = URL.decodeParam(text);
		List<Netflix> list = service.findByGenero(text);  
 
		return ResponseEntity.ok().body(list); 

	}

}
