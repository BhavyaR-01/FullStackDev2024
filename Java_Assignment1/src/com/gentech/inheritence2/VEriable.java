package com.gentech.inheritence2;

class A
{
	int age;
	 A(int age)
	 {
		 System.out.println("ageis " +age);
	 }
	
}
class B extends A
{
	int ages;
	B(int age,int ages)
	{
		super(age);
		this.ages=ages;
		System.out.println(ages);
	}

	
}

public class VEriable {

	public static void main(String[] args) {
		B b=new B(20,21);

	}

}
