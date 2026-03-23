package com.br.netflix.evaluationservice.repository;

import com.br.netflix.evaluationservice.NetflixVotacao;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetflixVotacaoRepository extends MongoRepository<NetflixVotacao, String> {
	List<NetflixVotacao> findByNota(String text);
}
