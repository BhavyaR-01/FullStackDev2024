package com.gentech.parameterconstractor;

class Product2
{
  String productname;
  int pid;
  Product2(String pn,int pi)
  {
		productname=pn;
	    pid=pi;
	    System.out.println("productname: "+productname);
	    System.out.println("productid"+ pid);
	    System.out.println("==============");
	    
  }
  
}
class Sales2
{
	int salesid;
	String salesperson;
	Sales2(int si,String sp)
	{
		
	    salesid=si;
	    salesperson=sp;
	    System.out.println("salesid: "+salesid);
	    System.out.println("salesperson"+salesperson);
	    System.out.println("==============");
	}
	
}

class Order2
{
	int orderid;
	String place;
	Order2(int oi,String pl)
	{
	    orderid=oi;
	    place=pl;
	    System.out.println("orderid: "+orderid);
	    System.out.println("place"+place);
	    System.out.println("==============");
	
}
}

class Inventery2
{
  int rating;
  int percentagesales;
  
  Inventery2(int ra,int ps)
  {
	 
	    rating =ra;
	    percentagesales =ps;
	    System.out.println("rating: "+ rating);
	    System.out.println("percentagesales"+ percentagesales);
	    System.out.println("=============="); 
  }
}


public class Industry1 {

	public static void main(String[] args) {
		Product2 pod=new Product2("samsand",12);
		 Sales2 sal=new  Sales2(23,"ram");
		 Order2 ord= new Order2(12,"Anekal");
		 Inventery2 inv=new Inventery2(4,90);

	}

}
