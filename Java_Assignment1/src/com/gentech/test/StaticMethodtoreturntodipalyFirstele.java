package com.gentech.test;

public class StaticMethodtoreturntodipalyFirstele {
	static int dislpay()
	{
		int []a= {40,10,60,30,50};
		int j=0; 
		for(int i=0;i<a.length;i++)
		{
			j=a[0];
		}
		return j;
	}

	public static void main(String[] args) {
		int p=StaticMethodtoreturntodipalyFirstele.dislpay();
		System.out.println(p);
	}

}
