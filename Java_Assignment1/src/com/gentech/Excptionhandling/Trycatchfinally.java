package com.gentech.Excptionhandling;

public class Trycatchfinally {

	public static void main(String[] args) {
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		} 
		//catch(NullPointerException e)
		catch(ArithmeticException e)
		{
			//System.out.println("hii");
			System.out.println(10/0);
			e.printStackTrace();
			
		}
		finally
		{
			
			System.out.println("bhavya");
			//System.out.println(10/0);
		}

	}

}
