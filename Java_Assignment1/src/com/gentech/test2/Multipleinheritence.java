package com.gentech.test2;
class Demo2
{
	Demo2(String name,int age)
	{
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
	}
}
class Demo3 extends Demo2
{
	Demo3(String name,int age,String address)
	{
		super(name,age);
		System.out.println("Adress is: "+address);
	}
}

public class Multipleinheritence {

	public static void main(String[] args) {
		Demo3 d=new Demo3("bhavya", 20, "Anekal");

	}

}
