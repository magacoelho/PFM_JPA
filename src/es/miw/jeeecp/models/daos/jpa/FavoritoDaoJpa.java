package es.miw.jeeecp.models.daos.jpa;


import es.miw.jeeecp.models.daos.FavoritoDao;
import es.miw.spotify.models.entities.Favorito;
public class FavoritoDaoJpa extends GenericDaoJpa<Favorito, Integer> implements FavoritoDao {
  
	  public FavoritoDaoJpa() {
        super(Favorito.class);
    }

   
}
