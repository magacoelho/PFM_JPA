package es.entities.generates2;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int Id;
	private String idUUID;

	private String role;
	
	
	public Role() {
	}

	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public String getIdUUID() {
		return idUUID;
	}


	public void setIdUUID(String idUUID) {
		this.idUUID = idUUID;
	}

}