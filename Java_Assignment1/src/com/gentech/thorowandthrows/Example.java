package com.gentech.thorowandthrows;

public class Example {

   static  int displayno(int i) throws ArithmeticException 
   {
			if (i==0)
			 {
				throw new ArithmeticException("provide valid number");
			 }
	   return 10/i;
   }
	public static void main(String[] args) {
		try {
			 int j=Example.displayno(0);
			 System.out.println(j);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("byee");
		

	}

}
