package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.HostelController;
import com.nt.model.Hostel;

@SpringBootApplication
public class BootProj5LayeredAppHostelRoomsApplication {

	public static void main(String[] args) throws Exception
	{

	   SpringApplication.run(BootProj5LayeredAppHostelRoomsApplication.class, args);
		/*HostelController controller = ctx.getBean("hostelcontroller", HostelController.class);
		List<Hostel> list = null;
		list = controller.showAllHostelRooms("srnagar","ameerpet","kphb");
		for (Hostel rooms : list) {
			System.out.println(rooms);
		}
		((ConfigurableApplicationContext) ctx).close();*/
	}

}
