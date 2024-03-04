package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("electricEngine")
public class ElectricEngine implements InterfaceEngine
{
	
   @Override
    public void start() 
   {
	   System.out.println("ElectricEngine.start()");
	   
   System.out.println("start method");
}
    @Override
	public void stop() {
		// TODO Auto-generated method stub
    	System.out.println("ElectricEngine.stop()");
		
	}
}
