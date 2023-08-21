package com.productoutofstock;

public class Main {
	public static void main(String[] args) {
		Product iphone=new Iphone(1);
		Customer customer1=new Observer("pavan");
		iphone.add(customer1);
		iphone.notifyCustomer();
		Customer customer2=new Observer("kavan");
		iphone.add(customer2); 
		iphone.notifyCustomer();
		
		
	}

}
