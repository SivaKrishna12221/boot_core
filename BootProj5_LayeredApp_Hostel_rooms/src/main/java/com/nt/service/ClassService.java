package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IhostelInterface;
import com.nt.model.Hostel;
@Service("hostelservice")
public class ClassService implements IhostelServiceInterface
{
 @Autowired
 private IhostelInterface hostel;
 
 public List<Hostel> fetchHostelRooms(String city1,String city2,String city3,String city4)throws Exception
 {
	 System.out.println("ClassService.fetchHostelRooms()");
	 List<Hostel> list=null;
	 list=hostel.getHostelRooms(city1,city2,city3,city4);
	 return list;
 }
}
