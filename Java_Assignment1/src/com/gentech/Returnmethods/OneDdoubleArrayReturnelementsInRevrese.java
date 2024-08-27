package com.gentech.Returnmethods;

class ReverseEle
{
	double [] reverse(double d[])
	{
	  double res[]=new double[d.length];		
	  for(int i=0;i<d.length;i++) 
	  {
		  res[i]=d[i];
	  }
	  return res;
			
	}
}

public class OneDdoubleArrayReturnelementsInRevrese {

	public static void main(String[] args) {
		double d[]= {99.9,87.7,45.6,98.56,76.6};
		ReverseEle re=new ReverseEle();
		double de[]=re.reverse(d);
	 for(int i=de.length-1;i>=0;i--)
	 {
		 System.out.println(de[i]);
	 }

	}

}
