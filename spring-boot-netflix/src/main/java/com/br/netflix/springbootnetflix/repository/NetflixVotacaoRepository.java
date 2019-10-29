package com.br.netflix.springbootnetflix.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.br.netflix.springbootnetflix.NetflixSeries;
import com.br.netflix.springbootnetflix.NetflixVotacao;
import com.br.netflix.springbootnetflix.services.NetflixVotacaoService;

@Repository
public interface NetflixVotacaoRepository extends MongoRepository<NetflixVotacao,String>{ 
	
  
	List<NetflixVotacao> findByNota(String nota);     
}
 