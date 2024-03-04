package com.nt;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.Controller.HostelController;
import com.nt.model.Hostel;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class BootProjt10LayeredAppProfilesMultiYmLfilesApplication {
	
	@Autowired
	private Environment envi;
	
	@Bean("c3p0")
	@Profile({"dev","test"})
	public ComboPooledDataSource createCPDS()throws Exception
	{
		ComboPooledDataSource cpds=new ComboPooledDataSource();
		cpds.setDriverClass(envi.getProperty("spring.datasource.driver-class-name"));
		cpds.setJdbcUrl(envi.getProperty("spring.datasource.url"));
		cpds.setUser(envi.getProperty("spring.datasource.username"));
		cpds.setPassword(envi.getProperty("spring.datasource.password"));
		cpds.setMinPoolSize(Integer.parseInt(envi.getProperty("c3p0.minSize")));
		cpds.setMaxPoolSize(Integer.parseInt(envi.getProperty("c3p0.maxSize")));
		return cpds;
	}
	
	
	@Bean("dmds2")
    @Profile({"prod","uat"})
	public DriverManagerDataSource createBSC()throws Exception
	{
		DriverManagerDataSource bds=new DriverManagerDataSource();
		bds.setDriverClassName(envi.getProperty("spring.datasource.driver-class-name"));
		bds.setUrl(envi.getProperty("spring.datasource.url"));
		bds.setUsername(envi.getProperty("spring.datasource.username"));
		bds.setPassword(envi.getProperty("spring.datasource.password"));
		return bds;
	}
	
	 public  static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name:");
		String city = sc.nextLine();
		System.out.println("enter hostel name");
		String hostelName = sc.nextLine();
		System.out.println("enter room number");
		int roomNumber = sc.nextInt();
		System.out.println("enter price");
		Double price = sc.nextDouble();
		System.out.println("enter sharing:");
		int sharing = sc.nextInt();
		System.out.println("washing available ");
		String washingMachine = sc.next();
		Hostel hostel = new Hostel();
		hostel.setCity(city);
		hostel.setHostel_name(hostelName);
		hostel.setRoom_number(roomNumber);
		hostel.setPrice(price);
		hostel.setSharing(sharing);
		hostel.setWashing_machine(washingMachine);

		ApplicationContext ctx = SpringApplication.run(BootProjt10LayeredAppProfilesMultiYmLfilesApplication.class,
				args);
		System.out.println("BootProjt10LayeredAppProfilesMultiYmLfilesApplication.main()");
		
		HostelController controller = ctx.getBean("hostelController", HostelController.class);

		String result = controller.enterdata(hostel);
		System.out.println(result);
		((ConfigurableApplicationContext) ctx).close();
	}

}
