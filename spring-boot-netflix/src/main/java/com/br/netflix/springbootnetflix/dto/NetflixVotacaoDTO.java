package com.br.netflix.springbootnetflix.dto;

import java.io.Serializable;

import com.br.netflix.springbootnetflix.Netflix;
import com.br.netflix.springbootnetflix.NetflixSeries;
import com.br.netflix.springbootnetflix.NetflixVotacao;

public class NetflixVotacaoDTO implements Serializable {  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String filme;
	private String nota;


	public NetflixVotacaoDTO() { 
 
	}

	public NetflixVotacaoDTO(NetflixVotacao obj) {
		
		id = obj.getId();  
		filme= obj.getfilme();
		nota = obj.getnota();


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
