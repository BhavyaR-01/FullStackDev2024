package com.gentech.test2;

abstract class Animal
{
	abstract String displaybreed();
	
	
}
interface  Animaln
{
	 String Animalname();
     static int a=10;
}
interface  Animalage
{
	String displayage();

}
class Dog extends Animal implements Animaln,Animalage
{
	String displaybreed()
	{
		return "jully";
	}
	public String Animalname()
	{
		return "Dog";	
	}
	public String displayage()
	{
		return "24";
	}
	
}

public class MultipleInheritence2 {

	public static void main(String[] args) {
		Dog d=new Dog();
		String c=d.Animalname();
		String j=d.displaybreed();
		String k=d.displayage();
		System.out.println(c);
		System.out.println(j);
		System.out.println(k);
		
	}

}
