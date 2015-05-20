package es.miw.spotify.models.entities;

import java.io.Serializable;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class User2 implements Serializable {
	private static final long serialVersionUID = -3632602244844491316L;

	@Id
	@GeneratedValue
	private Integer id;
    
	@Column(name = "username")
	private String nombre;
	
	@Column(name = "password")
	private String contrasenha;
	
	@Column(name = "enabled")
	private boolean disponible;
	
	private String email;
	
	@Column(name = "createtime")
	private LocalDateTime fechaHoraCreacion;
	
	//@OneToMany(cascade = { CascadeType.ALL })
	//private List<UsuarioRol> usuarioRoles = new ArrayList<UsuarioRol>(); 

	@OneToMany(cascade = { CascadeType.ALL })
	private List<Favorite2> favoritos = new ArrayList<Favorite2>();

	public User2() {
		super();
	}
	
	public User2(String nombre, String contrasenha, boolean disponible) {
		super();
		this.nombre = nombre;
		this.contrasenha = contrasenha;
		this.disponible = disponible;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public List<Favorite2> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<Favorite2> favoritos) {
		this.favoritos = favoritos;
	}
	

	
}
