package com.nt;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired
   private LocalDateTime localDate;
   
   public String generateWishMessage(String user)
   {
	   int hour=localDate.getHour();
	   if(hour<=12)
	   {
		   return "Good morning:"+user;
	   }
	   else if(hour<=16)
	   {
		   return "good afternoon:"+user;
	   }
	   else if(hour<=18)
	   {
		   return "good evening:"+user;
	   }
	   else
	   {
		   return "good night:"+user;
	   }
   }
}
