package com.gentech.programs;

class Country
{
	 String countryname;
	 int countryid;
}

class State
{
	String statename;
	String langauage;
}
class Distict
{
	String districtname;
	int pincode;
}

class Village
{
	String vname;
	String vdistic;
}

public class Demo3 {

	public static void main(String[] args) {
		
		Country cou =new Country();
		cou.countryname="India";
		cou.countryid=21;
		System.out.println("countryname: "+cou.countryname);
		System.out.println("countryid: "+cou.countryid);
		 System.out.println("+++++++++");
		 
		 
		 State sta=new State();
		 sta.statename="Karnataka";
		 sta.langauage= "kannada";
		 System.out.println("statename: "+ sta.statename);
		 System.out.println("langauage: "+ sta.langauage);
		 System.out.println("+++++++++");
		 
		 
		 Distict dis =new Distict();
		 dis.districtname="Bengaluru";
		 dis.pincode=3344;
		 System.out.println("districtname: "+  dis.districtname);
		 System.out.println("pincode: "+  dis.pincode);
				 
		

	}

}
