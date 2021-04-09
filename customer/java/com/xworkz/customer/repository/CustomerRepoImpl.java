package com.xworkz.customer.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.customer.entity.CustomerEntity;

public class CustomerRepoImpl implements CustomerRepo{

	public CustomerRepoImpl() {
		System.out.println("created" +this.getClass().getName());
	}
	
	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save method" +entity);
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
	}

}
