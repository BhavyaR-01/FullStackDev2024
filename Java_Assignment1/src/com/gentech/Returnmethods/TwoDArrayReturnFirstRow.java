package com.gentech.Returnmethods;

class CharArry
{
	char [][] twoD( char a[][])
	{
	char res[][]=new char[a.length][a[0].length];
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

public class TwoDArrayReturnFirstRow {

	public static void main(String[] args) {
		 char a[][]= {{'w','u','o'},{'i','k','r'},{'y','p','t'}};//2d char array
		 CharArry ca=new CharArry();
		 char c[][]=ca.twoD(a);
		 for(char k:c[0])
		 {
			System.out.print(k+" ");
		 }
	}

}
