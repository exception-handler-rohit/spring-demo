package com.springdemo;

public class Flipkart {

	private Courier courier;
	private int x;
	String var;

	public Flipkart(int x) {

		this.x = x;
	}
	
	public Flipkart(String var) {

		this.var = var;
	}
	
	public Flipkart(int x,Courier  c ) {
		courier=c;
		this.x = x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Courier getCourier() {
		return courier;
	}
	

/*	public Flipkart(Courier courier) {

		this.courier = courier;
	}*/

	public Flipkart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * public void setCourier(Courier courier) { this.courier = courier; }
	 */
	public void flipkartDelievery() {

		this.courier.courierService();
	}
	
	public void display() {
		
		System.out.println(this.var);
		System.out.println(this.x);
	}
}
