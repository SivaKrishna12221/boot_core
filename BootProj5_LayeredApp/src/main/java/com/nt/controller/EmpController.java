package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmpService;
@Controller("empcontroller")
public class EmpController 
{
	@Autowired
	private IEmpService empser;
 public  List<Employee> showAllEmpByDesg(String desg1,String desg2,String desg3)throws Exception
 {
	 List<Employee> list=empser.fetchAllEmpDetails(desg1,desg2,desg3);
	 return list;
 }
}
