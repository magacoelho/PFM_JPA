package es.miw.jeeecp.models.daos.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import es.miw.jeeecp.models.daos.TemaDao;
import es.miw.spotify.models.entities.Favorito;
import es.miw.spotify.models.entities.Usuario;

public class TemaDaoJpa extends GenericDaoJpa<Usuario, Integer> implements TemaDao {
	 private static final String BUSCAR_VOTO_POR_IP = "SELECT t FROM TemaEntity t JOIN t.votos v where v.ip = :ip and t.id = :idTema";
	 private static final String BUSCAR_TEMA_POR_NOMBRE = "SELECT t FROM TemaEntity t where LOWER(t.tema) = LOWER(:nombreTema) ";

	 
	 public TemaDaoJpa() {
        super(Usuario.class);
    }
    public List<Favorito> findByIp(String ip,Integer idTema) {
        EntityManager entityManager = DaoJpaFactory.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery(BUSCAR_VOTO_POR_IP);
        query.setParameter("ip", ip);
        query.setParameter("idTema", idTema);
        List<Favorito> listaResultado =(List<Favorito>) query.getResultList();
        entityManager.close();
        return listaResultado;
    }
    public List<Usuario> findByName(String name) {
        EntityManager entityManager = DaoJpaFactory.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery(BUSCAR_TEMA_POR_NOMBRE);
        query.setParameter("nombreTema", name);
        List<Usuario> listaResultado =(List<Usuario>) query.getResultList();
        entityManager.close();
        return listaResultado;
    }
  

}
