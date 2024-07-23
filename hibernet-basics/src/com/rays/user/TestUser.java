package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUser {

	public static void main(String[] args) {

		 testAdd();
		// testUpdate();
		// testDelete();
		// testGet();
		//testAuthenticate();
		//testSearch();

	}

	private static void testSearch() {
		UserDTO dto = new UserDTO();

		//dto.setFirstName("abc");

		UserModel model = new UserModel();

		List list = model.search(dto);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDTO) it.next();

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		}
		
	}

	private static void testAuthenticate() {
		
		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("sagar@gmail.com", "123");

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		} else {
			System.out.println("Authentication failed..!!");
		}

	}

	private static void testGet() {

		UserModel model = new UserModel();

		UserDTO dto = model.findByPk(3);

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());

	}

	private static void testDelete() {

		UserDTO dto = new UserDTO();
		dto.setId(2);

		UserModel model = new UserModel();

		model.delete(dto);

	}

	private static void testUpdate() {

		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("dilip");
		dto.setLastName("dhaker");
		dto.setLoginId("dilip@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("jhalawar");

	}

	private static void testAdd() {

		UserDTO dto = new UserDTO();

		dto.setFirstName("sanat");
		dto.setLastName("chouhan");
		dto.setLoginId("sanat@gmail.com");
		dto.setPassword("123456");
		dto.setDob(new Date());
		dto.setAddress("indore");

		UserModel model = new UserModel();
		model.add(dto);

	}
}
