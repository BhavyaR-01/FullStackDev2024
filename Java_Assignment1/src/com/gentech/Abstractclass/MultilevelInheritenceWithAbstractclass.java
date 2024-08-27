package com.gentech.Abstractclass;

abstract class maths3
{
	abstract int add(int x,int y);
	abstract int sub(int x,int y);
}
class maths4 extends maths3
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
class maths5 extends maths4
{
	int div(int x,int y)
	 {
		int r;
		r=x/y;
		 return r;
	 }
}

public class MultilevelInheritenceWithAbstractclass {

	public static void main(String[] args) {
		 maths5 m=new  maths5();
		int e= m.div(10, 2);
		 int f=m.add(10,20);
		 int g=m.sub(10, 10);
		 System.out.println(e);
		 System.out.println(f);
		 System.out.println(g);

	}

}
