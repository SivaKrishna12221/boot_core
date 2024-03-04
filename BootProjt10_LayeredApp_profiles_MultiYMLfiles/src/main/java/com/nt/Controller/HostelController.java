package com.nt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.Service.HostelServiceInterface;
import com.nt.model.Hostel;

@Controller("hostelController")
public class HostelController 
{
	@Autowired
	private HostelServiceInterface hsi ;
  public String enterdata(Hostel hostel)throws Exception
  {
	  System.out.println("HostelController.enterdata()");
	 String result=hsi.checkHostelService(hostel);
	 return result;
  }
}
