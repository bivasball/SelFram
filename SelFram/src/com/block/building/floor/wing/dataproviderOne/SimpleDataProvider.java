package com.block.building.floor.wing.dataproviderOne;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {
  
	@Test(dataProvider="datap98")
  public void f(String aa,String bb) {
	  System.out.println("print::"+aa);
	  System.out.println("pring::"+bb);
		
	  
  }



@DataProvider(name="datap98")
public Object[][] simdata(){
	
	Object[][] data= new Object[2][2];
	//1st row
	data[0][0] = "halo1";
	data[0][1] = "halohai1";
	//2nd row
	data[1][0] = "sechalo1";
	data[1][1] = "sechalohai1";
	
	
	return data;
	
}

@Test
public void ff(){
	System.out.println("how are you?");
	throw new SkipException("Skipping this exception");

	
}
@Test(timeOut=1000) // specify time in milliseconds
public void executetimeOut() throws InterruptedException{
	Thread.sleep(3000);
         // Thread.sleep(500);
}




}
