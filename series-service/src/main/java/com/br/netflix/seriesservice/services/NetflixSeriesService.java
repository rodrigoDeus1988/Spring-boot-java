package com.br.netflix.seriesservice.services;

import com.br.netflix.seriesservice.NetflixSeries;
import com.br.netflix.seriesservice.repository.NetflixSeriesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetflixSeriesService {

	@Autowired
	private NetflixSeriesRepository repo;   

	public List<NetflixSeries> findAllSerie() {
		return repo.findAll(); 
	}
	
	public List<NetflixSeries> findByGenero(String text) {
		return repo.findByGeneroIgnoreCase(text);
	}  
}
