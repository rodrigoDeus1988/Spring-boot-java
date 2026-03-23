package com.br.netflix.seriesservice;

import java.io.Serializable;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="netflix_series")
public class NetflixSeries implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String serie;
	private String genero;
	private String elenco;
	private String classificacao;

	public NetflixSeries() {
	}

	public NetflixSeries(String id, String serie, String genero, String classificacao, String elenco) {
		this.id = id;
		this.serie = serie;
		this.genero = genero;
		this.classificacao = classificacao;
		this.elenco = elenco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getserie() {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NetflixSeries that = (NetflixSeries) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
