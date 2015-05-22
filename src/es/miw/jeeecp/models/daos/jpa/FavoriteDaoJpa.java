package es.miw.jeeecp.models.daos.jpa;


import es.entities.generates2.Favorite;
import es.miw.jeeecp.models.daos.FavoriteDao;
public class FavoriteDaoJpa extends GenericDaoJpa<Favorite, Integer> implements FavoriteDao {

	public FavoriteDaoJpa() {
		super(Favorite.class);
	}
}
