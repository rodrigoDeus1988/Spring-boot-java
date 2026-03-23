package com.br.netflix.seriesservice.dto;

import com.br.netflix.seriesservice.NetflixSeries;
import java.io.Serializable;

public class NetflixSeriesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String serie;
	private String genero;
	private String elenco;
	private String classificacao;

	public NetflixSeriesDTO() {
	}

	public NetflixSeriesDTO(NetflixSeries obj) {
		this.id = obj.getId();
		this.serie = obj.getserie();
		this.genero = obj.getGenero();
		this.elenco = obj.getElenco();
		this.classificacao = obj.getClassificacao();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
}
