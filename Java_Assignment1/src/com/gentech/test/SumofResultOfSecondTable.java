package com.gentech.test;

class Table
{
	
		int secondtable()
		{
			int sum=0;
			int a[]=new int[11];
			for(int i=1;i<=10;i++)
			{
			  a[i]=2*i;	
			  sum=sum+a[i];
			}
			return sum;
		}
	}


public class SumofResultOfSecondTable {

	public static void main(String[] args) {
		Table t=new Table();
      int f=t.secondtable();
      System.out.println(f);
	}

}
