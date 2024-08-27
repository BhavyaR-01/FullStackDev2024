package com.gentech.constractoroverloading;

class GentechInvoice
{
	
	GentechInvoice(int Invoiceid )
	{
		System.out.println("Invoiceid: "+Invoiceid);
	}
	
	GentechInvoice(String Invoicename )
	{
		System.out.println("Invoicename: "+Invoicename);
	}
	
	GentechInvoice(double qutinty)
	{
		System.out.println("qutinty: "+qutinty);
	}
	
	GentechInvoice(float productamount)
	{
		System.out.println("productamount: "+productamount);
	}
	
	GentechInvoice(String productfname ,String productshortcut)
	{
		System.out.println("productfname: "+productfname);
	}
	
	GentechInvoice(long date)
	{
		System.out.println("Date: "+date);
	}
	
	
	
}

public class Invoice {
	
	public static void main(String args[])
	{
		GentechInvoice In=new GentechInvoice(12);
		GentechInvoice Ina=new GentechInvoice("Products");
		GentechInvoice qe=new GentechInvoice(1.0d);
		GentechInvoice am=new GentechInvoice(2400f);
		GentechInvoice pa=new GentechInvoice("laptoplenova","lenova");
		GentechInvoice Ind=new GentechInvoice(24);
		
		
		
	}

}
