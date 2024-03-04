package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.EmployeeInfo;

@SpringBootApplication
public class BootProj8InjectingSpecialvaluesToSpringBeanPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication
				.run(BootProj8InjectingSpecialvaluesToSpringBeanPropertiesApplication.class, args);
		/*
		 * CompanyInfo ci=ctx.getBean("comInfo",CompanyInfo.class);
		 * System.out.println(ci);
		 */
		EmployeeInfo emp = ctx.getBean("empInfo", EmployeeInfo.class);
		System.out.println(emp);
		((ConfigurableApplicationContext) ctx).close();
	}

}
