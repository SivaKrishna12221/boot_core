package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstApp_dependencyInjectionTest
{
   @Bean(name="ldt")
   public LocalDateTime createLocalDateTime()
   {
	   return LocalDateTime.now();
	   
   }
   
   public static void main(String args[])
   {
	   ApplicationContext ctx=SpringApplication.run(FirstApp_dependencyInjectionTest.class,args);
			   
		  WishMessageGenerator wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		  
		  String result=wmg.generateWishMessage("siva");
		  System.out.println(result);
		  ((ConfigurableApplicationContext)ctx).close();
			   
			 
   }
 
}
