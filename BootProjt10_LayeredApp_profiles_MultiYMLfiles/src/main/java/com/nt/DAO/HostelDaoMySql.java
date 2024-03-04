package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Hostel;

@Repository("my_sql")
@Profile({"uat","prod"})
public class HostelDaoMySql implements HostelInterface {
	private final static String INSERT_HOSTEL_DETAILS = "insert into profile_hostel_rooms values(?,?,?,?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public String setHostelDetails(Hostel hostel) throws Exception {
		System.out.println("HostelDaoMySql.setHostelDetails()");
		int i=0;
		try {
			Connection con = ds.getConnection();
			System.out.println(ds.getClass());
			PreparedStatement pstmt = con.prepareStatement(INSERT_HOSTEL_DETAILS);
			pstmt.setString(1, hostel.getCity());
			pstmt.setString(2, hostel.getHostel_name());
			pstmt.setInt(3, hostel.getRoom_number());
			pstmt.setInt(4, hostel.getSharing());
			pstmt.setDouble(5, hostel.getPrice());
			pstmt.setString(6, hostel.getWashing_machine());
			i=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(i>0) {
		return "details entered successfully";
	}
		else
		{
			return "Details are not stored";
		}
		
}
}
