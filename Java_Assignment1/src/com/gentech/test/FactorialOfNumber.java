package com.gentech.test;
class FactNumber
{
	  int factno(int a)
	  {
		 int c=1;
		  for(int i=1;i<=a;i++)
		 {
			c=c*i;
		 }
		  return c;
	  }
}

public class FactorialOfNumber {

	public static void main(String[] args) {
		FactNumber ft=new FactNumber();
		int r=ft.factno(4);
		System.out.println(r);

	}

}
