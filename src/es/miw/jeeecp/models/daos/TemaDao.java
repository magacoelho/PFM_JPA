package es.miw.jeeecp.models.daos;

import java.util.List;

import es.miw.jeeecp.models.entities.Usuario;
import es.miw.jeeecp.models.entities.Favorito;

public interface TemaDao extends GenericDao<Usuario , Integer> {
	 public List<Favorito> findByIp(String ip,Integer idTema);
	 public List<Usuario> findByName(String name); 
}
