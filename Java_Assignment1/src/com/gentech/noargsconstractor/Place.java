package com.gentech.noargsconstractor;

class Country1
{
	 String countryname;
	 int countryid;
	 Country1()
	 {
			countryname="India";
			countryid=21;
			System.out.println("countryname: "+countryname);
			System.out.println("countryid: "+countryid);
			System.out.println("+++++++++");
		
	 }
}
	 class State1
	 {
	 	String statename;
	 	String langauage;
	 	State1()
	 	{
	 		
			 statename="Karnataka";
			 langauage= "kannada";
			 System.out.println("statename: "+ statename);
			 System.out.println("langauage: "+ langauage);
			 System.out.println("+++++++++");
	 	}
	 	
	 	
	 }
	 class Distict1
	 {
	 	String districtname;
	 	int pincode;
	 	
	 	Distict1()
	 	{
	 		
			 districtname="Bengaluru";
			 pincode=3344;
			 System.out.println("districtname: "+  districtname);
			 System.out.println("pincode: "+  pincode);
					 
	 	}
	 }
	 class Village1
	 {
	 	String vname;
	 	String vdistic;
	 	
	 	Village1()
	 	{
	 		vname="Anekal";
		 	vdistic="Bengaluru";
		 	System.out.println("vname:"+ vname);
		 	System.out.println("vdistic"+vdistic);
	 	}
	 	
	 }



public class Place {

	public static void main(String[] args) {
		 Country1 cou =new Country1();
		 State1 sta=new State1();
		 Distict1 dis =new Distict1(); 
		 Village1 vil = new Village1();
		 

	}

}
