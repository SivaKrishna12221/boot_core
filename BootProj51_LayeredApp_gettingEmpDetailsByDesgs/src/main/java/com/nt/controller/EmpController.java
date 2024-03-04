package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IServiceEmployee;

@Controller("controller")
public class EmpController
{
@Autowired
  private IServiceEmployee service;
  public List<Employee> retriveEmployeeDetails(String desg1,String desg2,String desg3)throws Exception
  {
	 List<Employee> list=service.fetchEmployeeDetailsByDesg(desg1, desg2,desg3);
	 return list;
  }
}
