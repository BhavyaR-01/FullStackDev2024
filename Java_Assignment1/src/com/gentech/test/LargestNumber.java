package com.gentech.test;

public class LargestNumber {
	int displaylargestno(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static void main(String[] args) {
		LargestNumber l=new LargestNumber();
		int f=l.displaylargestno(12, 19);
       System.out.println(f);
	}

}
