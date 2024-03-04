package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("de")
public class DieselEngine implements InterfaceEngine
{
   public DieselEngine()
   {
	   System.out.println("DieselEngine.DieselEngine()");
   }
   public void start()
   {
	   System.out.println("DieselEngine.start()");
   }
 
@Override
public void stop() {
	// TODO Auto-generated method stub
	
}
}
