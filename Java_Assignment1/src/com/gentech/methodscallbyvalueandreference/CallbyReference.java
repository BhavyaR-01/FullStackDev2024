package com.gentech.methodscallbyvalueandreference;
class Byref
{
	int x,y;
	void addition(Byref re)
	{
		
		re.x=re.x+1;
		re.y=re.y+1;
		System.out.println("Addition Result x: "+re.x);
		System.out.println("Addition Result Y: "+re.y);
		
	}
}
public class CallbyReference {

	public static void main(String[] args) {
		
		Byref re=new Byref();
		 re.x=10;
		 re.y=20;
		System.out.println("before method exectionX: "+re.x);
		System.out.println("before method exectionY: "+re.y);
		
		re.addition(re);
		System.out.println("After method exectionX: "+re.x);
		System.out.println("After method exectionY: "+re.y);
				  
	}

}
