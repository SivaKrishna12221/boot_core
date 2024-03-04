package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasionFinder;

@SpringBootApplication
public class BootProj1SessionDependencyInjection1Application {

	@Bean(name="ldt")
	public LocalDate createLocalDate()
	{
		return LocalDate.now();
	}
	public static void main(String[] args) {
	  
		ApplicationContext ctx=SpringApplication.run(BootProj1SessionDependencyInjection1Application.class, args);
		SeasionFinder sf=ctx.getBean("sf",SeasionFinder.class);
		String result=sf.findSeason("siva");
		System.out.println(result);
		
	}

}
