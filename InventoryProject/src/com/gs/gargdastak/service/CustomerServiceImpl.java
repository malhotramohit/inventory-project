package com.gs.gargdastak.service;

import com.gs.gargdastak.dao.CustomerDao;
import com.gs.gargdastak.dao.CustomerDaoImpl;
import com.gs.gargdastak.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public Customer findById(int i) {
		return customerDao.findById(i);
	}

}
