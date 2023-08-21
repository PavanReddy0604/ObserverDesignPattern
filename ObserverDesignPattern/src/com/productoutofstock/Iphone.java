package com.productoutofstock;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Product {

	List<Customer> customers = new ArrayList<>();

	private int iphoneInStock;

	public Iphone(int iphoneInStock) {
		this.iphoneInStock = iphoneInStock;
	}

	@Override
	public void add(Customer c) {
		System.out.println("customer is opted to be notified");
		customers.add(c);
	}

	@Override
	public void remove(Customer c) {
		System.out.println("customer is opted out from being notified");

	}

	@Override
	public void notifyCustomer() {
		for (Customer c : customers) {
			c.updated();
		}
	}

}
