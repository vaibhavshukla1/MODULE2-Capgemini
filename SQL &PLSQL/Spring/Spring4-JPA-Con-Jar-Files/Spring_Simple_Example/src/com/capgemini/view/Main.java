package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.capgemini.bean.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("After application context");
		Employee emp=(Employee)application.getBean("employee");
		
		System.out.println(emp.getE_id());
		System.out.println(emp.getE_name());


	}

}
