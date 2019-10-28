package com.br.netflix.springbootnetflix.dto;

import java.io.Serializable;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.NetflixSeries;

public class NetflixSeriesDTO implements Serializable {  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String serie;
	private String genero;
	private String elenco;
	private String classificacao;

	public NetflixSeriesDTO() {
 
	}

	public NetflixSeriesDTO(NetflixSeries obj) {
		
		id = obj.getId();  
		serie= obj.getserie();
		genero = obj.getGenero();
		classificacao = obj.getClassificacao();
		elenco = obj.getElenco();

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

}
