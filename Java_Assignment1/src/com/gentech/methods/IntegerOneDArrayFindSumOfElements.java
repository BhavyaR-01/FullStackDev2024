package com.gentech.methods;

class IntegerArray
{
	void Sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
		}
		
}

public class IntegerOneDArrayFindSumOfElements {
	public static void main(String[] args) {
		int a[]= {10,90,80,30,60,50,30};
		IntegerArray Ia=new IntegerArray();
		Ia.Sum(a);

	}

}
