package com.gentech.Static_instance_constractor_blocks;

public class DemoStatic {
 static int a=10;
    
	public static void main(String[] args) {
		System.out.println(a);
		DemoStatic d=new DemoStatic();
		d.display();
		
	}
	void display()
	{
		System.out.println(a);
	}

}
