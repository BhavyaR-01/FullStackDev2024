package com.gentech.Inherutence;

class Animals
{
	Animals(String Aname)
	{
		System.out.println("Animalname: "+Aname);
	}
	Animals(String Animalbreed,int cost)
	{
		System.out.println("Animalbreed: "+Animalbreed);
		System.out.println("cost"+cost);
	}
	
}
class Dog extends Animals
{
	String dogname;
	Dog(String Aname,String Dogname)
	{
		super(Aname);
		dogname=Dogname;
		System.out.println("Dogname: "+dogname);				
	}
	Dog(String Animalbreed,int cost )
	{
		super(Animalbreed,cost);
		System.out.println("Animalbreed: "+Animalbreed);
	}
}
class Cat extends Dog
{
	String Catname;
	Cat(String Aname,String Dogname,String cname)
	{
		super(Aname,Dogname);
		Catname=cname;
		System.out.println("Catname: "+Catname);
		
		}
	Cat(String Animalbreed,int cost,String cname)
	{
		super(Animalbreed,cost);
		System.out.println("Catname: "+Catname);
		
	}
}


public class MultilevelConstractoroverloading {
	
	public static void main(String[] args) {
		Cat c=new Cat("jully","1000","catti");
		Cat j= new Cat("Dog&cat","happy","catty");
	
		
	}

}
