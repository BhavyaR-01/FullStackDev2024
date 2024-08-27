package com.gentech.Returnmethods;

class SumofEle
{
	int sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
	   return sum;	
	}
	
}

public class SumofallElementsfromOneDarray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		SumofEle sm=new SumofEle();
		int s=sm.sum(a);
		System.out.println(s);
		

	}

}
