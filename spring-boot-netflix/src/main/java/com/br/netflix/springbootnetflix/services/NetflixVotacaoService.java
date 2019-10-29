package com.br.netflix.springbootnetflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.NetflixSeries;
import com.br.netflix.springbootnetflix.NetflixVotacao;
import com.br.netflix.springbootnetflix.dto.NetflixVotacaoDTO;
import com.br.netflix.springbootnetflix.repository.NetflixRepository;
import com.br.netflix.springbootnetflix.repository.NetflixSeriesRepository;
import com.br.netflix.springbootnetflix.repository.NetflixVotacaoRepository;

@Service
public class NetflixVotacaoService {
 
	@Autowired
	private NetflixVotacaoRepository repo;    

	public List<NetflixVotacao> findAllSerie() { 
		return repo.findAll(); 

	}
	
	
	public NetflixVotacao insert (NetflixVotacao obj) {
		return  repo.insert(obj); 
		
	}
	
	public NetflixVotacao fromDTO (NetflixVotacaoDTO objDto ) {
		return new NetflixVotacao(objDto.getId(),objDto.getfilme(),objDto.getnota());
	}
	
	public List<NetflixVotacao> findByNota(String text) { 

		return repo.findByNota(text);      

	} 
	

	
}
