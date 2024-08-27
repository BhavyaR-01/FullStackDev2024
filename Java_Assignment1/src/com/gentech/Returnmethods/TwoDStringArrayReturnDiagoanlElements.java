package com.gentech.Returnmethods;

class StringArray
{
	String [][]diagaonal(String a[][])
	{
		String res[][]=new String[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[i].length;j++)
        	{
        		res[i][j]=a[i][j];
        	}
        }
        return res;
	
		
	}
}

public class TwoDStringArrayReturnDiagoanlElements {

	public static void main(String[] args) {
		String a[][]= {{"ww","rr","tt"},{"ee","oo","jj"},{"pp","dd","hh"}};
		StringArray sa=new StringArray();
		String c[][]=sa.diagaonal(a);
          for(int i=0;i<c.length;i++)
          {
        	  System.out.println(c[i][i]+" ");
        	 
          }
	}

}
