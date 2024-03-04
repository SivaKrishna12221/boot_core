package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.MobilesInfo;

@SpringBootApplication
public class BootProj6DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootProj6DataInjectionUsingValueAnnotationApplication.class, args);
	
	MobilesInfo m=ctx.getBean("minfo",MobilesInfo.class);
	System.out.println(m.toString());
	}
}