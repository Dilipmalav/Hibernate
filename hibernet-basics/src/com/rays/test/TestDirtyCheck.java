package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.auction.AucationItem;

public class TestDirtyCheck {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		AucationItem item = (AucationItem) session.get(AucationItem.class, 1);
		
		item.setDescription("change");
		
		tx.commit();
		
		session.close();
	}

}
