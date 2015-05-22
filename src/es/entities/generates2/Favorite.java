package es.entities.generates2;

import java.io.Serializable;

import javax.persistence.*;



@Entity
public class Favorite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String idUUID;

	private String idFavorite;

	@ManyToOne
	@JoinColumn(name="idFavoritoType")
	private FavoriteType favoritetype;
    
	
	public Favorite() {
	}
    
	
	public Favorite(String idFavorite, FavoriteType favoritetype, String idUUID) {
		super();
		this.idFavorite = idFavorite;
		this.favoritetype = favoritetype;
		this.idUUID = idUUID;
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

	public String getIdUUID() {
		return idUUID;
	}

	public void setIdUUID(String idUUID) {
		this.idUUID = idUUID;
	}

}