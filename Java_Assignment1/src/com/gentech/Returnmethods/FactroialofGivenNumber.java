package com.gentech.Returnmethods;
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

public class FactroialofGivenNumber {

	public static void main(String[] args) {
		FactNumber ft=new FactNumber();
		int number=Integer.parseInt(args[0]);
		int r=ft.factno(number);
		System.out.println(r);
				

}
}
