package com.cit.apimusica.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cit.common.entity.Musica;

@RestController
public class MusicaResource {
	@Autowired
	MusicaRepository  repo;
	
	
	@GetMapping("api/musicas")
	public ResponseEntity<List<Musica>> musicas(@RequestParam(name = "filtro", required = false ) String filtro) {
		if(filtro == null || filtro.equals(""))
			return new ResponseEntity<>(repo.findAll(), HttpStatus.OK) ;
		
		return new ResponseEntity<>(repo.findByNomeArtista(filtro), HttpStatus.OK) ;
	}
}
