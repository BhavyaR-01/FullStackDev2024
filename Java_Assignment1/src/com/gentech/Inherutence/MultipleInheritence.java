package com.gentech.Inherutence;
class Grandfather
{
	void gname(String gname)
	{
		System.out.println("Grandfathername: "+gname);
	}
}
class Son extends Grandfather
{
	void sonname(String sname)
	{
		Grandfather gf=new Grandfather();
		gf.gname("krishnappa");
		System.out.println("sonname: "+sname);
	}
}
class Grandson extends Son
{
	void gson(String gson)
	{
		Son s=new Son();
		s.sonname("ravi");
		System.out.println("grandson: "+gson);
	}
}

public class MultipleInheritence {

	public static void main(String[] args) {
		Grandson g=new Grandson();
           g.gson("bhavya");
	}

}
