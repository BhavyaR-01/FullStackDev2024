package com.gentech.Returnmethods;

class OneDarray
{
	int [] halfofele(int a[])
	{
	   int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
		 res[i]=a[i];   
	}
		return res;
}
}
public class OneDIntegerArrayDisplayFirstHalfofElements {

	public static void main(String[] args) {
		OneDarray od=new OneDarray();
		int a[]= {10,20,30,40,50,60,70,80};
		 int col=a.length;
		 System.out.println(col);
		 int c[]=od.halfofele(a);
		 for(int j=0;j<c.length/2;j++)//display first half of elements
		 {
			 System.out.println(c[j]);
		 }

	}

}
