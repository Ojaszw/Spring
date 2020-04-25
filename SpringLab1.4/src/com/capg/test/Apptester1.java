package com.capg.test;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.bean.Employee;
import com.capg.bean.EmployeeList;

public class Apptester1 {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/cfg/springConfig.xml");
		EmployeeList employ=container.getBean("list",EmployeeList.class);
		Scanner sc=new Scanner(System.in);
		String id=sc.nextLine();
		for(int i=0;i<employ.getEmpList().size();)
		{
			Employee emp=employ.getEmpList().get(i);
			if(emp.getEmpId().equals(id))
			{
				System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getSalary()+" "+emp.getBusinUnit()+" "+emp.getAge());
				break;
			}
			else
			{
				break;
			}
		}
		
		
	}
}
