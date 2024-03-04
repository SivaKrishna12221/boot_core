package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasionFinder 
{
   @Autowired
   private LocalDate ldt;
   
   public String findSeason(String user)
   {
	  int month=ldt.getMonthValue();
	  if(month>=3&&month<=6)
	  {
		  return "summer season "+user;
	  }
	  else if(month>=7&&month<=20)
	  {
		return "rainy season" +user;
	  }
	  else
	  {
		  return "winter season";
	  }
   }
   
}
