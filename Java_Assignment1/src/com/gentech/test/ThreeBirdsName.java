package com.gentech.test;

public class ThreeBirdsName {
	String[] dipalybirds()
	{
		String b[]= {"pigen","picock","parro"};
	       return b;	
	}

	public static void main(String[] args) {
		ThreeBirdsName b=new ThreeBirdsName();
		String f[]=b.dipalybirds();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		

	}

}
