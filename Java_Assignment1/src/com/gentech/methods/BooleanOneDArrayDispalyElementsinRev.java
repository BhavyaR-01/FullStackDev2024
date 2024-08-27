package com.gentech.methods;

class BooleanArray
{
	void reverse(boolean a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}

public class BooleanOneDArrayDispalyElementsinRev {

	public static void main(String[] args) {
	boolean a[]= {true,false,true,false,true,true};
	BooleanArray ba=new BooleanArray();
			ba.reverse(a);
	
	}

}
