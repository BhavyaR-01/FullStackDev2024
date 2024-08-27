package com.gentech.Returnmethods;

class Tables
{
	int []tablesofnumber(int a)
	{
		int res[]=new int[11];
		for(int i=1;i<=10;i++)
		{
			res[i]=a*i;
		}
		return res;
	}
}

public class Mathematicaltable {

	public static void main(String[] args) {
		Tables tb=new Tables();
		int number=Integer.parseInt(args[0]);
		int d[]=tb.tablesofnumber(number);
		for(int i=1;i<d.length;i++)
		{
			System.out.println(number+"*"+i+"="+d[i]);
		}
		
	}

}
