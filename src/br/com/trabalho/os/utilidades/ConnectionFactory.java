package br.com.trabalho.os.utilidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe responsável por criar a fábrica de conexões
 * 
 * @author Renato Alexsander Domingues
 *
 */

public class ConnectionFactory {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("osPostgre");

	public EntityManager getEntityManager() {
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
