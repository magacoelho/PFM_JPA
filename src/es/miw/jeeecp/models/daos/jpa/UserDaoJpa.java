package es.miw.jeeecp.models.daos.jpa;

import es.entities.generates2.User;
import es.miw.jeeecp.models.daos.UserDao;


public class UserDaoJpa extends GenericDaoJpa<User, Integer> implements UserDao {
//	 private static final String BUSCAR_VOTO_POR_IP = "SELECT t FROM TemaEntity t JOIN t.votos v where v.ip = :ip and t.id = :idTema";
//	 private static final String BUSCAR_TEMA_POR_NOMBRE = "SELECT t FROM TemaEntity t where LOWER(t.tema) = LOWER(:nombreTema) ";
//
//	 
	 public UserDaoJpa() {
        super(User.class);
    }
//    public List<Favorite2> findByIp(String ip,Integer idTema) {
//        EntityManager entityManager = DaoJpaFactory.getEntityManagerFactory().createEntityManager();
//        Query query = entityManager.createQuery(BUSCAR_VOTO_POR_IP);
//        query.setParameter("ip", ip);
//        query.setParameter("idTema", idTema);
//        List<Favorite2> listaResultado =(List<Favorite2>) query.getResultList();
//        entityManager.close();
//        return listaResultado;
//    }
//    public List<User2> findByName(String name) {
//        EntityManager entityManager = DaoJpaFactory.getEntityManagerFactory().createEntityManager();
//        Query query = entityManager.createQuery(BUSCAR_TEMA_POR_NOMBRE);
//        query.setParameter("nombreTema", name);
//        List<User2> listaResultado =(List<User2>) query.getResultList();
//        entityManager.close();
//        return listaResultado;
//    }
  

}
