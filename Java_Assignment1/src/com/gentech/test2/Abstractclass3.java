package com.gentech.test2;

abstract class One
{
	void displayname()
	{
		System.out.println("name is bhavya");
	}
	static
	{
		System.out.println("age is 12");
		System.out.println("it is a static block");
	}
}
class Two extends One
{
    void Classtwo()
    {
    	System.out.println("it is class two");
    }
}
public class Abstractclass3 {

	public static void main(String[] args) {
		Two t=new Two();
		t.Classtwo();
		t.displayname();
	}

}
