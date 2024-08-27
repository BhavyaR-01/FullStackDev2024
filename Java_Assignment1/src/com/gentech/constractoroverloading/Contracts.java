package com.gentech.constractoroverloading;
//constractoroverloading and also constractor chaining
class contract
{
	contract( int contid)
	{
		System.out.println("contractid"+contid);
	}
	
	contract( String contname)
	{
		this(12);
		System.out.println("contname: "+contname);
		
	}
	contract( long contpricr)
	{
		this("bus");
		System.out.println("contpricr:"+contpricr);
	}
	contract( double duration)
	{
		this(800L);
		System.out.println("duration:"+duration);
	}
	contract( float Noofresourcr)
	{
		this(2300d);
		System.out.println("Noofresourcr: "+Noofresourcr);
	}
}

public class Contracts {

	public static void main(String[] args) {
		
		contract cr =new contract(30f);

	}

}
