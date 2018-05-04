package com.cit.common.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PlayLists")
public class Playlist implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column
	@Id
	private String id;
	
	@JoinColumn(referencedColumnName="Id")
	@OneToOne
	private Usuario usuario;

	 @ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "PlaylistMusicas", 
	        joinColumns = { @JoinColumn(name = "PlaylistId") }, 
	        inverseJoinColumns = { @JoinColumn(name = "MusicaId") }
	    )
	private List<Musica> musicaList;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Musica> getMusicaList() {
		return musicaList;
	}

	public void setMusicaList(List<Musica> musicaList) {
		this.musicaList = musicaList;
	}
	
}
