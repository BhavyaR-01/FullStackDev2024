package com.gentech.Static_instance_constractor_blocks;

class demo
{
	static {
		System.out.println("we can print a");//bycreating object
	}
	
}

public class OnlyStaticblock {
	static {
		System.out.println("we can print a");//without creating object
	}
	
	public static void main(String[] args) {
		demo d=new demo();
		
		
	}

	
	

}
