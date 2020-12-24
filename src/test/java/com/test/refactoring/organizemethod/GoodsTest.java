package com.test.refactoring.organizemethod;

import com.test.refactoring.organizemethod.after.Goods;

import junit.framework.TestCase;

public class GoodsTest extends TestCase {
	public GoodsTest(String name) {
		super(name);
	}

	public void test_base_price_large_than_1000() {
		Goods goods = new Goods();
		goods.set_itemPrice(1.2);
		goods.set_quantity(1000);

		assertEquals(1140.0, goods.getPrice());
	}

	public void test_base_price_less_than_1000() {
		Goods goods = new Goods();
		goods.set_itemPrice(0.8);
		goods.set_quantity(1000);

		assertEquals(784.0, goods.getPrice());
	}
}
