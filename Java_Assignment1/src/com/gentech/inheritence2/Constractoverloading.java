package com.gentech.inheritence2;

class Aoneclass8
{
	Aoneclass8(String name)
	{
		System.out.println(name+"constractor name1");
	}
	Aoneclass8(String name,int heigth)
	{
		System.out.println(name+"constractor name2 "+ heigth);
	}
	
}
class Bone8 extends Aoneclass8
{
	int age;
	Bone8(String names,int heigth,int age )
	{
		super(names,heigth);
		this.age=age;
		System.out.println(age);
		
	}
	Bone8(String names,int age)
	{
		super(names);
		this.age=age;
		System.out.println(age);
		
	}
}

public class Constractoverloading {

	public static void main(String[] args) {
		Bone8 b=new Bone8("bhavya",20,21);
		Bone8 b1=new Bone8("bhavya",20);

	}

}
