package es.miw.jeeecp.models.daos.jpa;


import es.miw.jeeecp.models.daos.VotoDao;
import es.miw.jeeecp.models.entities.Favorito;
public class VotoDaoJpa extends GenericDaoJpa<Favorito, Integer> implements VotoDao {
  
	 

	
    public VotoDaoJpa() {
        super(Favorito.class);
    }

   
}
