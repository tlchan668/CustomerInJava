package com.maxtrain.bootcamp.dotnet;

public class Customer {
	
	private static int nextId=1;
	
	
	public void addSales(double amount) throws ArithmeticException, Exception{
		if (amount==0) {
			throw new ArithmeticException("Cannot add zero sales");
		}
		if (amount<=0) {
			//thrown exception
			throw new Exception("Amount must be greater than 0");
		}
		setSales(getSales() + amount);
	}

	private int _id;
	//create our getter or setter
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id=id;
	}
	
	private String _name;
	public String getName() {
		return _name;
	}
	public void setName(String _name) {
		this._name = _name;
	}
	
	private boolean _isNationalAcct;
	public boolean getNationalAcct() {
		return _isNationalAcct;
	}
	public void setNationalAcct(boolean isNationalAcct) {
		this._isNationalAcct = isNationalAcct;
	}
	
	private double _sales;
	public double getSales() {
		return _sales;
	}
	public void setSales(double sales) {
		this._sales = sales;
	}
	//constructors
	public Customer(String name, boolean nationalAccount, double sales) {
		//set properties with getter and setters
		this.setId(nextId++);//good place to generate ids if need to by doing 
		this.setName(name);
		this.setNationalAcct(nationalAccount);
		this.setSales(sales);
	}
	public Customer(String name, boolean nationAccount) {
		this(name,nationAccount,0);//this will pass data to another constructor
	}
	public Customer(String name) {
		this(name, false);//constructor to just take name and set others to default
		//don't have to pass in third parameter because will call the constructor with2 
	}
	public Customer() {
		this(null);//do this so that values will be initialized. if left blank then when call 
		//things would not get initialized
	}
}
