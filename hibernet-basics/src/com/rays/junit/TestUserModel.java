package com.rays.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class TestUserModel {
	
	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		//bean.setId(12);
		bean.setName("naman");
		bean.setSalary(5000);

		UserModel model = new UserModel();

		model.add(bean);

		bean = model.findByPk(12);

		if (bean == null) {

			fail("Record is not added...!!!");

		} else {

			System.out.println("Record is  added...!!!");

		}

	}

}
