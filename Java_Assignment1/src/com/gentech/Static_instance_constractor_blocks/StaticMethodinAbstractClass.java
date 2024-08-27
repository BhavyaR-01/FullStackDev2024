package com.gentech.Static_instance_constractor_blocks;

abstract class OneMath
{
	static void Add()
	{
		System.out.println("hii");
	}
	static void Sub()
	{
		System.out.println("hello");
	}
	
}
class  TwoMath extends OneMath
{
	void mul()
	{
		System.out.println("byee");
		
	}
	
}

public class StaticMethodinAbstractClass {

public static void main(String[] args) {
	OneMath oMath=new TwoMath();
		//oMath.mul();
		oMath.Add();
		oMath.Sub();

	}

}
