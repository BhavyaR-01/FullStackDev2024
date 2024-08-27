package com.gentech.parameterconstractor;

class Country1
{
	 String countryname;
	 int countryid;
	 Country1(String cn,int ci)
	 {
			countryname=cn;
			countryid=ci;
			System.out.println("countryname: "+countryname);
			System.out.println("countryid: "+countryid);
			System.out.println("+++++++++");
		
	 }
}
	 class State1
	 {
	 	String statename;
	 	String langauage;
	 	State1(String st,String sl)
	 	{
	 		
			 statename=st;
			 langauage= sl;
			 System.out.println("statename: "+ statename);
			 System.out.println("langauage: "+ langauage);
			 System.out.println("+++++++++");
	 	}
	 	
	 	
	 }
	 class Distict1
	 {
	 	String districtname;
	 	int pincode;
	 	
	 	Distict1(String dn,int pi)
	 	{
	 		
			 districtname=dn;
			 pincode=pi;
			 System.out.println("districtname: "+  districtname);
			 System.out.println("pincode: "+  pincode);
					 
	 	}
	 }
	 class Village1
	 {
	 	String vname;
	 	String vdistic;
	 	
	 	Village1(String vn,String vd)
	 	{
	 		vname=vn;
		 	vdistic=vd;
		 	System.out.println("vname:"+ vname);
		 	System.out.println("vdistic:"+vdistic);
	 	}
	 	
	 }

public class Place2 {

	public static void main(String[] args) {
		 Country1 cou =new Country1("india",24);
		 State1 sta=new State1("Karnataka","kannada");
		 Distict1 dis =new Distict1("Bengaluru",29202); 
		 Village1 vil = new Village1("Anekal","Bengaluru");
		 

	}

}
