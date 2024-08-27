package com.gentech.test2;

class Outer
{
	String name;
	void displayname(String name)
	{
		System.out.println("name is: "+name);
	}
	Inner i=new Inner();
	
	class Inner
	{
		int age;
		void displayage(int age)
		{
			System.out.println("age is: "+age);
		}
	}
}

public class OuterclassInnerclass {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.displayname("bhavya");
		o.i.displayage(21);

	}

}
