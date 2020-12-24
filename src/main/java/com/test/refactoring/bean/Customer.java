package com.test.refactoring.bean;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental rental) {
		_rentals.add(rental);
	}

	public String get_name() {
		return _name;
	}

	public String statement() {
		String result = get_name() + "\n";
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			result += each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		return result;
	}

}
