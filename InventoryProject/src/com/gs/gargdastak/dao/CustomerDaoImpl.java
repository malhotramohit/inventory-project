package com.gs.gargdastak.dao;

import java.util.List;

import com.gs.gargdastak.model.Customer;
import com.gs.gargdastak.util.DatabaseUtil;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void save(Customer customer) {
		DatabaseUtil.customerTable.add(customer);
	}

	@Override
	public Customer findById(int i) {
		List<Customer> customers = DatabaseUtil.customerTable;
		Customer customerToReturn = null;
		for (Customer customer : customers) {
			if (customer.getCustId() == i) {
				customerToReturn = customer;
				break;
			}
		}

		return customerToReturn;
	}

}
