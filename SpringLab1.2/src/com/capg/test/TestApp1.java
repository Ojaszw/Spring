package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Employ;
import com.capg.beans.SBU;

public class TestApp1 {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/cfg/springConfig.xml");
		Employ employ=container.getBean("emp",Employ.class);
		SBU sbu=container.getBean("sbu",SBU.class);
		System.out.println(employ);
		System.out.println(sbu);
		System.out.println("Employee Info");
		System.out.println("---------------");
		System.out.println("Employee ID :"+" "+employ.getEmpId());
		System.out.println("Employee Name :"+" "+employ.getEmpName());
		System.out.println("Employee Salary :"+" "+employ.getSalary());
		System.out.println("Employee BU :"+" "+employ.getBusinUnit());
		System.out.println("Employee Age :"+" "+employ.getAge());


	}
}
