package com.gentech.Abstractclass;

abstract class Mathematics
{
	abstract int add(int x,int y);
	abstract int sub(int x,int y);
	
}
class Mathematics2 extends Mathematics
{
	 int add(int x,int y)
	 {
		int r;
		r=x+y;
		 return r;
	 }
	 
	 int sub(int x,int y)
	 {
		int r;
		r=x-y;
		 return r;
	 }
	
}

public class AbstractClassReturnValue {

	public static void main(String[] args) {
		Mathematics2 m=new Mathematics2();
		int j=m.add(10, 19);
		int k=m.sub(10, 5);
		System.out.println(j);
		System.out.println(k);
		

	}

}
