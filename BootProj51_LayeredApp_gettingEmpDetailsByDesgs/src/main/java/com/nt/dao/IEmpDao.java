package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmpDao
{
  public List<Employee> getEmpDetailsByDesg(String desg1,String desg2,String desg3)throws Exception;
}
