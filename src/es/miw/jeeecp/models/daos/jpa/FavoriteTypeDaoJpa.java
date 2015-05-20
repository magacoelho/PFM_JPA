package es.miw.jeeecp.models.daos.jpa;

import es.entities.generates2.FavoriteType;
import es.miw.jeeecp.models.daos.FavoriteTypeDao;




public class FavoriteTypeDaoJpa extends GenericDaoJpa<FavoriteType, Integer> implements FavoriteTypeDao {
  
	  public FavoriteTypeDaoJpa() {
        super(FavoriteType.class);
    }

   
}
