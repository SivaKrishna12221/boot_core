package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

//import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.EmpController;
import com.nt.model.Employee;

@SpringBootApplication/*(exclude= {DataSourceAutoConfiguration.class,JdbcTemplateAutoConfiguration.class})*/
@ImportResource("com/nt/config/applicationContext.xml")
public class BootProj5LayeredAppApplication 
{
	
	
	/* @Autowired private Environment envi;
	 
	 @Bean("c3p0") public ComboPooledDataSource createCPDS()throws Exception{
	 ComboPooledDataSource cpds=new ComboPooledDataSource();
	 System.out.println("BootProj5LayeredAppApplication.createCPDS()");
	 cpds.setDriverClass(envi.getRequiredProperty(
	 "spring.datasource.driver-class-name"));
	 cpds.setJdbcUrl(envi.getRequiredProperty("spring.datasource.url"));
	 cpds.setUser(envi.getRequiredProperty("spring.datasource.username"));
	 cpds.setPassword(envi.getRequiredProperty("spring.datasource.password"));
	 cpds.setInitialPoolSize(Integer.parseInt(envi.getRequiredProperty(
	 "c3p0.minsize")));
	 cpds.setMaxPoolSize(Integer.parseInt(envi.getRequiredProperty("c3p0.maxsize")
	 )); return cpds; }
	*/
	 
	public static void main(String[] args) throws Exception{
	ApplicationContext ctx=	SpringApplication.run(BootProj5LayeredAppApplication.class, args);
	
	EmpController empdetails=ctx.getBean("empcontroller",EmpController.class);
	
	List<Employee> list=empdetails.showAllEmpByDesg("manager","accountant","salesman");
	/*
	 * for(Employee emp :list) { System.out.println(emp);}
	 */
	list.forEach(emp->{System.out.println(emp);});
	
	}
}
