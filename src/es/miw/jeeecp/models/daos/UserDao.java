package es.miw.jeeecp.models.daos;

import java.util.List;

import es.miw.spotify.models.entities.Favorite2;
import es.miw.spotify.models.entities.User2;

public interface UserDao extends GenericDao<User2 , Integer> {
	 public List<Favorite2> findByIp(String ip,Integer idTema);
	 public List<User2> findByName(String name); 
}
