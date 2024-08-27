package com.gentech.methods;

class Intarray
{
	void cube(int a[])
	{
		int k=0;
	  for(int i=0;i<a.length;i++)
	  {
		  k= a[i]*a[i]*a[i];
		  System.out.println(k);
	  }
	 
	}
}

public class CubeofEachelementin1DintegerArray {

	public static void main(String[] args) {
		int a[]= {2,10,20,30,40};
		Intarray Ia=new Intarray();
		Ia.cube(a);
		

	}

}
