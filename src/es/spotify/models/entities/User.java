package es.spotify.models.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String idUUID;

	@Column(name="create_time")
	private LocalDateTime createTime;

	private String email;

	private boolean enabled;


	private String password;

	@OneToMany(cascade = { CascadeType.ALL }, fetch=FetchType.EAGER)
	private List<Favorite> favorites;

	@OneToMany(cascade = { CascadeType.ALL }, fetch=FetchType.EAGER)
	private List<Role> userRoles;

	public User() {
		this.favorites = new ArrayList<Favorite>();
		this.userRoles = new ArrayList<Role>();
	}

	
	public User(String idUUID, LocalDateTime createTime, String email,
			boolean enabled, String password) {
		this();
		this.idUUID = idUUID;
		this.createTime = createTime;
		this.email = email;
		this.enabled = enabled;
		this.password = password;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdUUID() {
		return idUUID;
	}

	public void setIdUUID(String idUUID) {
		this.idUUID = idUUID;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

	public List<Role> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<Role> userRoles) {
		this.userRoles = userRoles;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result
				+ ((favorites == null) ? 0 : favorites.hashCode());
		result = prime * result + id;
		result = prime * result + ((idUUID == null) ? 0 : idUUID.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((userRoles == null) ? 0 : userRoles.hashCode());
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
		User other = (User) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enabled != other.enabled)
			return false;
		if (favorites == null) {
			if (other.favorites != null)
				return false;
		} else if (!favorites.equals(other.favorites))
			return false;
		if (id != other.id)
			return false;
		if (idUUID == null) {
			if (other.idUUID != null)
				return false;
		} else if (!idUUID.equals(other.idUUID))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userRoles == null) {
			if (other.userRoles != null)
				return false;
		} else if (!userRoles.equals(other.userRoles))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", idUUID=" + idUUID + ", createTime="
				+ createTime + ", email=" + email + ", enabled=" + enabled
				+ ", password=" + password + ", favorites=" + favorites
				+ ", userRoles=" + userRoles + "]";
	}

	  

}