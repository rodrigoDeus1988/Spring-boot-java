package com.br.netflix.springbootnetflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.NetflixVotacao;
import com.br.netflix.springbootnetflix.dto.NetflixDTO;
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
	
	public List<Netflix> findByGenero(String text) {

		return repo.findByGeneroIgnoreCase(text) ;  

	} 
	
	public List<Netflix> findByClassificacao(String text) {

		return repo.findByClassificacaoIgnoreCase(text) ;   

	} 
	

}
