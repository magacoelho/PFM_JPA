package es.main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.eclipse.persistence.config.PersistenceUnitProperties;

import es.miw.spotify.models.daos.jpa.DaoJpaFactory;
import es.spotify.models.entities.Favorite;
import es.spotify.models.entities.FavoriteType;
import es.spotify.models.entities.Role;
import es.spotify.models.entities.User;

public class Principal {

	public static void main(String[] args) {
		 Map<String, String> properties = new HashMap<>();
         properties. put(PersistenceUnitProperties.DDL_GENERATION,
                 PersistenceUnitProperties.DROP_AND_CREATE);
         EntityManager em = Persistence.createEntityManagerFactory("BBDD", properties).createEntityManager();
         
         
       Role r= new Role("jsjsjjs","Super");
   
       DaoJpaFactory.getFactory().getUserRoleDao().create(r);
       User u= new User("jksjs", LocalDateTime.now(), "jjj@jsj.es", true,"pasword1");
       DaoJpaFactory.getFactory().getUserDao().create(u);
       System.out.println( DaoJpaFactory.getFactory().getUserDao().read(2));
       FavoriteType ft= new FavoriteType("kl�slks", "ALBUM");
       DaoJpaFactory.getFactory().getFavoriteTypeDao().create(ft);
       Favorite f = new Favorite("skllksjslskjssjsjjs", ft, "iduUUI");
       DaoJpaFactory.getFactory().getFavoriteDao().create(f);
       
       User u99 =DaoJpaFactory.getFactory().getUserDao().read(2);
       u99.getFavorites().add(f);
       u99.getUserRoles().add(r);
       DaoJpaFactory.getFactory().getUserDao().update(u99);
      
       
       u99=DaoJpaFactory.getFactory().getUserDao().read(2);
       System.out.println(u99);
       System.out.println(DaoJpaFactory.getFactory().getUserDao().getFavoriteByFavoriteType(ft, 2));
       List<Favorite> lista =  DaoJpaFactory.getFactory().getUserDao().getFavoriteByFavoriteType(ft, 2);
       System.out.println(lista);
       
	}

}
