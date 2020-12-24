package com.test.refactoring.organizemethod.before;

import java.util.Enumeration;
import java.util.Vector;

public class Customer_0 {
	private String _name;
	private Vector<Order_0> _orders = new Vector<Order_0>();

	public Customer_0(String name) {
		_name = name;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Vector<Order_0> get_orders() {
		return _orders;
	}

	public void set_orders(Vector<Order_0> _orders) {
		this._orders = _orders;
	}

	public void addOrder(Order_0 order) {
		_orders.add(order);
	}

	public void printOwing() {
		Enumeration<Order_0> e = _orders.elements();
		double outstanding = 0.0;

		// print banner
		System.out.println("***************************");
		System.out.println("******Customer owes********");
		System.out.println("***************************");

		// calculate outstanding
		while (e.hasMoreElements()) {
			Order_0 each = (Order_0) e.nextElement();
			outstanding += each.getAmount();
		}

		// print details
		System.out.println("name:" + _name);
		System.out.println("amount:" + outstanding);
	}
}
