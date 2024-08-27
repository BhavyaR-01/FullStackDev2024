package com.gentech.programs;

 class Twowheelar
 {
	  String TName;
	  int Tid;
 }
 
 class Fourwheelar
 {
	 String FName;
	 int Fid;
 }
 
 class Heavyvehicals
 {
	 String HName;
	 int Hid;
 }



public class Demo2 {

	public static void main(String[] args) {
		
		Twowheelar hon=new Twowheelar();
		hon.TName="Hondha";
		hon.Tid=2;
		System.out.println("TName: "+hon.TName);
		System.out.println("Tid: "+ hon.Tid);
		 System.out.println("+++++++++");
		 
		 
		 Fourwheelar fur=new Fourwheelar();
		 fur.FName="Thar";
		 fur.Fid=12;
		 System.out.println("Fname: "+fur.FName);
		 System.out.println("Fid: "+fur.Fid);
		 System.out.println("+++++++++");
		 
		 
		 Heavyvehicals hve=new Heavyvehicals();
		 hve.HName="Ashoka laylandha";
		 hve.Hid=9;
		 System.out.println("Hname: "+ hve.HName);
		 System.out.println("Hid: "+ hve.Hid);
				 
	
		
		

	}

}
