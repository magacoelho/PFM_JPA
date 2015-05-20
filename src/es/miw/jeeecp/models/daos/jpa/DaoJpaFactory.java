package es.miw.jeeecp.models.daos.jpa;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.eclipse.persistence.config.PersistenceUnitProperties;

import es.miw.jeeecp.models.daos.DaoFactory;
import es.miw.jeeecp.models.daos.FavoriteTypeDao;
import es.miw.jeeecp.models.daos.UserDao;
import es.miw.jeeecp.models.daos.FavoriteDao;
import es.miw.jeeecp.models.daos.UserRoleDao;

public class DaoJpaFactory extends DaoFactory {
    private static final String PERSISTENCE_UNIT = "BBDD";

    private static EntityManagerFactory entityManagerFactory; 

    public DaoJpaFactory() {
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
            LogManager.getLogger(DaoJpaFactory.class).debug("create Entity Manager Factory");
        
        }
        return entityManagerFactory;
    }

    public static void prepareFactoryWithDropAndCreateTables() {
        Map<String, String> properties = new HashMap<>();
        properties.put(PersistenceUnitProperties.DDL_GENERATION,
                PersistenceUnitProperties.DROP_AND_CREATE);
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT, properties);
        LogManager.getLogger(DaoJpaFactory.class).debug("create Entity Manager Factory");
    }

	@Override
	public FavoriteDao getFavoriteDao() {
		return new FavoriteDaoJpa();
	}

	@Override
	public UserDao getUserDao() {
		return new UserDaoJpa();
	}

	@Override
	public UserRoleDao getUserRoleDao() {
		
		return null;
	}

	@Override
	public FavoriteTypeDao getFavoriteType() {
		// TODO Auto-generated method stub
		return null;
	}

 

}
