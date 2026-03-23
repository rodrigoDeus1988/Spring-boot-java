package com.br.netflix.movieservice.repository;

import com.br.netflix.movieservice.Netflix;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetflixRepository extends MongoRepository<Netflix, String> {
	List<Netflix> findByFilmeIgnoreCase(String text);
	List<Netflix> findByGeneroIgnoreCase(String text);
	List<Netflix> findByClassificacaoIgnoreCase(String text);
}
