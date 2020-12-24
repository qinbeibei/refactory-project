package com.test.refactoring.bean;

import junit.framework.TestCase;

public class MovieTest extends TestCase {
	public void testMovie() {
		assertTrue(true);
	}

	public void testSetPriceCode() {
		Movie m = new Movie("title", Movie.REGULAR);
		assertEquals(Movie.REGULAR, m.getPriceCode());
		assertEquals(2.0, m.getCharge(1));
	}
}
