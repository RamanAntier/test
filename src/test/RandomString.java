package test;

import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

public class RandomString {
	
	@Test
	
	public void rString()
	{
		
	

	   int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
//	    Scanner scn=new Scanner (System.in);
//	    System.out.println("enter the length of target String");
//	    int targetStringLength= scn.nextInt();
//	    
	    int targetStringLength = 5;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	   
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	
	    System.out.println(generatedString);
}
	

}
