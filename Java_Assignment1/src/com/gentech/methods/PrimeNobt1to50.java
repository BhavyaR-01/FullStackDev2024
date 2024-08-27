package com.gentech.methods;

class prime
{

	void primediaplay()
	{

		for(int i=2;i<=50;i++)
		{
			boolean isPrime = true;
			for(int j=2;j<i;j++)
			{
				
			 if(i%j==0)
			 {
				 
			 isPrime=false;
			 break; 
				
			}
			
		}
			if(isPrime==true) {
			System.out.println(i);
	         }
}
	}
}


public class PrimeNobt1to50 {

	public static void main(String[] args) {
		 prime p=new  prime();
		 p.primediaplay();
	

	}

}
