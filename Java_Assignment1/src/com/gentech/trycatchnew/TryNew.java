package com.gentech.trycatchnew;

public class TryNew {

	public static void main(String[] args) {
		try
		{
			System.out.println("one");
			System.out.println("two");
			System.out.println("three");
			try
			{
				System.out.println("four");
				System.out.println("five");
				System.out.println("six");	
			}
			catch(Exception e)
			{
				System.out.println("sevven");
			}
			finally
			{
				System.out.println("Eight");
			}
			System.out.println("nine");
		}
		catch(Exception e)
		{
			System.out.println("ten");
		}
		finally
		{
			System.out.println("elev");
		}
		System.out.println(10/0);

	}

}
