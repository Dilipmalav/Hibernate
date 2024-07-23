package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAssertEqual extends TestCase{

	@Test
	public void testAssertEqual() {

		int max = Calculation.findMax(new int[] { 1, 3, 4, 2, 6 });

		assertEquals(6, max);

	}

}
