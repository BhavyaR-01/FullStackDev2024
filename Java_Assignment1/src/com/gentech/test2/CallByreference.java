package com.gentech.test2;

class Reference
{
	int age;
	int displayage(Reference r)
	{
		return r.age+10;
	}
}

public class CallByreference {

	public static void main(String[] args) {
		Reference r= new Reference();
		r.age=12;
		System.out.println("age before"+r.age);
		 int c=r.displayage(r);
		 System.out.println(c);
		 System.out.println("age after method call"+r.age);
		 
		
		
		

	}

}
