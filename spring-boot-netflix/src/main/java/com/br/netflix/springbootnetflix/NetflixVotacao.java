package com.br.netflix.springbootnetflix;

import java.io.Serializable;

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
		super();
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
		this.nota = filme;
	}

	public String getnota() {
		return nota;
	}

	public void setnota(String nota) {
		this.nota = nota;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NetflixVotacao other = (NetflixVotacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
