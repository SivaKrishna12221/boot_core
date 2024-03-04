package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Hostel;

@Repository("hostelRepo")
@Profile({ "dev", "test" })
public class HostelDAO implements HostelInterface {
	private static final String INSERT_HOSTEL_DETAILS = "INSERT INTO HOSTELROOMS VALUES (?,?,?,?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public String setHostelDetails(Hostel hostel) throws Exception

	{
		int count = 0;
		System.out.println("HostelDAO.setHostelDetails()");

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
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return count == 1 ? "record  is inserted " : "record is not inserted";
	}
}
