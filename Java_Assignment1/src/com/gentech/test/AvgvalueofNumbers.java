package com.gentech.test;

public class AvgvalueofNumbers {
	
	int avgdisplay(int a,int b,int c)
	{
		int d;
		d=(a+b+c)/3;
		return d;
	}

	public static void main(String[] args) {
		AvgvalueofNumbers v=new AvgvalueofNumbers();
		int k=v.avgdisplay(10, 30, 10);
		System.out.println(k);
		

	}

}
