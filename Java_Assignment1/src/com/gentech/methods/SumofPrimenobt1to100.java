package com.gentech.methods;

class prime2
{

	void primediaplay2()
	{
		int sum=0;
		for(int i=1;i<=100;i++)
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
			sum+=i;
	         }
			
       }
		System.out.println(sum);
	}
}



public class SumofPrimenobt1to100 {

	public static void main(String[] args) {
		prime2 p=new  prime2();
		 p.primediaplay2();

	}

}
