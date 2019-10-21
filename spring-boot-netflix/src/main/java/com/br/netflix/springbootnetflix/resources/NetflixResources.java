package com.br.netflix.springbootnetflix.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.netflix.springbootnetflix.Netflix;

@RestController
@RequestMapping(value="/filmes")  
public class NetflixResources { 

	@RequestMapping(method = RequestMethod.GET)  
	public ResponseEntity<List<Netflix>> findAll() {
		Netflix serie = new Netflix("1","teste2","teste3","teste4","teste5","teste6","teste7","teste8","teste9");
		Netflix filme = new Netflix("2","teste2","teste3","teste4","teste5","teste6","teste7","teste8","teste9");
		List<Netflix> list = new ArrayList<>();
		list.addAll(Arrays.asList(serie, filme)); 
		return ResponseEntity.ok().body(list);    
	}  

}
