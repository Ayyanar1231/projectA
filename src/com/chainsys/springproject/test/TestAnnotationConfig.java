package com.chainsys.springproject.test;
import org.springframework.context.ApplicationContext; // Parent
import org.springframework.context.annotation.AnnotationConfigApplicationContext; // Child

import com.chainsys.springproject.appconfig.AppConfig;
import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;


public class TestAnnotationConfig
{
	public static void testA() 
	{
		ApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp=ac.getBean(Employee.class);
		emp.setId(7);
		emp.setName("Ayyanar");
		emp.print();
	}
}
