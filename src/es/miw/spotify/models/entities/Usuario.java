package es.miw.spotify.models.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class Usuario implements Serializable {
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

	@OneToMany(cascade = { CascadeType.ALL })
	private List<Favorito> favoritos = new ArrayList<Favorito>();

	public Usuario() {
		super();
	}
	
	public Usuario(String nombre, String contrasenha, boolean disponible) {
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

	public List<Favorito> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<Favorito> favoritos) {
		this.favoritos = favoritos;
	}
	

	
}
