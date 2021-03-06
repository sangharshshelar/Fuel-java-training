package com.example.ApplicationMangerJpaDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
	
	@PersistenceUnit
	private EntityManagerFactory emf;
	
	void getData()
	{
		EntityManager em;
		em = emf.createEntityManager();
		
		
		
		// update 
		
		em.getTransaction().begin();
		
		String jsql="";
		
		jsql="update Student e set e.name='helloworld'"+"where e.id=8967";
		
		Query q;
		q = em.createQuery(jsql);
		q.executeUpdate();
		
		em.getTransaction().commit();
		
	}
	
	void getDelete()
	{
		
		EntityManager em;
		em = emf.createEntityManager();
		
		// delete
		
		em.getTransaction().begin();
		String jsql="";
		jsql="delete from Student as e where e.id=8967";
		
		Query q;
		q = em.createQuery(jsql);
		q.executeUpdate();
		em.getTransaction().commit();
	}
	
	void getSelect()
	{
		
		EntityManager em;
		em = emf.createEntityManager();
		em.getTransaction().begin();

		
		
		Query q;
		q = em.createQuery("Select  e.name from Student as e ");
		q.executeUpdate();
    	q.getResultList();
//		q.getSingleResult()

		em.getTransaction().commit();


		
		
		// -------------------------------------------------
		
//		EntityManager em;
//		em = emf.createEntityManager();
//		
//		// select
//		
//		em.getTransaction().begin();
//		String jsql="";
//		jsql ="select e from Student as e";
//		
//		Query q;
//		q = em.createQuery(jsql);
//		q.getResultList();
//		q.executeUpdate();
//		em.getTransaction().commit();
	}

}
