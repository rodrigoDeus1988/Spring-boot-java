package com.br.netflix.movieservice.services;

import com.br.netflix.movieservice.Netflix;
import com.br.netflix.movieservice.repository.NetflixRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public List<Netflix> findByGenero(String text) {
		return repo.findByGeneroIgnoreCase(text);
	} 
	
	public List<Netflix> findByClassificacao(String text) {
		return repo.findByClassificacaoIgnoreCase(text);
	} 
}
