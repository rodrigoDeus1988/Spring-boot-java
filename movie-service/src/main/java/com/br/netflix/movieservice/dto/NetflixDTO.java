package com.br.netflix.movieservice.dto;

import com.br.netflix.movieservice.Netflix;
import java.io.Serializable;

public class NetflixDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String filme;
	private String genero;
	private String diretor;
	private String duracao;
	private String classificacao;
	private String elenco;
	private String pais;
	private String distribuidora;

	public NetflixDTO() {
	}

	public NetflixDTO(Netflix obj) {
		this.id = obj.getId();
		this.filme = obj.getFilme();
		this.genero = obj.getGenero();
		this.diretor = obj.getDiretor();
		this.duracao = obj.getDuracao();
		this.classificacao = obj.getClassificacao();
		this.elenco = obj.getElenco();
		this.pais = obj.getPais();
		this.distribuidora = obj.getDistribuidora();
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
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
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
}
