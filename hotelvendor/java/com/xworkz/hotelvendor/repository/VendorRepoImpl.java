package com.xworkz.hotelvendor.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.hotelvendor.entity.VendorEntity;

public class VendorRepoImpl implements VendorRepo{

	public VendorRepoImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@Override
	public void save(VendorEntity entity) {
		System.out.println("invoked save" +entity);
		
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
