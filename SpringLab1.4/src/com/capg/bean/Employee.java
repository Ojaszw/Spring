package com.capg.bean;

public class Employee {
	public  String empId;
	private String empName;
	private int salary;
	private String businUnit;
	private int age;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBusinUnit() {
		return businUnit;
	}
	public void setBusinUnit(String businUnit) {
		this.businUnit = businUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", businUnit=" + businUnit
				+ ", age=" + age + "]";
	}
	

}
