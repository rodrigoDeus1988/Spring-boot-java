package com.br.netflix.evaluationservice.dto;

import com.br.netflix.evaluationservice.NetflixVotacao;
import java.io.Serializable;

public class NetflixVotacaoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String filme;
	private String nota;

	public NetflixVotacaoDTO() {
	}

	public NetflixVotacaoDTO(NetflixVotacao obj) {
		this.id = obj.getId();
		this.filme = obj.getfilme();
		this.nota = obj.getnota();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfilme() {
		return filme;
	}

	public void setfilme(String filme) {
		this.filme = filme;
	}

	public String getnota() {
		return nota;
	}

	public void setnota(String nota) {
		this.nota = nota;
	}
}
