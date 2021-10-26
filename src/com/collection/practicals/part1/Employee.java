package com.collection.practicals.part1;

import java.util.Date;

public class Employee {

	String name, email;
	Date dob;
	Address homeAddr;
	Address officeAddr;

	 
	public Employee(String name,String email, Date dob, Address homeAddr, Address officeAddr) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.homeAddr = homeAddr;
		this.officeAddr = officeAddr;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Employee)
		{
			Employee e = (Employee) o;
			if(this.name.equals(e.name) && this.email.equals(e.email) && this.dob == e.dob
					&& this.homeAddr.equals(e.homeAddr) && this.officeAddr.equals(e.officeAddr))
				return true;
			else
				return false;
		}
		else
			throw new IllegalArgumentException("Pass only Employees");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", dob=" + dob + ", homeAddr=" + homeAddr
				+ ", officeAddr=" + officeAddr + "]";
	}
	
}
