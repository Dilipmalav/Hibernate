package com.rays.test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.auction.AucationItem;

public class TestLazyEager {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		AucationItem item = (AucationItem) session.get(AucationItem.class, 1);

//		Set s = item.getBids();
//
//		Iterator it = s.iterator();
		
		tx.commit();
		
		session.close();

		// lazy chalate h tab alag alag data get krna pdata h change aucationitem ki hbm file me krte h 
		
		// Eager chalta h tab dono tables ka data leke aata h bina set kiye bhi aucationitem ki hbm file me krte h
	}

}
