package es.miw.jeeecp.models.daos;

import es.miw.jeeecp.models.daos.jpa.DaoJpaFactory;

public abstract class DaoFactory {
    public static DaoFactory factory = null;

    public static void setFactory(DaoFactory factory) {
        DaoFactory.factory = factory;
    }

    public static DaoFactory getFactory() {
        if (factory == null) {
            factory = new DaoJpaFactory();
        }
        return factory;
    }

    public abstract FavoriteDao getFavoriteDao();
    
    public abstract UserDao getUserDao();
   
}
