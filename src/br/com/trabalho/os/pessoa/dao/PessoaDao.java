package br.com.trabalho.os.pessoa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.trabalho.os.pessoa.model.PessoaPo;
import br.com.trabalho.os.utilidades.ConnectionFactory;

public class PessoaDao {
	
	public void salvar(PessoaPo pessoa) throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(pessoa);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}
	
	public void alterar(PessoaPo pessoa) throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
		    em.getTransaction().begin();
		    PessoaPo pessoaEncontrada = em.find(PessoaPo.class, pessoa.getId());
		    em.merge(pessoaEncontrada);
		    em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}
	
	public void excluir(PessoaPo pessoa) throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(pessoa);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}
	
	public List<PessoaPo> filtrar() throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			String hql = "select p from PessoaPo p";
			Query query = em.createQuery(hql);
			return query.getResultList();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}
	
	public PessoaPo filtrarPorId(Long id) throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			String hql = "select p from PessoaPo p where p.id = :pid";
			Query query = em.createQuery(hql);
			query.setParameter("pid", id);
			return (PessoaPo) query.getSingleResult();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}


}
