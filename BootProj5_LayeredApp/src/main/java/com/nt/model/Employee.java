package com.nt.model;

import lombok.Data;


public class Employee {
	private Integer empid;
	private String ename;
	private String job;
	private Integer sal;
	private Integer deptno;

	
	  public void setEmpid(Integer empid) { this.empid = empid; }
	  
	  public Integer getEmpid() { return empid; }
	  
	  public void setEname(String ename) { this.ename = ename; }
	  
	  public String getEname() { return ename; }
	  
	  public void setJob(String job) { this.job = job; }
	  
	  public String getJob() { return job; }
	  
	  public void setSal(Integer sal) { this.sal = sal; }
	  
	  public Integer getSal() { return sal; }
	  
	  public void setDeptno(Integer deptno) { this.deptno = deptno; }
	  
	  public Integer getDeptno() { return deptno; }
	 
   public String toString()
   {
	   return "Employee[empid:"+empid+" ename:"+ename+" job:"+job+" sal:"+sal+" deptno:"+deptno+"]";
   }
}
