package com.br.netflix.evaluationservice.services;

import com.br.netflix.evaluationservice.NetflixVotacao;
import com.br.netflix.evaluationservice.dto.NetflixVotacaoDTO;
import com.br.netflix.evaluationservice.repository.NetflixVotacaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetflixVotacaoService {

	@Autowired
	private NetflixVotacaoRepository repo;

	public List<NetflixVotacao> findAll() {
		return repo.findAll();
	}

	public NetflixVotacao insert (NetflixVotacao obj) {
		return repo.insert(obj);
	}

	public NetflixVotacao fromDTO (NetflixVotacaoDTO objDto ) {
		return new NetflixVotacao(objDto.getId(), objDto.getfilme(), objDto.getnota());
	}

	public List<NetflixVotacao> findByNota(String text) {
		return repo.findByNota(text);
	}
}
