package com.gentech.inheritence2;
class Bhavya
{
	 void Displayname(String name)
	 {
		 System.out.println("name is "+name);
	 }
}
class Ramya extends Bhavya
{
	void Displayname(String name,String names)
	 {
		super.Displayname(name);
		 System.out.println("name is "+names);
	 }
}
class kavya extends Ramya
{
	void Displayname(String name,String names,String namess)
	 {
		super.Displayname(name,names);
		 System.out.println("name is "+namess);
	 }
}

public class Methodswithinheritence {
	public static void main(String[] args)
	{
		kavya k=new kavya();
		k.Displayname("kavya","ramya","bhavya");
		
	}

}
