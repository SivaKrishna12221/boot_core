package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployee 
{
   public List<Employee> getEmployee(String desg1,String desg2,String desg3)throws Exception;
   
}
