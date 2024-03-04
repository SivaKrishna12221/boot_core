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

import com.nt.model.Hostel;

@Repository("hostel")
public class HostelRoomsImpl implements IhostelInterface {
	private  static final String GET_HOSTEL_DETAILS = "SELECT CITY,HOSTEL_NAME,ROOM_NUMBER,SHARING,PRICE,WASHING_MACHINE FROM HOSTELROOMS WHERE CITY IN(?,?,?,?)";
	@Autowired
	private DataSource ds;

	public List<Hostel> getHostelRooms(String city1, String city2, String city3,String city4) throws Exception

	{
		List<Hostel> list = null;
		try (Connection con = ds.getConnection(); 
			PreparedStatement pstmt = con.prepareStatement(GET_HOSTEL_DETAILS);) 
		{
			System.out.println("datasource:"+ds.getClass());
			pstmt.setString(1, city1);
			pstmt.setString(2, city2);
			pstmt.setString(3, city3);
			pstmt.setString(4, city4);
			ResultSet rs = pstmt.executeQuery();

			list = new ArrayList<Hostel>();
			while (rs.next()) {
				Hostel hostel = new Hostel();
				hostel.setCity(rs.getString(1));
				hostel.setHostelName(rs.getString(2));
				hostel.setRoomNumber(rs.getInt(3));
				hostel.setSharing(rs.getInt(4));
				hostel.setPrice(rs.getInt(5));
				hostel.setWashingMachine(rs.getString(6));
				list.add(hostel);
			}
		}
		catch(SQLException s)
		{
			s.printStackTrace();
			throw s;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
       return list;
	}
}
