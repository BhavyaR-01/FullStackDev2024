package com.gentech.noargsconstractor;


class Twowheelar1
{
	  String TName;
	  int Tid;
	  Twowheelar1()
	  {
		  
			TName="Hondha";
			Tid=2;
			System.out.println("TName: "+TName);
			System.out.println("Tid: "+ Tid);
			System.out.println("+++++++++");
	  } 	  
}

class Fourwheelar1
{
	 String FName;
	 int Fid;
	 
	 Fourwheelar1()
	 {
		 
		 FName="Thar";
		 Fid=12;
		 System.out.println("Fname: "+FName);
		 System.out.println("Fid: "+Fid);
		 System.out.println("+++++++++");
	 }
}

class Heavyvehicals1
{
	 String HName;
	 int Hid;
	 
	 Heavyvehicals1()
	 {
		 HName="Ashoka laylandha";
		 Hid=9;
		 System.out.println("Hname: "+ HName);
		 System.out.println("Hid: "+ Hid);
	 }
}

public class Vehicals {
	public static void main(String args[])
	{
	Twowheelar1 hon=new Twowheelar1();
	Fourwheelar1 fur=new Fourwheelar1();
	Heavyvehicals1 hve=new Heavyvehicals1();

}
}
