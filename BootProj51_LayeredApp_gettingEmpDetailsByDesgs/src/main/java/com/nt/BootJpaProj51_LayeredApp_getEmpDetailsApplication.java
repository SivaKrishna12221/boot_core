package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.EmpController;
import com.nt.model.Employee;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootJpaProj51_LayeredApp_getEmpDetailsApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt=SpringApplication.run(BootJpaProj51_LayeredApp_getEmpDetailsApplication.class, args);
		EmpController controller=	ctxt.getBean("controller",EmpController.class);
		try {
		List<Employee> emp=controller.retriveEmployeeDetails("developer","software","salesman");
	    emp.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
