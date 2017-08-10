package br.com.trabalho.os.funcionario.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.trabalho.os.funcionario.model.FuncionarioPo;
import br.com.trabalho.os.utilidades.ConnectionFactory;

public class FuncionarioDao {
	
	public void salvar(FuncionarioPo funcionario) throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(funcionario);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}
	
	public void alterar(FuncionarioPo funcionario) throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			em.getTransaction().begin();
			FuncionarioPo funcionarioEncontrado = em.find(FuncionarioPo.class,funcionario.getId());
			em.merge(funcionarioEncontrado);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}
	
	public void excluir(FuncionarioPo funcionario) throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(funcionario);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}
	
	public List<FuncionarioPo> filtrar() throws Exception{
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			String hql = "select from f FuncionarioPo f";
			Query query = em.createQuery(hql);
			return query.getResultList();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}
	
	public FuncionarioPo filtrarPorId(Long id) throws Exception {
		EntityManager em = new ConnectionFactory().getEntityManager();
		try {
			String hql="select from f FuncionarioPo f where f.id = :pid";
			Query query = em.createQuery(hql);
			query.setParameter("pid",id);
			return (FuncionarioPo) query.getSingleResult();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Erro desconhecido" + e.getMessage());
		}
	}

}
