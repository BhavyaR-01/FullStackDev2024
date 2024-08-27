package com.gentech.methods;

class Table
{
	void comptable(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}

public class TodisplayCompleteTable {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		Table tb=new Table();
		tb.comptable(a);

	}

}
