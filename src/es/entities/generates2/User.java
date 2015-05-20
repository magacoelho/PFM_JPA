package es.entities.generates2;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="create_time")
	private Timestamp createTime;

	private String email;

	private byte enabled;

	private String idUUID;

	private String password;

	//bi-directional many-to-one association to Favorite
	@OneToMany
	private List<Favorite> favorites;

	//bi-directional many-to-one association to UserRole
	@OneToMany
	private List<Role> userRoles;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}

	public String getIdUUID() {
		return this.idUUID;
	}

	public void setIdUUID(String idUUID) {
		this.idUUID = idUUID;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Favorite> getFavorites() {
		return this.favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

	
	public List<Role> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<Role> userRoles) {
		this.userRoles = userRoles;
	}

//	public UserRole addUserRole(UserRole userRole) {
//		getUserRoles().add(userRole);
//		userRole.setUser(this);
//
//		return userRole;
//	}
//
//	public UserRole removeUserRole(UserRole userRole) {
//		getUserRoles().remove(userRole);
//		userRole.setUser(null);
//
//		return userRole;
//	}

}