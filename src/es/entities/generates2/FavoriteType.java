package es.entities.generates2;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


@Entity
public class FavoriteType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String idUUID;

	
	private String description;

	
	public FavoriteType() {
	}
    
	
	public FavoriteType(String idUUID, String description) {
		super();
		this.idUUID = idUUID;
		this.description = description;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIdUUID() {
		return idUUID;
	}

	public void setIdUUID(String idUUID) {
		this.idUUID = idUUID;
	}


}