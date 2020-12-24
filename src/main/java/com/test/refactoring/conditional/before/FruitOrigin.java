package com.test.refactoring.conditional.before;

public class FruitOrigin {
	private final String SUMMER_START = "05-01";
	private final String SUMMER_END = "09-01";

	private int _quantity;
	private double _summerRate;
	private double _winterRate;
	private double _winterServiceCharge = 1.0;

	public FruitOrigin(int quantity, double summerRate, double winterRate) {
		_quantity = quantity;
		_summerRate = summerRate;
		_winterRate = winterRate;
	}

	public double getCharge(String currentDate) {
		double charge = 0.0;
		if (currentDate.compareTo(SUMMER_START) < 0 || currentDate.compareTo(SUMMER_END) > 0) {
			charge = _quantity * _winterRate + _winterServiceCharge;
		} else {
			charge = _quantity * _summerRate;
		}
		return charge;
	}

	public int get_quantity() {
		return _quantity;
	}

	public double get_summerRate() {
		return _summerRate;
	}

	public double get_winterRate() {
		return _winterRate;
	}


}
