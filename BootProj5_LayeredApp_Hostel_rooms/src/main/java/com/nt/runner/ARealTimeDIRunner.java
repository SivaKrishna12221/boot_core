package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.nt.controller.HostelController;
import com.nt.model.Hostel;
@Component
@Order(2)
public class ARealTimeDIRunner implements CommandLineRunner
{
	@Autowired
    private HostelController controll;
   	@Override
	public void run(String... args) throws Exception {
	  List<Hostel> list=controll.showAllHostelRooms("kphb","dilsuknagar","jntu");
	  list.forEach(System.out::println);
		
	}

}
