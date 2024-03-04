package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Institution;

@SpringBootApplication
public class BootProj7BulkDataInjectionApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=		SpringApplication.run(BootProj7BulkDataInjectionApplication.class, args);
	Institution insti=ctx.getBean("institute",Institution.class);
	System.out.println(insti);
	}

}
