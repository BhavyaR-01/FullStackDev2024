package com.gentech.Inherutence;
class Grandfather2
{
	void gname(String gname)
	{
		System.out.println("Grandfathername: "+gname);
	}
}
class Son2 extends Grandfather2
{
	void sonname(String sname)
	{
		Grandfather2 gf=new Grandfather2();
		gf.gname("krishnappa");
		System.out.println("sonname: "+sname);
	}
}
class Grandson2 extends Grandfather2
{
	void gson(String gson)
	{
		Grandfather2 gf=new Grandfather2();
		gf.gname("krishnappa");
		System.out.println("grandson: "+gson);
	}
}

class Granddaugther extends Son2
{
	void gdaug(String gdaug)
	{
		Son sn=new Son();
		sn.sonname("ravi");
		System.out.println("granmnddaughter: "+gdaug);
	}
	
}

public class HibridInheritence {

	public static void main(String[] args) {
		Grandson2 gn=new Grandson2();
		gn.gson("bhavya");
		Granddaugther gd=new Granddaugther();
	    gd.gdaug("ramya");
	}

}
