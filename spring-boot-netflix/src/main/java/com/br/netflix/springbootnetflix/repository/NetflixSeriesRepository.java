package com.br.netflix.springbootnetflix.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.NetflixSeries;

@Repository
public interface NetflixSeriesRepository extends MongoRepository<NetflixSeries,String>{
	
	List<NetflixSeries> findByGeneroIgnoreCase(String genero);
 
}
 