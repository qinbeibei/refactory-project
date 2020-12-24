package com.test.refactoring.organizemethod.after;

public class Goods {
	private double _itemPrice;
	private double _quantity;

	public double getPrice() {
		return getBasePrice() * getDiscountFactor();
	}

	private double getDiscountFactor() {
		final double discountFactor;
		if (getBasePrice() > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return discountFactor;
	}

	private double getBasePrice() {
		return _itemPrice * _quantity;
	}

	public double getPriceComplex() {
		// 价格=底价-折扣+运输费
		double basePrice = _quantity * _itemPrice;
		double discount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
		double shipping = Math.min(basePrice * 0.1, 100.0);
		return basePrice - discount + shipping;
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
