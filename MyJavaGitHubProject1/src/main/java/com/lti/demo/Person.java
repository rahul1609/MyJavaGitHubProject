package com.lti.demo;

public class Person {
	private int perId;
	private String perName;
	private double sal;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int perId, String perName, double sal) {
		super();
		this.perId = perId;
		this.perName = perName;
		this.sal = sal;
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + ", sal=" + sal + "]";
	}
	
	

}
