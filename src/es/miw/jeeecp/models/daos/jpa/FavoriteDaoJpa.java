package es.miw.jeeecp.models.daos.jpa;


import es.miw.jeeecp.models.daos.FavoriteDao;
import es.miw.spotify.models.entities.Favorite;
public class FavoriteDaoJpa extends GenericDaoJpa<Favorite, Integer> implements FavoriteDao {
  
	  public FavoriteDaoJpa() {
        super(Favorite.class);
    }

   
}
