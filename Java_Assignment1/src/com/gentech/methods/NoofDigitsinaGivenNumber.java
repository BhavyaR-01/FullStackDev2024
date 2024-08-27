package com.gentech.methods;

class Integers
{
	void twodig(int a)
	{
		if( a>=10&&a<=99)
		{
			System.out.println("two digits");
		}
	}
	
	void onedig(int a)
	{
		if( a>=0&&a<=9||a<=-9)
		{
			System.out.println("one digits");
		}
	}
	
	void threedig(int a)
	{
		if(a>=100&&a<=999)
		{
			System.out.println("three digits");
		}
	}
	
	void fourdig(int a)
	{
		if(a>=1000&&a<=9999)
		{
			System.out.println("four digits");
		}
	}
}

public class NoofDigitsinaGivenNumber {

	public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	 Integers ig=new  Integers();
	 ig.onedig(a);
	 ig.twodig(a);
	 ig.threedig(a);
	 ig.fourdig(a);
	}

}
