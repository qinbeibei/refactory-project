package com.test.refactoring.organizemethod.before;

public class GoodsSimple_0 {
	private double _itemPrice;
	private double _quantity;

	public double getPrice() {
		double basePrice = _itemPrice * _quantity;
		if (basePrice > 1000) {
			return basePrice * 0.95;
		} else {
			return basePrice * 0.98;
		}
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
