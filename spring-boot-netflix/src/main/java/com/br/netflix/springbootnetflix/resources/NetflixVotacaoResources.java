package com.br.netflix.springbootnetflix.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.netflix.springbootnetflix.NetflixSeries;
import com.br.netflix.springbootnetflix.NetflixVotacao;
import com.br.netflix.springbootnetflix.dto.NetflixVotacaoDTO;
import com.br.netflix.springbootnetflix.resources.util.URL;
import com.br.netflix.springbootnetflix.services.NetflixVotacaoService;

@RestController
@RequestMapping(value = "/avalicao")
public class NetflixVotacaoResources {

	@Autowired 
	private NetflixVotacaoService service2;
	
	@RequestMapping(method = RequestMethod.POST) 
	public ResponseEntity<NetflixVotacaoDTO> insert(@RequestBody NetflixVotacaoDTO objDto ) {
		NetflixVotacao obj = service2.fromDTO(objDto);
		obj = service2.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build(); 	
		  

	}
	

	@RequestMapping(value = "/nota", method = RequestMethod.GET)
	public ResponseEntity<List<NetflixVotacao>> findByNota(@RequestParam(value = "n", defaultValue = "") String text) {
		text = URL.decodeParam(text);
		List<NetflixVotacao> list2 = service2.findByNota(text);
 
		return ResponseEntity.ok().body(list2);       

	}
}
