package com.gentech.constractoroverloading;

class Product
{
	Product(String pname)
	{
     System.out.println("pname: "+pname);
	}
	
	Product(int pid)
	{
     System.out.println("pid: "+pid);
	}
	
	Product(double price)
	{
     System.out.println("price: "+price);
	}
	
	Product(long invoiceid)
	{
     System.out.println("invoiceid: "+invoiceid);
	}
	
	Product(Short Noofproducts)
	{
     System.out.println("Noofproducts: "+Noofproducts);
	}
	
	
}

public class Softwareproduct {

	public static void main(String[] args) {
		Product pn =new Product("lenovalaptop");
		Product pi =new Product(12);
		Product pp =new Product(2400d);
		Product pni =new Product(90000L);
		Product pnp =new Product(10);
		
				

	}

}
