package com.nt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.HostelDAO;
import com.nt.DAO.HostelInterface;
import com.nt.model.Hostel;

@Service("hostelService")
public class HostelService implements HostelServiceInterface {
	@Autowired
	private HostelInterface dao;

	@Override
	public String checkHostelService(Hostel hostel) throws Exception {
		System.out.println("HostelService.checkHostelService()");

		String result = dao.setHostelDetails(hostel);
		return result;
	}
}
