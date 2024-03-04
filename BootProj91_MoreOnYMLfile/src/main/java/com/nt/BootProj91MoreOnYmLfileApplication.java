package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Dmart;

@SpringBootApplication
public class BootProj91MoreOnYmLfileApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(BootProj91MoreOnYmLfileApplication.class, args);
	Dmart dmart=ctx.getBean("dmart",Dmart.class);
	System.out.println(dmart);
    ((ConfigurableApplicationContext)ctx).close();
	}

}
