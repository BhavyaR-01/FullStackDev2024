package com.gentech.test;

public class CountOfNumbers50to30Divby4 {
	int returncountofno()
	{
		int count=0;
		for(int i=50;i>=30;i--)
		{
			if(i%4==0)
			{
				count=count+1;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		CountOfNumbers50to30Divby4 g=new CountOfNumbers50to30Divby4();
		 int f=g.returncountofno();
		 System.out.println(f);
		
	}

}
