package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("mysql_dao")
public class MySqlEmployeeDAO implements IEmployee {
	private static final String GET_EMPS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM MYDB.EMP WHERE JOB IN(?,?,?)ORDER BY JOB";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployee(String desg1, String desg2, String desg3) throws Exception {
		List list = null;
		try (Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(GET_EMPS_BY_DESG)) {
			System.out.println("MySqlEmployeeDAO.getEmployee()");
			System.out.println("get class:" + ds.getClass());
			pstmt.setString(1, desg1);
			pstmt.setString(2, desg2);
			pstmt.setString(3, desg3);
			try (ResultSet rs = pstmt.executeQuery()) {
				list = new ArrayList();
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEmpid(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getInt(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return list;
	}
}
