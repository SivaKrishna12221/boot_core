package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Hostel;
import com.nt.service.IhostelServiceInterface;
@Controller("hostelcontroller")
public class HostelController 
{   
	@Autowired
	private IhostelServiceInterface service;
   public List<Hostel> showAllHostelRooms(String city1,String city2,String city3,String city4)throws Exception
   {
	   List<Hostel> list=null;
	   list=service.fetchHostelRooms(city1,city2,city3,city4);
	   return list;
   }
}
