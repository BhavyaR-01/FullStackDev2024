package com.gentech.test;

public class StringRepintoInt {
	int dispaly(String a)
	{
		 int c = Integer.parseInt(a);
		 return c;
	}
	    
  public static void main(String[] args) {
		StringRepintoInt g=new StringRepintoInt();
		 int s=g.dispaly("12");
          System.out.println(s);
	}

}
