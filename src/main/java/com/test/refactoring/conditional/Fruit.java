package com.test.refactoring.conditional;

public class Fruit {
	private String SUMMER_START = "05-01";
	private String SUMMER_END = "09-01";

	private int _quantity;
	private double _summerRate;
	private double _winterRate;
	private double _winterServiceCharge = 1.0;

	public Fruit(int quantity, double summerRate, double winterRate) {
		_quantity = quantity;
		_summerRate = summerRate;
		_winterRate = winterRate;
	}

	public double getCharge(String currentDate) {
		double charge = 0.0;
		printBanner();
		if (notSummer(currentDate)) {
			charge = winterCharge();
		} else {
			charge = summerCharge();
		}
		printInfo();
		return charge;
	}

	private void printBanner() {
		// TODO Auto-generated method stub

	}

	private void printInfo() {
		// TODO Auto-generated method stub

	}

	private double summerCharge() {
		return _quantity * _summerRate;
	}

	private double winterCharge() {
		return _quantity * _winterRate + _winterServiceCharge;
	}

	private boolean notSummer(String currentDate) {
		return currentDate.compareTo(SUMMER_START) < 0 || currentDate.compareTo(SUMMER_END) > 0;
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
