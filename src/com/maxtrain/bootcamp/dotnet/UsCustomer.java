package com.maxtrain.bootcamp.dotnet;

public class UsCustomer extends Customer {
	
	public UsCustomer(String name, double sales) {
		super(name, true, sales);//initialize it and calls customer(the super class) to initialize
	}
	public UsCustomer(String name) {
		this(name, 0);
	}
	public UsCustomer() {
		this("A US Customer");
	}

}
