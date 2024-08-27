package com.gentech.RuntimeException;

public class NullPointerException {

	public static void main(String[] args) {
		String s="bhavya";
		String h= null;
		try
		{
			System.out.println(s.length());
			System.out.println(h.length());
		}catch(java.lang.NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("the string is null");
	}

}
