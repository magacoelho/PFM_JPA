package es.miw.spotify.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users_roles")
public class UsuarioRol implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5814899469167482498L;

		
	@Id
	@GeneratedValue
	private Integer id;
    
	
	
	public UsuarioRol() {
		super();
	}

	public UsuarioRol(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
