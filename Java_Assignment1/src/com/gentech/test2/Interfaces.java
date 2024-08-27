package com.gentech.test2;
interface oneo
{
	void dispalyname();
}
interface Twoo
{
	void displayage();
}
interface Threeo extends oneo,Twoo
{
	void displayslary();
}
class Four implements Threeo
{
	 public void dispalyname()
	{
		System.out.println("name is Bhavya");
	}
	
	public void displayage()
	{
		System.out.println("age is 20");
	}
	public void displayslary()
	{
		System.out.println("Slary is 20000");
	}
	
	
}

public class Interfaces {

	public static void main(String[] args) {
		Four f=new Four();
		f.dispalyname();
		f.displayage();
		f.displayslary();

	}

}
