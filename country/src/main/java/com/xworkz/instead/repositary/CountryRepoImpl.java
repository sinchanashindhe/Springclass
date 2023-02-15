package com.xworkz.instead.repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.instead.dto.CountryDTO;
@Repository
public class CountryRepoImpl implements CountryRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public CountryRepoImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());	}
	
	@Override
	public boolean save(CountryDTO dto) {
		System.out.println("Running save in repo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 entityTransaction.begin();
		 entityManager.persist(dto);
		 entityTransaction.commit();
		 entityManager.close();
		return false;
	}

}
