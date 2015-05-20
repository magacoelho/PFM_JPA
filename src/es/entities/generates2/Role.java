package es.entities.generates2;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_roles database table.
 * 
 */
@Entity
@Table(name="role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int Id;

	private String role;

	//bi-directional many-to-one association to User
//	@ManyToOne
//	@JoinColumn(name="username", referencedColumnName="username")
//	private User user;

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

//	public User getUser() {
//		return this.user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

}