package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans2.Hote;

@SpringBootApplication
public class BootProj6ValueAnnotationSpelApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(BootProj6ValueAnnotationSpelApplication.class, args);
	//Hotel hotel=ctx.getBean("hotel",Hotel.class);
	Hote  ht=ctx.getBean("hote",Hote.class);
	System.out.println(ht);
//	System.out.println(hotel);
	((ConfigurableApplicationContext)ctx).close();//here we are doing type casting because
	}

}
