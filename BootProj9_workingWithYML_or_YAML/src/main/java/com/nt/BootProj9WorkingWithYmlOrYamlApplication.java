package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans2.Matrimony;

@SpringBootApplication
public class BootProj9WorkingWithYmlOrYamlApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx=	SpringApplication.run(BootProj9WorkingWithYmlOrYamlApplication.class, args);
		/* CustomerInfo info=ctx.getBean("custInfo",CustomerInfo.class);
		 System.out.println(info);*/
	Matrimony matrimony= ctx.getBean("matrimony",Matrimony.class);
	System.out.println(matrimony);
	 ((ConfigurableApplicationContext)ctx).close();
	}

}
