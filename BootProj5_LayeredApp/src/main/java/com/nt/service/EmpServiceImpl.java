package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployee;
import com.nt.model.Employee;
@Service("empService")
public class EmpServiceImpl implements IEmpService
{
	@Autowired
	@Qualifier("dao")
	public IEmployee empdao;
   public List<Employee> fetchAllEmpDetails(String desg1,String desg2,String desg3)throws Exception
   {
	   List<Employee> list=empdao.getEmployee(desg1,desg2,desg3);
	     
	   return list;
	   
   }
}
