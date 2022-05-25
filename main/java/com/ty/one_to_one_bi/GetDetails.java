package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetDetails {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		Pan pan=entityManager.find(Pan.class, 1);
//		System.out.println(pan.getAddr());
//		System.out.println(pan.getPanNumber());
//		
//		Person person = pan.getPerson();
//		System.out.println(person.getName());
//		System.out.println(person.getEmail());
		
		Person person=entityManager.find(Person.class, 1);
		System.out.println(person.getName());
		System.out.println(person.getEmail());
		
		Pan pan = person.getPan();
		System.out.println(pan.getAddr());
		System.out.println(pan.getPanNumber());
	}
}
