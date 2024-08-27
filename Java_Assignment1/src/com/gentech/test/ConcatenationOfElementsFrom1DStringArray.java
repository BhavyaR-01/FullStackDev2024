package com.gentech.test;

public class ConcatenationOfElementsFrom1DStringArray {
	 static String display()
	{
		String concat=" ";
		String c[]= {"bhavya"," R"," naidu"};
		for(int i=0;i<c.length;i++)
		{
			concat=concat+c[i];
		}
		return concat;
	}

	public static void main(String[] args) {
		String u=ConcatenationOfElementsFrom1DStringArray.display();
		System.out.println(u);

	}

}
