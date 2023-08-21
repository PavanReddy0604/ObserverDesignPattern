package com.productoutofstock;

public class Observer implements Customer {

	
	String name;
	
	public Observer(String name) {
		this.name=name;
	}
	
	@Override
	public void updated() {
		System.out.println("Hey "+name+" , you will be notified when product is in stock now ..!");
	}


}
