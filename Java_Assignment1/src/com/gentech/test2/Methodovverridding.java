package com.gentech.test2;
class Example
{
	void displayname(String name)
	{
		System.out.println(" Super class Name is "+name);
	}
}
class Example2 extends Example
{
	Example2(){
		super.displayname("bhavya");
	}
	void displayname(String name)
	{
		System.out.println(" Sub class Name is "+name);
	}
}

public class Methodovverridding {

	public static void main(String[] args) {// TODO Auto-generated method stub
		Example2 e=new Example2();
		e.displayname("ramya");
	}

}
