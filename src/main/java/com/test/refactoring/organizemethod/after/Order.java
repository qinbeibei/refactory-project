package com.test.refactoring.organizemethod.after;

public class Order {
	private double _amount;

	public Order(double arg) {
		_amount = arg;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double _amount) {
		this._amount = _amount;
	}
}
