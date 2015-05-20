package es.miw.spotify.models.entities;

import java.lang.String;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



public class Favorite2 {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String idFavorito;
	
	@Enumerated(EnumType.ORDINAL)
    private FavoriteType tipoFavorito;

	public Favorite2() {
		super();
	}

	public Favorite2(String idFavorito, FavoriteType tipoFavorito) {
		super();
		this.idFavorito = idFavorito;
		this.tipoFavorito = tipoFavorito;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdFavorito() {
		return idFavorito;
	}

	public void setIdFavorito(String idFavorito) {
		this.idFavorito = idFavorito;
	}

	public FavoriteType getTipoFavorito() {
		return tipoFavorito;
	}

	public void setTipoFavorito(FavoriteType tipoFavorito) {
		this.tipoFavorito = tipoFavorito;
	}

	@Override
	public String toString() {
		return "Favorito [id=" + id + ", idFavorito=" + idFavorito
				+ ", tipoFavorito=" + tipoFavorito + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((idFavorito == null) ? 0 : idFavorito.hashCode());
		result = prime * result
				+ ((tipoFavorito == null) ? 0 : tipoFavorito.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Favorite2 other = (Favorite2) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idFavorito == null) {
			if (other.idFavorito != null)
				return false;
		} else if (!idFavorito.equals(other.idFavorito))
			return false;
		if (tipoFavorito != other.tipoFavorito)
			return false;
		return true;
	}
    
	
   

}
