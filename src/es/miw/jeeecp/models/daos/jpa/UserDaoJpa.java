package es.miw.jeeecp.models.daos.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import es.miw.jeeecp.models.daos.UserDao;
import es.miw.spotify.models.entities.Favorite;
import es.miw.spotify.models.entities.User;

public class UserDaoJpa extends GenericDaoJpa<User, Integer> implements UserDao {
	 private static final String BUSCAR_VOTO_POR_IP = "SELECT t FROM TemaEntity t JOIN t.votos v where v.ip = :ip and t.id = :idTema";
	 private static final String BUSCAR_TEMA_POR_NOMBRE = "SELECT t FROM TemaEntity t where LOWER(t.tema) = LOWER(:nombreTema) ";

	 
	 public UserDaoJpa() {
        super(User.class);
    }
    public List<Favorite> findByIp(String ip,Integer idTema) {
        EntityManager entityManager = DaoJpaFactory.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery(BUSCAR_VOTO_POR_IP);
        query.setParameter("ip", ip);
        query.setParameter("idTema", idTema);
        List<Favorite> listaResultado =(List<Favorite>) query.getResultList();
        entityManager.close();
        return listaResultado;
    }
    public List<User> findByName(String name) {
        EntityManager entityManager = DaoJpaFactory.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery(BUSCAR_TEMA_POR_NOMBRE);
        query.setParameter("nombreTema", name);
        List<User> listaResultado =(List<User>) query.getResultList();
        entityManager.close();
        return listaResultado;
    }
  

}
