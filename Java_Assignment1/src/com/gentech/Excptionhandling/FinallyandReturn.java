package com.gentech.Excptionhandling;

public class FinallyandReturn {
	
	static int dispaly()
	{
		try
		{
			System.out.println("try");
			System.out.println(10/0);
			return 10;
		}catch(Exception e)
		{
			System.out.println("catch");
			return 20;
		}
		finally
		{
			System.out.println("finally");
		   return 30;
		}
		
	}

	public static void main(String[] args) {
		int vi=FinallyandReturn.dispaly();
		System.out.println(vi);
		}

}
