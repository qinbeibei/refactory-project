package com.test.refactoring.organizemethod.before;

public class Goods_0 {
	private double _itemPrice;
	private double _quantity;

	public double getPrice() {
		double basePrice = _itemPrice * _quantity;
		double discountFactor;
		if (basePrice > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}

	public double getPriceComplex() {

		return _quantity * _itemPrice - Math.max(0, _quantity - 500) * _itemPrice
				+ Math.min(_quantity * _itemPrice * 0.1, 100.0);
	}

	public double get_itemPrice() {
		return _itemPrice;
	}

	public void set_itemPrice(double _itemPrice) {
		this._itemPrice = _itemPrice;
	}

	public double get_quantity() {
		return _quantity;
	}

	public void set_quantity(double _quantity) {
		this._quantity = _quantity;
	}
}
