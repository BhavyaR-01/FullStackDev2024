package com.gentech.RuntimeException;

public class ExceptionInIntializerEroor {
	
	static {
		String s=null;
		System.out.println(s.length());
	}
	//or this
	static int x=10/0;
	
	public static void main(String[] args) {
		
		System.out.println(x);
		
	}

}
