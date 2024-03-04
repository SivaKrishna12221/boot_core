package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
