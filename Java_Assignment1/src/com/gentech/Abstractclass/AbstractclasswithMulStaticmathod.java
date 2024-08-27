package com.gentech.Abstractclass;

 abstract class OneMath
{
	static void Add(int x,int y)
	{
		int r;
		r=x+y;
		System.out.println(r);
	}
	static void Sub(int x,int y)
	{
		int r;
		r=x-y;
		System.out.println(r);
	}
	
}

class  TwoMath extends OneMath
{
	void mul(int x,int y)
	{
		int r;
		r=x*y;
		System.out.println(r);
		
	}
	
}

public class AbstractclasswithMulStaticmathod {

	public static void main(String[] args) {
		TwoMath oMath=new TwoMath();
		oMath.mul(9, 8);
		OneMath.Add(10, 9);
		OneMath.Sub(19, 2);

	}

}
