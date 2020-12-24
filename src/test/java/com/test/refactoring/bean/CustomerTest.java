package com.test.refactoring.bean;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {
	public CustomerTest(String name) {
		super(name);
	}

	/*
	 * public static Test suite() { TestSuite mySuite = new TestSuite();
	 * mySuite.addTest(new CustomerTest("testStatement")); mySuite.addTest(new
	 * CustomerTest("testtest")); return mySuite; }
	 */

	public void testStatement() {
		Customer cust = setData();

		System.out.println(cust.statement());
		assertEquals("Peter\nlalala\t2.0\nice-land\t1.5\n", cust.statement());
	}

	private Customer setData() {
		Movie movie_1 = new Movie("lalala", Movie.REGULAR);
		Rental rental_1 = new Rental(movie_1, 1);
		Movie movie_2 = new Movie("ice-land", Movie.CHILDRENS);
		Rental rental_2 = new Rental(movie_2, 2);
		Customer cust = new Customer("Peter");
		cust.addRental(rental_1);
		cust.addRental(rental_2);
		return cust;
	}
}
