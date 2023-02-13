package test;

import java.util.Random;

import org.testng.annotations.Test;

public class randomStringTwo {
	@Test
	public void stringtwo() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    String generatedString=random.ints(leftLimit,rightLimit+1).limit(targetStringLength).collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
	    System.out.println("New Generated String is.."+generatedString);
//	    String generatedString = random.ints(leftLimit, rightLimit + 1)
//	      .limit(targetStringLength)
//	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//	      .toString();
//
//	    System.out.println(generatedString);
}}
