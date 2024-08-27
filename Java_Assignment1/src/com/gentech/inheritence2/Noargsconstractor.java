package com.gentech.inheritence2;
class Aoneclass6
{
	Aoneclass6()
	{
		System.out.println("constractor1 name");
	}
}
class Bone6 extends Aoneclass6
{
	
	Bone6()
	{
		System.out.println("age");
	}
}
class Cone6 extends Bone6
{
	Cone6()
	{
		System.out.println("job");
		
	}
}

public class Noargsconstractor {

	public static void main(String[] args) {
		Cone6 c=new Cone6();
	}

}
