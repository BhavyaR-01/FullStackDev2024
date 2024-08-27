package com.gentech.Inherutence;

class Grandfather3
{
	void gname(String gname)
	{
		System.out.println("Grandfathername: "+gname);
	}
}
class Son3 extends Grandfather3
{
	void sonname(String sname)
	{
		Grandfather gf=new Grandfather();
		gf.gname("krishnappa");
		System.out.println("sonname: "+sname);
	}
}
class Grandson3 extends Grandfather3
{
	void gson(String gson)
	{
		Grandfather gf=new Grandfather();
		gf.gname("ramappa");
		System.out.println("grandson: "+gson);
	}
}


public class HierachicalInhetitence {

	public static void main(String[] args) {
		Son3 s=new Son3();
		s.sonname("ravi");
		Grandson3 g=new Grandson3 ();
		g.gson("bhavya");
		

	}

}
