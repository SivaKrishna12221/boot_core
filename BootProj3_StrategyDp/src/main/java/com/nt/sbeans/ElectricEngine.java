package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ee")
public class ElectricEngine implements InterfaceEngine
{
	public ElectricEngine()
	{
		System.out.println("ElectricEngine.ElectricEngine()");
	}
   @Override
    public void start() 
   {
   System.out.println("start method");
}
    @Override
	public void stop() {
		// TODO Auto-generated method stub
    	System.out.println("ElectricEngine.stop()");
		
	}
}
