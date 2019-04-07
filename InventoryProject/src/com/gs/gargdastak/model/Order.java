package com.gs.gargdastak.model;

import java.util.Date;

public class Order {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", purchaseAmt=" + purchaseAmt + ", orderDate=" + orderDate + "]";
	}

	private long orderId;
	private double purchaseAmt;
	private Date orderDate;
	private Customer customer;
	private Salesman salesman;

	public Order(long orderId, double purchaseAmt, Date orderDate, Customer customer, Salesman salesman) {
		this.orderId = orderId;
		this.purchaseAmt = purchaseAmt;
		this.orderDate = orderDate;
		this.customer = customer;
		this.salesman = salesman;
	}

	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the purchaseAmt
	 */
	public double getPurchaseAmt() {
		return purchaseAmt;
	}

	/**
	 * @param purchaseAmt
	 *            the purchaseAmt to set
	 */
	public void setPurchaseAmt(double purchaseAmt) {
		this.purchaseAmt = purchaseAmt;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate
	 *            the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the salesman
	 */
	public Salesman getSalesman() {
		return salesman;
	}

	/**
	 * @param salesman
	 *            the salesman to set
	 */
	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

}
