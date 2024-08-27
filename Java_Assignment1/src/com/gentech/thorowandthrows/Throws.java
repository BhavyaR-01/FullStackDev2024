package com.gentech.thorowandthrows;

public class Throws {

	public static void main(String[] args) {
		System.out.println("hello");
		//System.out.println(10/0);	
		throw new ArithmeticException("/by zero");
		        
	}
}
