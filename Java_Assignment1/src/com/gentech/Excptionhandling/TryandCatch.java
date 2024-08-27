package com.gentech.Excptionhandling;

public class TryandCatch {

	public static void main(String[] args) {
		System.out.println("my name is bhavya");
		//System.out.println(10/0);
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		System.out.println("my name is ramya");

	}

}
