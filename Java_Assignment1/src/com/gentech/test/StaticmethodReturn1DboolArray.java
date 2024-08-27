package com.gentech.test;
public class StaticmethodReturn1DboolArray {
	static boolean[] display()
	{
		boolean a[]= {true,false,true,false};
		return a;
	}

	public static void main(String[] args) {
		boolean c[]=StaticmethodReturn1DboolArray.display();
		for(int i =0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
