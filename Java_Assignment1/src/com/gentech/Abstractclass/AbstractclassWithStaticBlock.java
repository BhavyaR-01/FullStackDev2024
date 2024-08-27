package com.gentech.Abstractclass;
abstract class OneMath2
{
	static 
	{
		System.out.println("bhavya");
	}
	static 
	{

		System.out.println("ramya");
	}
	
}

class  TwoMath2 extends OneMath2
{
	void names()
	{
		
		System.out.println("kavya");
		
	}
	
}

public class AbstractclassWithStaticBlock {

	public static void main(String[] args) {
		TwoMath2 t= new TwoMath2();
		//t.names();

	}

}
