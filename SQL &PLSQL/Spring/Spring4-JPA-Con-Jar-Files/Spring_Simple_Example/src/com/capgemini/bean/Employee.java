package com.capgemini.bean;

public class Employee {
	String e_name;
	int e_id;

	public Employee() {
		System.out.println("from constructor");
	}
	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

}
