package com.br.netflix.springbootnetflix.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.br.netflix.springbootnetflix.Netflix;

@Repository
public interface NetflixRepository extends MongoRepository<Netflix,String>{
 
}
