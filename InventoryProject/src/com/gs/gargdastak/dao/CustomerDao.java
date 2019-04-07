package com.gs.gargdastak.dao;

import com.gs.gargdastak.model.Customer;

public interface CustomerDao {

	public void save(Customer customer);

	public Customer findById(int i);

}
