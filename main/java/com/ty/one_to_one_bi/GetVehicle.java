package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetVehicle {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 2);
		System.out.println(vehicle.getId());
		System.out.println(vehicle.getName());
		System.out.println(vehicle.getCost());
		Charcy charcy=vehicle.getCharcy();
		System.out.println(charcy.getCharcyNumber());
		System.out.println(charcy.getType());
	}
}
