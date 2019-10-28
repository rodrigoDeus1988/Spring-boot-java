package com.br.netflix.springbootnetflix.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.dto.NetflixDTO;

@Repository
public interface NetflixRepository extends MongoRepository<Netflix,String>{
	
	List<Netflix> findByFilmeIgnoreCase(String filme); 
	
	List<Netflix> findByGeneroIgnoreCase(String genero); 
 
}
