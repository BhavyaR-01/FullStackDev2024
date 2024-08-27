package com.gentech.Returnmethods;

class table
{
	int[] seventable()
	{
		int a[]=new int[11];
		for(int i=1;i<=10;i++)
		{
		  a[i]=7*i;	
		}
		return a;
	}
}

public class SeventhTableinReverse {

	public static void main(String[] args) {
		table tb=new table();
		int c[]=tb.seventable();
		for(int i=1;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		

	}

}
