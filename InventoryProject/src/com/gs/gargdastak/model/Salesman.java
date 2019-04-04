package com.gs.gargdastak.model;

public class Salesman {
	private long salesmanId;
	private String name;
	private String city;
	private double commision;

	public Salesman(long salesmanId, String name, String city, double commision) {
		this.salesmanId = salesmanId;
		this.name = name;
		this.city = city;
		this.commision = commision;
	}

	/**
	 * @return the salesmanId
	 */
	public long getSalesmanId() {
		return salesmanId;
	}

	/**
	 * @param salesmanId
	 *            the salesmanId to set
	 */
	public void setSalesmanId(long salesmanId) {
		this.salesmanId = salesmanId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the commision
	 */
	public double getCommision() {
		return commision;
	}

	/**
	 * @param commision
	 *            the commision to set
	 */
	public void setCommision(double commision) {
		this.commision = commision;
	}

	@Override
	public String toString() {
		return "Salesman [salesmanId=" + salesmanId + ", name=" + name + ", city=" + city + ", commision=" + commision
				+ "]";
	}

}
