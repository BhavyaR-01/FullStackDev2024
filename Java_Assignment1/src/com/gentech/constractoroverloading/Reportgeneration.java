package com.gentech.constractoroverloading;

class Reports
{
	Reports( String Rname)
	{
		System.out.println("Rname:"+Rname);
	}
	
	Reports( int Rid)
	{
		System.out.println("Rid:"+Rid);
	}
	
	Reports( long RNumberofpage)
	{
		System.out.println("RNumberofpage:"+RNumberofpage);
	}
	
	Reports( char reprottype)
	{
		System.out.println("reprottype:"+reprottype);
	}
	
	
	
	
}

public class Reportgeneration {

	public static void main(String[] args) {
		Reports rn=new Reports("pptreport");
		Reports ri=new Reports(12);
		Reports rnn=new Reports(76L);
		Reports rt=new Reports('p');
		

	}

}
