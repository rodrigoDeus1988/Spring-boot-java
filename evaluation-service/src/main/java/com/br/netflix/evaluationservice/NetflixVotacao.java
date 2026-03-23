package com.br.netflix.evaluationservice;

import java.io.Serializable;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="netflix_votacao")
public class NetflixVotacao implements Serializable {

	private static final long serialVersionUID = 1L; 

	@Id 
	private String id;
	private String filme;
	private String nota;

	public NetflixVotacao() {
	}

	public NetflixVotacao(String id, String filme, String nota) {
		this.id = id;
		this.nota = nota;
		this.filme = filme;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NetflixVotacao that = (NetflixVotacao) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
