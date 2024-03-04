package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDao_oracle")
public class EmployeeDaoClass implements IEmpDao {
	private final static String getEmpByDesgs = "SELECT * FROM EMP WHERE JOB IN (?,?,?)";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmpDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = null;
		try (Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(getEmpByDesgs);) {
			System.out.println(ds.getClass());
			pstmt.setString(1, desg1);
			pstmt.setString(2, desg2);
			pstmt.setString(3, desg3);
			ResultSet rs = pstmt.executeQuery();
			list = new ArrayList<Employee>();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getInt(4));
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
