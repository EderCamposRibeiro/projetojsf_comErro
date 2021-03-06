package br.com.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.jpautil.JPAUtil;

public class DaoGeneric<E> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public void salvar(E entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			
			entityManager.persist(entidade);
			
			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
