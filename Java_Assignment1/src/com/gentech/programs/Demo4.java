package com.gentech.programs;


class Product
{
  String productname;
  int pid;
}

class Sales
{
	int salesid;
	String salesperson;
}

class Order
{
	int orderid;
	String place;
	
}

class inventery
{
  int rating;
  int percentagesales;
}

public class Demo4 {

	public static void main(String[] args) {
	
		Product pod=new Product();
		pod.productname="Redmi";
	    pod.pid=12;
	    System.out.println("productname: "+pod.productname);
	    System.out.println("productid"+ pod.pid);
	    System.out.println("==============");
	    
	    Sales sal=new  Sales();
	    sal.salesid=12;
	    sal.salesperson="ram";
	    System.out.println("salesid: "+sal.salesid);
	    System.out.println("salesperson"+sal.salesperson);
	    System.out.println("==============");
	    
	    Order ord= new Order();
	    ord.orderid=30;
	    ord.place="Anekal";
	    System.out.println("orderid: "+ord.orderid);
	    System.out.println("place"+ord.place);
	    System.out.println("==============");
	    


	    inventery inv=new inventery();
	    inv.rating =4;
	    inv.percentagesales =99;
	    System.out.println("rating: "+ inv.rating);
	    System.out.println("percentagesales"+ inv.percentagesales);
	    System.out.println("==============");
	    
	    
	    
	    		
		
		

	}

}
