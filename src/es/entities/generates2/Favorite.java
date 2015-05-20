package es.entities.generates2;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the favorite database table.
 * 
 */
@Entity
@NamedQuery(name="Favorite.findAll", query="SELECT f FROM Favorite f")
public class Favorite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String idFavorite;



	//bi-directional many-to-one association to Favoritetype
	@ManyToOne
	@JoinColumn(name="idFavoritoType")
	private FavoriteType favoritetype;

	public Favorite() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdFavorite() {
		return this.idFavorite;
	}

	public void setIdFavorite(String idFavorite) {
		this.idFavorite = idFavorite;
	}

	
	public FavoriteType getFavoritetype() {
		return this.favoritetype;
	}

	public void setFavoritetype(FavoriteType favoritetype) {
		this.favoritetype = favoritetype;
	}

}