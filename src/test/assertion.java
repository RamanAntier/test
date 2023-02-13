package test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {

	
		@Test
		void demo() {
			 Assert.assertTrue(true);
			 Assert.assertEquals("Welcome", "Welcome");
			 Assert.assertEquals("Selenium", "Selenium");
			 System.out.println("Passed");
			
		}
}
