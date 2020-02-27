package com.java.oops;

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cmp=new Company("Square yards");
		Employee emp=new Employee("brajesh kumar");
		System.out.print("Employee name is "+emp.getEname()+"and company is "+cmp.getCname());

	}
}


class Company
{
	public String c_name;
	public Company(String cname) {
		// TODO Auto-generated constructor stub
		this.c_name=cname;
	}
	public String getCname()
	{
		return this.c_name;
	}
}

class Employee
{
	public String ename;
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.ename=name;
	}
	public String getEname()
	{
		return this.ename;
	}
}


