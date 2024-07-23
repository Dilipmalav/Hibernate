package com.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestSavePersist {
	
	public static void main(String[] args) {
		
		UserDTO dto = new UserDTO();
		
		dto.setFirstName("prakhar");
		dto.setLastName("solnki");
		dto.setLoginId("dilip@gmail.com");
		dto.setPassword("888");
		dto.setDob(new Date());
		dto.setAddress("jhalawar");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
	   //int i = (int) session.save(dto);
		
		//System.out.println("i =>>"+i);
		
		session.persist(dto);
		
		tx.commit();
		
		session.close();
	}

}