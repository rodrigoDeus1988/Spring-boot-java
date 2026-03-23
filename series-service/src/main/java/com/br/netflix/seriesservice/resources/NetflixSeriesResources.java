package com.br.netflix.seriesservice.resources;

import com.br.netflix.seriesservice.NetflixSeries;
import com.br.netflix.seriesservice.dto.NetflixSeriesDTO;
import com.br.netflix.common.util.URL;
import com.br.netflix.seriesservice.services.NetflixSeriesService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/series")
public class NetflixSeriesResources {

	@Autowired
	private NetflixSeriesService service2;

	@RequestMapping(method = RequestMethod.GET) 
	public ResponseEntity<List<NetflixSeriesDTO>> findAll() {  
		List<NetflixSeries> list = service2.findAllSerie();  
		List<NetflixSeriesDTO> listDto = list.stream().map(serie -> new NetflixSeriesDTO(serie)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	} 
	
	@RequestMapping(value = "/genero", method = RequestMethod.GET)
	public ResponseEntity<List<NetflixSeries>> findByGenero(@RequestParam(value = "gr", defaultValue = "") String text) {
		text = URL.decodeParam(text);
		List<NetflixSeries> list = service2.findByGenero(text);  
		return ResponseEntity.ok().body(list);    
	}
}
