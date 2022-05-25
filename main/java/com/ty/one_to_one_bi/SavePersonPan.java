package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonPan {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Pan pan = new Pan();
		pan.setPanNumber("TY41CM");
		pan.setAddr("Banglore");
		
		Person person = new Person();
		person.setName("Rajan");
		person.setEmail("raj@gmail.com");
		
		person.setPan(pan);
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	
}
