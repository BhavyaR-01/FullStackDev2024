package com.gentech.inheritence2;
class Bhavya1
{
	 void Displayname(String name)
	 {
		 System.out.println("name is "+name);
	 }
}
class Ramya1 extends Bhavya1
{
	Ramya1(String name)
	{
		super.Displayname(name);
			
	}
	void Displayname(String names)
	 {
		 System.out.println("name is "+names);
	 }
}
class kavya1 extends Ramya1
{
	kavya1(String name,String names)
	{
		super(name);
		super.Displayname(names);
	}
	void Displayname(String name)
	 {
		 System.out.println("name is "+name);
	 }
}

public class Methodswithconstractor {

	public static void main(String[] args) {
		kavya1 k=new kavya1("bhavya","ramya");
		k.Displayname("kavya");

	}

}
