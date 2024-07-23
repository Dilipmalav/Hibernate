package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestUpdateMerge {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		UserDTO dto = (UserDTO) session.get(UserDTO.class, 1);
		
		session.close();
		
		dto.setFirstName("bharat");
		dto.setLastName("dhaker");
		
		Session session2 =  sf.openSession();
		
		Transaction tx = session2.beginTransaction();
		
		session2.update(dto); // isme same data insert krne pr bhi update ki query all time chalti h
		
		//session2.merge(dto); // isme same data insert krne pr update ki query second time nhi chalti h
		
		tx.commit();
		
		session2.close();
	}
}
