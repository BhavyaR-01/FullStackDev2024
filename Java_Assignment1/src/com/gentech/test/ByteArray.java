package com.gentech.test;

public class ByteArray {
	static byte[] display()
	{
		byte a[]= {0,1,0,9,79};
		return a;
	}

	public static void main(String[] args) {
		byte v[]=ByteArray.display();
		for(int i=0;i<v.length;i++)
		{
			System.out.println(v[i]);
		}

	}

}
