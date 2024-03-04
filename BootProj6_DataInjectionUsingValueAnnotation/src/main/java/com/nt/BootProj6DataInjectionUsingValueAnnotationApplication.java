package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans2.StudentInfo;

@SpringBootApplication
public class BootProj6DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootProj6DataInjectionUsingValueAnnotationApplication.class, args);
	/* PatientDetails pd=ctx.getBean("patientDetails",PatientDetails.class);
	 System.out.println(pd);
	 */
	/*StudentInfo info=ctx.getBean("info",StudentInfo.class);
	System.out.println(info);*/
	/*BookStall bookStall=ctx.getBean("book",BookStall.class);
	System.out.println(bookStall);*/
	/*BookSeller seller=ctx.getBean("seller",BookSeller.class);
	System.out.println(seller);*/
	StudentInfo info=ctx.getBean("info",StudentInfo.class);
	System.out.println(info);
    ((ConfigurableApplicationContext)ctx).close();
	}

}
