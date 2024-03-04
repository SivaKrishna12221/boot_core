package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.VehicleClass;

@SpringBootApplication
@ImportResource("com/nt/cfgs/ApplicationContext.xml")
public class BootProj4StrategyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj4StrategyDpApplication.class, args);
		VehicleClass vc=ctx.getBean("vc",VehicleClass.class);
	    vc.move("Hyderabad","Tirupathi");
	    ((ConfigurableApplicationContext)ctx).close();
		
	}

}
