package com.gs.gargdastak.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gs.gargdastak.model.Customer;
import com.gs.gargdastak.model.Order;
import com.gs.gargdastak.model.Salesman;
import com.gs.gargdastak.service.CustomerService;
import com.gs.gargdastak.service.CustomerServiceImpl;
import com.gs.gargdastak.service.SalemanNotFoundException;
import com.gs.gargdastak.service.SalesmanService;
import com.gs.gargdastak.service.SalesmanServiceImpl;

public class TestInventoryApp {

	private static SalesmanService salesmanService = new SalesmanServiceImpl();
	private static CustomerService customerService = new CustomerServiceImpl();

	public static void main(String[] args) {

		// create salesman
		// create customer
		// create orders
		// delete order where cid : 1
		// update order of sid: 2
		// sort all the order with respect to date

		// testSalemanFunc();
		testCustomerFunc();

	}

	private static void testCustomerFunc() {

		Salesman salesman = new Salesman(1, "Mohit", "Delhi", 2344.22334);
		salesmanService.save(salesman);

		Salesman salesman1 = new Salesman(2, "Rohit", "Mumbai", 5000.12);
		salesmanService.save(salesman1);


		Order order1 = new Order(1, 2323, new Date(), null, salesman);
		Order order2 = new Order(2, 2326, new Date(), null, salesman1);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);

		
		Customer customer = new Customer(1, "RahulCus", "GGN", "A", salesman);
		customer.setOrderList(orderList);
		
		customerService.save(customer);

		Customer customer2 = customerService.findById(1);

		displayCustomer(customer2);
		
		


		// Interface : CustomerService
		// Impl: CustomerServiceImpl
		// Dao Inter: CustomerDao
		// Impl : CustomerDaoImpl
		// Database util one method:

	}

	private static void displayCustomer(Customer customer2) {
		System.out.println(customer2);
	}

	private static void testSalemanFunc() {
		Salesman salesman = new Salesman(1, "Mohit", "Delhi", 2344.22334);
		salesmanService.save(salesman);

		Salesman salesman2 = salesmanService.findById(1);

		displaySalesman(salesman2);

		Salesman salesman3;
		try {
			salesman3 = salesmanService.findByIdWithRoundedComm(23);
			displaySalesman(salesman3);
		} catch (SalemanNotFoundException e) {
			// TODO Auto-generated catch block
		}

		displaySalesman(salesman2);
	}

	private static void displaySalesman(Salesman salesman2) {
		if (null != salesman2) {
			System.out.println("Id :" + salesman2.getSalesmanId());
			System.out.println("City: " + salesman2.getCity());
			System.out.println("Commision :" + salesman2.getCommision());
		}

	}

}
