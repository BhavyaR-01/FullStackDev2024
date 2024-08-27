package com.gentech.inheritence2;

class Aoneclass
{
	Aoneclass(String name)
	{
		System.out.println(name+"constractor name");
	}
}
class Bone extends Aoneclass
{
	int age;
	Bone(String names,int age)
	{
		super(names);
		this.age=age;
		System.out.println(age);
		
	}
}

public class Parameterizedconstractor {

	public static void main(String[] args) {
		
		Bone b=new Bone("bhavya",20);
	}

}
