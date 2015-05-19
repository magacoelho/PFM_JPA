package es.miw.jeeecp.models.daos;

import java.util.List;

import es.miw.spotify.models.entities.Favorito;
import es.miw.spotify.models.entities.Usuario;

public interface UsuarioDao extends GenericDao<Usuario , Integer> {
	 public List<Favorito> findByIp(String ip,Integer idTema);
	 public List<Usuario> findByName(String name); 
}
