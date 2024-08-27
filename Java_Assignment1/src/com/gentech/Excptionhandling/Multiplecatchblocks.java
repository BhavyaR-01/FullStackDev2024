package com.gentech.Excptionhandling;

public class Multiplecatchblocks {

	public static void main(String[] args) {
		try
		{
			System.out.println("bhavya");
			//System.out.println(10/0);
			int a[]= {1,2,3,4,5,6,7,8,5,9};
			for(int i=0;i<=a.length;i++)
			{
				System.out.println(a[i]);
			}
			
		}
		catch(ArithmeticException e)
		{
		     e.printStackTrace();
		}
        catch(NullPointerException e)
		{
	       e.printStackTrace();
		}
		 catch(IndexOutOfBoundsException e)
		{
	     e.printStackTrace();
		}
		 catch(Exception e)
		{
	     e.printStackTrace();
		}
		finally
		{
			System.out.println("hii");
		}
		System.out.println("hello");
		
	}

}
