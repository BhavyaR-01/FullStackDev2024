package com.gentech.RuntimeException;

public class Arrayoutofboundexception {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		try {
			System.out.println(a[4]);
			System.out.println(a[9]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("ok Array is good");
	}

}
