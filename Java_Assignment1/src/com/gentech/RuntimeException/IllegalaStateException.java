package com.gentech.RuntimeException;

public class IllegalaStateException {

	public static void main(String[] args) {
		Thread t=new Thread ();
		t.start();
		t.start();

	}

}
