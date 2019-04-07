package com.gs.gargdastak.service;

import com.gs.gargdastak.model.Customer;

public interface CustomerService {

	public void save(Customer customer);

	public Customer findById(int i);

}
