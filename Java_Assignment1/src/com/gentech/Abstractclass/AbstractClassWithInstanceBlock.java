package com.gentech.Abstractclass;
abstract class OneMath3
{
	
	{
		System.out.println("bhavya");
	}
	
	{

		System.out.println("ramya");
	}
	
}

class  TwoMath3 extends OneMath3
{
	void names()
	{
		
		System.out.println("kavya");
		
	}
	
}


public class AbstractClassWithInstanceBlock {

	public static void main(String[] args) {
		TwoMath2 t= new TwoMath2();
		t.names();


	}

}
