package com.gentech.parameterconstractor;


class Twowheelar2
{
	  String TName;
	  int Tid;
	  Twowheelar2(String tn,int ti)
	  {
		  
			TName=tn;
			Tid=ti;
			System.out.println("TName: "+TName);
			System.out.println("Tid: "+ Tid);
			System.out.println("+++++++++");
	  } 	  
}

class Fourwheelar2
{
	 String FName;
	 int Fid;
	 
	 Fourwheelar2(String fn,int fi)
	 {
		 
		 FName=fn;
		 Fid=fi;
		 System.out.println("Fname: "+FName);
		 System.out.println("Fid: "+Fid);
		 System.out.println("+++++++++");
	 }
}

class Heavyvehicals2
{
	 String HName;
	 int Hid;
	 
	 Heavyvehicals2(String hn,int hi)
	 {
		 HName=hn;
		 Hid=hi;
		 System.out.println("Hname: "+ HName);
		 System.out.println("Hid: "+ Hid);
		 System.out.println("+++++++++");
	 }
}



public class Vehicals1 {
	public static void main(String args[])
	{
	Twowheelar2 hon=new Twowheelar2("hondha",30);
	Fourwheelar2 fur=new Fourwheelar2("thar",12);
	Heavyvehicals2 hve=new Heavyvehicals2("ashoka laylandha",20);

}
	
	

}
