package test;

import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class testClass {
	@Test
	public  void x() 
	{
		  	System.out.println("Test");
	}
	
	@BeforeTest
	 public void y()
	{
		System.out.println("BeforeTest 1" );
	}
	@AfterTest
	public void z() {
		System.out.println("After Test");
	}
	@AfterClass
	public void m()
	{
		System.out.println("After Class");
	}
	@Test(priority=0)
	public void n()
	{
		System.out.println("priority zero");
	}
	@Test(priority=1)
	public  void o() 
	{
		  	System.out.println("Proirty 1");
	}
	@Test(priority=2)
	public  void p() 
	{
		  	System.out.println("Priority 2");
	}
	
	

}
