package es.spotify.models.entities;

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

	
	public Role(String idUUID, String role) {
		super();
		this.idUUID = idUUID;
		this.role = role;
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + ((idUUID == null) ? 0 : idUUID.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		Role other = (Role) obj;
		if (Id != other.Id)
			return false;
		if (idUUID == null) {
			if (other.idUUID != null)
				return false;
		} else if (!idUUID.equals(other.idUUID))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Role [Id=" + Id + ", idUUID=" + idUUID + ", role=" + role + "]";
	}
   
}