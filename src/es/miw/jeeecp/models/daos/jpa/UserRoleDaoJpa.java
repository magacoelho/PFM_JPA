package es.miw.jeeecp.models.daos.jpa;

import es.entities.generates2.Role;

import es.miw.jeeecp.models.daos.UserRoleDao;


public class UserRoleDaoJpa extends GenericDaoJpa<Role, Integer> implements UserRoleDao {
	

	 
	 public UserRoleDaoJpa() {
        super(Role.class);
    }
    

}
