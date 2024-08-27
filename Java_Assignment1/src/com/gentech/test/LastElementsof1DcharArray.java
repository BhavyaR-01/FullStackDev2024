package com.gentech.test;

public class LastElementsof1DcharArray {
	static char dislpay()
	{
		char a[]= {'a','s','f','g'};
		char j=0; 
		for(int i=0;i<a.length;i++)
		{
			j=a[a.length-1];
		}
		return j;
	}

	public static void main(String[] args) {
		char p=LastElementsof1DcharArray.dislpay();
		System.out.println(p);

	}

}
