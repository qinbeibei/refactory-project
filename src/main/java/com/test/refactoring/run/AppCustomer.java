package com.test.refactoring.run;

import java.util.ArrayList;
import java.util.List;

import com.test.refactoring.organizemethod.after.Customer;
import com.test.refactoring.organizemethod.after.Order;

/**
 * Hello world!
 *
 */
public class AppCustomer {
	public static void main(String[] args) {
		Customer cust = new Customer("qinbeibei");
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(100.00));
		orders.add(new Order(202.00));
		cust.set_orders(orders);

		cust.printOwing();
    }
}
