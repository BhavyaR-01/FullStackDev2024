package com.gentech.trycatchnew;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		try
		{
			try
			{
				System.out.println("inner try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
			System.out.println("inner catch block");	
			}
			System.out.println("outer Try block");
		  }
			catch(Exception e)
			{
				System.out.println("outer catch block");
			}
		
		finally 
		{
			System.out.println("finally block");
		}
	}
}



