package com.gentech.noargsconstractor;

class Product1
{
  String productname;
  int pid;
  Product1()
  {
		productname="Redmi";
	    pid=12;
	    System.out.println("productname: "+productname);
	    System.out.println("productid"+ pid);
	    System.out.println("==============");
	    
  }
  
}
class Sales1
{
	int salesid;
	String salesperson;
	Sales1()
	{
		
	    salesid=12;
	    salesperson="ram";
	    System.out.println("salesid: "+salesid);
	    System.out.println("salesperson"+salesperson);
	    System.out.println("==============");
	}
	
}

class Order1
{
	int orderid;
	String place;
	Order1()
	{
	    orderid=30;
	    place="Anekal";
	    System.out.println("orderid: "+orderid);
	    System.out.println("place"+place);
	    System.out.println("==============");
	
}
}

class Inventery1
{
  int rating;
  int percentagesales;
  
  Inventery1()
  {
	 
	    rating =4;
	    percentagesales =99;
	    System.out.println("rating: "+ rating);
	    System.out.println("percentagesales"+ percentagesales);
	    System.out.println("=============="); 
  }
}

public class Industry {

	public static void main(String[] args) {
		 Product1 pod=new Product1();
		 Sales1 sal=new  Sales1();
		 Order1 ord= new Order1();
		 Inventery1 inv=new Inventery1();

	}

}
