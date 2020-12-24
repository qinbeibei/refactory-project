package com.test.refactoring.conditional;

public class Salary {
	private boolean _isDead;
	private boolean _isRetired;

	public double getPayAmount() {
		double amount = 0.0;
		if (_isDead) {
			amount = deadAmount();
		} else {
			if (_isRetired) {
				amount = retiredAmount();
			} else {
				amount = normalAmount();
			}
		}
		return amount;
	}

	private double retiredAmount() {
		return 0;
	}

	private double normalAmount() {
		return 0;
	}

	private double deadAmount() {
		return 0;
	}
}
