package com.example.corejava.demo;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public String name;
	public long eid;
	public String dept;
	
	public Employee(String name, long eid, String dept) {
		this.name = name;
		this.eid = eid;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", dept=" + dept + "]";
	}

}
