package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmpDao;
import com.nt.model.Employee;

@Service("service")

public class EmployeeSeviceClass implements IServiceEmployee
{
	@Autowired
	@Qualifier("finalDao")
	private IEmpDao dao;
	@Override
	public List<Employee> fetchEmployeeDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		
	
		List<Employee> list=dao.getEmpDetailsByDesg(desg1, desg2, desg3);
		return list;
	}
	
}
