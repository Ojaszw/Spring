package com.capg.beans;

public class Employ {

	private int empId;
	private String empName;
	private int sal;
	private String businUnit;
	private int age;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return sal;
	}
	public void setSalary(int sal) {
		this.sal = sal;
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
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + sal + ", businUnit=" + businUnit
				+ ", age=" + age + "]";
	}
	
}
