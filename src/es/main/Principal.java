package es.main;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.eclipse.persistence.config.PersistenceUnitProperties;

public class Principal {

	public static void main(String[] args) {
		 Map<String, String> properties = new HashMap<>();
         properties. put(PersistenceUnitProperties.DDL_GENERATION,
                 PersistenceUnitProperties.DROP_AND_CREATE);
         EntityManager em = Persistence.createEntityManagerFactory("BBDD", properties)
                 .createEntityManager();

	}

}
