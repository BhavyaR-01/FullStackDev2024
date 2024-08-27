package com.gentech.inheritence2;
class Aoneclass2
{
	Aoneclass2(String name)
	{
		System.out.println(name+"   constractor name");
	}
}
class Bone2 extends Aoneclass2
{
	int age;
	Bone2(String names,int age)
	{
		super(names);
		this.age=age;
		System.out.println(age);
		
	}
}
class Cone extends Bone2
{
	String job;
	Cone(String names,int age,String job)
	{
		super(names,age);
		this.job=job;
		System.out.println("job");
		
	}
}

public class Parameterizedmultilevel {

	public static void main(String[] args) {
		Cone c=new Cone("bhavya",20,"nojob");

	}

}
