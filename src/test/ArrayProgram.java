package test;

import java.util.Scanner;

public class ArrayProgram {
	public static void main(String[] args) {
		Scanner scn=  new Scanner(System.in);
		int size= scn.nextInt();
		int array[]= new int[size];
		int count=array.length;
		 
		for (int i=0;i<=size;i++)
		{
			System.out.println("enter the array element");
			array[i]=scn.nextInt();
			System.out.println( array.toString());
			
			
		}
		System.out.println("rev is");
		for (int i=array.length-1;i>=0;i++)
		{
			System.out.println(array[i]);
			
		}
		System.out.println();
		System.out.println("count is"+ count);
	}

}
