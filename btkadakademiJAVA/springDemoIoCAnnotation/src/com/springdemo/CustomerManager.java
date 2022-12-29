package com.springdemo;

public class CustomerManager implements ICustomerService {

	ICustomerDal customerDal;

	// constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// iş kuralları
		customerDal.add();

	}

}
