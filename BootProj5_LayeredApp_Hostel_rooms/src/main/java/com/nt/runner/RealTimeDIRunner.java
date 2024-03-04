package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.nt.controller.HostelController;
import com.nt.model.Hostel;
@Component
@Order(1)
public class RealTimeDIRunner implements CommandLineRunner
{
  @Autowired
  private HostelController control;
  public void run(String...args)throws Exception
  {
     List<Hostel> list=control.showAllHostelRooms("srnagar","panjagutta","madhapur","kbhp");
     list.forEach(System.out::println);
  }
  
}
