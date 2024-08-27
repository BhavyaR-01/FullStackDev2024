package com.gentech.methods;

class Prime1
{

	void primediaplay1()
	{
		int cont=0;
		for(int i=50;i<=150;i++)
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
			cont=cont+1;
	         }
			
       }
		System.out.println(cont);
	}
}


public class CountofPrimenobt50to150 {

	public static void main(String[] args) {
		Prime1 p=new  Prime1();
		 p.primediaplay1();
		

	}

}
