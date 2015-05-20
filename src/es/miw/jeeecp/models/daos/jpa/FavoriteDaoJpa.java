package es.miw.jeeecp.models.daos.jpa;


import es.miw.jeeecp.models.daos.FavoriteDao;
import es.miw.spotify.models.entities.Favorite2;
public class FavoriteDaoJpa extends GenericDaoJpa<Favorite2, Integer> implements FavoriteDao {
  
	  public FavoriteDaoJpa() {
        super(Favorite2.class);
    }

   
}
