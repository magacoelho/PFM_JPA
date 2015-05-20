package es.miw.jeeecp.models.daos;

import java.util.List;

import es.miw.spotify.models.entities.Favorite;
import es.miw.spotify.models.entities.User;

public interface UserDao extends GenericDao<User , Integer> {
	 public List<Favorite> findByIp(String ip,Integer idTema);
	 public List<User> findByName(String name); 
}
