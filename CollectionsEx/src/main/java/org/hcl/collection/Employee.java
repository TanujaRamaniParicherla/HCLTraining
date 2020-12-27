package org.hcl.collection;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	private String employeeName,employeeEmail;
	private ArrayList<String> employeeMobileNumber;
	private long employeeSalary;
	private Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, String employeeEmail, ArrayList<String> employeeMobileNumber,
			long employeeSalary, Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeSalary = employeeSalary;
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	@Autowired
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	@Autowired
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public ArrayList<String> getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	@Autowired
	public void setEmployeeMobileNumber(ArrayList<String> employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	@Autowired
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println(getEmployeeName()+"\t"+getEmployeeMobileNumber()+"\t"+getEmployeeSalary()+"\t"+getEmployeeSalary()+"\t"+getAddress());
		address.display();
	}
}
