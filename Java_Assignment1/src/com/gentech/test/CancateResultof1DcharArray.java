package com.gentech.test;

public class CancateResultof1DcharArray {
	 static String  display()
		{
			String concat=" ";
			char c[]= {'b','R','n'};
			for(int i=0;i<c.length;i++)
			{
				concat=concat+c[i];
			}
			return concat;
		}

	public static void main(String[] args) {
		String u=CancateResultof1DcharArray.display();
		System.out.println(u);

	}

}
