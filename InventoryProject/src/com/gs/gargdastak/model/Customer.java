package com.gs.gargdastak.model;

import java.util.List;

public class Customer {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", city=" + city + ", grade=" + grade
				+ ", salesman=" + salesman + ", orderList=" + orderList + "]";
	}

	private long custId;
	private String customerName;
	private String city;
	private String grade;
	private Salesman salesman;
	private List<Order> orderList;

	public Customer(long custId, String customerName, String city, String grade, Salesman salesman) {
		this.custId = custId;
		this.customerName = customerName;
		this.city = city;
		this.grade = grade;
		this.salesman = salesman;
	}

	/**
	 * @return the custId
	 */
	public long getCustId() {
		return custId;
	}

	/**
	 * @param custId
	 *            the custId to set
	 */
	public void setCustId(long custId) {
		this.custId = custId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
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

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

}
