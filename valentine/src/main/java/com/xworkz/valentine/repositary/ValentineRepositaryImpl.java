package com.xworkz.valentine.repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;

@Repository
public class ValentineRepositaryImpl extends ValentineRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public ValentineRepositaryImpl() {
		System.out.println("created:" + this.getClass().getSimpleName());

	}

	@Override
	public boolean save(ValentineEntity entity) {

		System.out.println("running save in repositary");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;

	}
}
