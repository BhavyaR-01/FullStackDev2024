package com.gentech.Returnmethods;
class Stringconcat
{
	String strcon(String a[])
	{
		String res =" ";
		for(int i=0;i<a.length;i++)
		{
			res+=a[i];
		}
		return res;
		
	}
}

public class OneDStringArrayConcatenate {

	public static void main(String[] args) {
		String a[]= {"ee","dd","jj","ll"};
		Stringconcat sc=new Stringconcat();
		String b=sc.strcon(a);
		System.out.println(b);
		
		
	}

}
