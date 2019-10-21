package com.br.netflix.springbootnetflix;

import java.io.Serializable;

public class Netflix implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String filme;
	private String genero;
	private String Diretor;
	private String Duração; 
	private String classificacao;
	private String elenco;
	private String pais;
	private String distribuidora; 

	public Netflix() {

	}

	public Netflix(String id, String filme, String genero, String diretor, String duração, String classificacao,
			String elenco, String pais, String distribuidora) {
		super();
		this.id = id;
		this.filme = filme;
		this.genero = genero;
		this.Diretor = diretor;
		this.Duração = duração;
		this.classificacao = classificacao;
		this.elenco = elenco;
		this.pais = pais;
		this.distribuidora = distribuidora;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDiretor() {
		return Diretor;
	}

	public void setDiretor(String diretor) {
		Diretor = diretor;
	}

	public String getDuração() {
		return Duração;
	}

	public void setDuração(String duração) {
		Duração = duração;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
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
		Netflix other = (Netflix) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
