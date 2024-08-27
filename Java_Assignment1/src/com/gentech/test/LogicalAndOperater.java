package com.gentech.test;

public class LogicalAndOperater {
	
	boolean displayAnd(int a,int b)
	{
		if(a>b&&b<a)
		{
			return true;
		}
		else
			return false;
		
	}

	public static void main(String[] args) {
		LogicalAndOperater l=new LogicalAndOperater();
		 boolean b=l.displayAnd(10, 19);
		 System.out.println(b);
	}

}
