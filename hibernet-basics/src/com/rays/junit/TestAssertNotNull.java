package com.rays.junit;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAssertNotNull extends TestCase{

	@Test
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(10);

		assertNotNull("user is  null", bean);

	}

}
