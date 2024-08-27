package com.gentech.Returnmethods;

class SquareNumber
{
	int squareno(int a)
	{
		int c=0;
		c=a*a;
		/*for(int i=1;i<=a;i++)
		{
		  c=i*i;
		 }*/
		 return c;
		}
		 
}

public class SquareofNumberfrom1to10 {

	public static void main(String[] args) {
		SquareNumber sn=new SquareNumber();
		for(int i=1;i<=10;i++)
		{
			int r=sn.squareno(i);
			System.out.println(r);
			
		}
		

	}

}
