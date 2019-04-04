package com.gs.gargdastak.application;

import com.gs.gargdastak.model.Customer;
import com.gs.gargdastak.model.Salesman;
import com.gs.gargdastak.service.SalemanNotFoundException;
import com.gs.gargdastak.service.SalesmanService;
import com.gs.gargdastak.service.SalesmanServiceImpl;

public class TestInventoryApp {

	private static SalesmanService salesmanService = new SalesmanServiceImpl();

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

		Customer customer = new Customer(1, "RahulCus", "GGN", "A", salesman);
		
		//Interface : CustomerService
		// Impl: CustomerServiceImpl
		// Dao Inter: CustomerDao
		// Impl : CustomerDaoImpl
		// Database util one method:
		
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
