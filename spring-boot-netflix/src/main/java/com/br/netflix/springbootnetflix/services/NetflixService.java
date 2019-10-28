package com.br.netflix.springbootnetflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.repository.NetflixRepository;

@Service
public class NetflixService {

	@Autowired
	private NetflixRepository repo;

	public List<Netflix> findAll() {
		return repo.findAll();

	}

	public List<Netflix> findByFilme(String text) {

		return repo.findByFilmeIgnoreCase(text); 

	} 

}
