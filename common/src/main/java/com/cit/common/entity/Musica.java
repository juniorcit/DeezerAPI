package com.cit.common.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Musicas")
public class Musica implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column
	@Id
	private String id;
	
	@Column
	private String nome;
	
	@JoinColumn(name="ArtistaId")
	@ManyToOne
	private Artista artista;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
