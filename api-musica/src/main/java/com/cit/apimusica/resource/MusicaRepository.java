package com.cit.apimusica.resource;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cit.common.entity.Musica;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, String> {
	@Query("FROM Musica WHERE artista.nome = :nomeArtista")
	List<Musica> findByNomeArtista(@Param("nomeArtista") String nomeArtista); 
}
