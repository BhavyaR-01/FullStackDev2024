package com.gentech.methodscallbyvalueandreference;

class callbyval
{
	
	void Addition(int x,int y)
	{
		x=x+1;
		y=y+1;
		System.out.println("Addition Result x: "+x);
		System.out.println("Addition Result Y: "+y);
		
	}
}
public class CallByValue {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("before method exectionX "+x);
		System.out.println("before method exectionY "+y);
		callbyval val=new callbyval();
		val.Addition(x,y);
		System.out.println("After method exectionX: "+x);
		System.out.println("After method exectionY: "+y);
		

	}

}
