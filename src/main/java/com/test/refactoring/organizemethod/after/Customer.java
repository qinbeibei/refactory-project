package com.test.refactoring.organizemethod.after;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String _name;
	private List<Order> _orders = new ArrayList<Order>();

	public Customer(String name) {
		_name = name;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public List<Order> get_orders() {
		return _orders;
	}

	public void set_orders(List<Order> _orders) {
		this._orders = _orders;
	}

	public void printOwing() {
		printBanner();

		double outstanding = calOutstanding();

		printDetails(outstanding);
	}

	private double calOutstanding() {
		// calculate outstanding
		double outstanding = 0.0;
		for (int i = 0; i < _orders.size(); i++) {
			Order each = _orders.get(i);
			outstanding += each.getAmount();
		}
		return outstanding;
	}

	private void printDetails(double outstanding) {
		// print details
		System.out.println("name:" + _name);
		System.out.println("amount:" + outstanding);
	}

	private void printBanner() {
		// print banner
		System.out.println("***************************");
		System.out.println("******Customer owes********");
		System.out.println("***************************");
	}

	public void printOwing(double previousAmount) {
		printBanner();

		double outstanding = calOutstanding(previousAmount);

		printDetails(outstanding);
	}

	private double calOutstanding(double previousAmount) {
		// calculate outstanding
		double outstanding = previousAmount * 1.2;
		for (int i = 0; i < _orders.size(); i++) {
			Order each = _orders.get(i);
			outstanding += each.getAmount();
		}
		return outstanding;
	}
}
