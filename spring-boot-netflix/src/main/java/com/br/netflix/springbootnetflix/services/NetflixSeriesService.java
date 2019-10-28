package com.br.netflix.springbootnetflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.NetflixSeries;
import com.br.netflix.springbootnetflix.repository.NetflixRepository;
import com.br.netflix.springbootnetflix.repository.NetflixSeriesRepository;

@Service
public class NetflixSeriesService {

	@Autowired
	private NetflixSeriesRepository repo;   

	public List<NetflixSeries> findAllSerie() {
		return repo.findAll(); 

	}
	
	public List<NetflixSeries> findByGenero(String text) {

		return repo.findByGeneroIgnoreCase(text) ;  

	} 

	

}
