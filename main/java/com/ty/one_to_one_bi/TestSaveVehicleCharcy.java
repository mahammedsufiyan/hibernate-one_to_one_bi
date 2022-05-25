package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleCharcy {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Indigo-cs");
		vehicle.setCost(150000);
		
		Charcy charcy = new Charcy();
		charcy.setCharcyNumber("IND122TY");
		charcy.setType("OnRoad");
		
		vehicle.setCharcy(charcy);

		entityTransaction.begin();
		entityManager.persist(vehicle);		
		entityTransaction.commit();
	}
}
