package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vc")
public class VehicleClass
{
@Autowired
 @Qualifier("de")
  private InterfaceEngine ife;
  
  public void move(String sourcePlace,String destPlace)
  {
	 ife.start();
	 System.out.println("sourcePlace"+sourcePlace);
	 ife.stop();
	 System.out.println("VehicleClass.move()");
	 System.out.println("sourcePlace"+destPlace);
	 
  }
}
