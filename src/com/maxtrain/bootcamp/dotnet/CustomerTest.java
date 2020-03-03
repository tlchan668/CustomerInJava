package com.maxtrain.bootcamp.dotnet;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an instance of our customer
		Customer customer = new Customer("Max Technical Training",true, 0);
		customer.setId(1);
		//have constructors
		//customer.setId(1);
		//customer.setName("Max Tech Train");
		//customer.setSales(0);
		//customer.setNationalAcct(true);
		
		//print out name to console
		System.out.println(customer.getName()+ ", sales total "+ customer.getSales());
		
		
		try {
			customer.addSales(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(customer.getName()+ ", sales total "+ customer.getSales());
		try {
			customer.addSales(-1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(customer.getName()+ ", sales total "+ customer.getSales());
		
		//add things to a generic collection ie arraylist
		ArrayList<Customer> customers = new ArrayList<Customer>();
		//add our customer into collection
		customers.add(customer);
		
		//add more customer
		Customer customer2 = new Customer("Cust1",true, 0);
		Customer customer3 = new Customer("Cust2");
		customers.add(customer2);
		customers.add(customer3);
		for(Customer c:customers) {
			String message = String.format("%d/%s/%f", c.getId(),c.getName(),c.getSales());
			System.out.println(message);
		}
		
		
		

	}

}
