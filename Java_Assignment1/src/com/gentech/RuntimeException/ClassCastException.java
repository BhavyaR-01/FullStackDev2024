package com.gentech.RuntimeException;

import java.net.MulticastSocket;

public class ClassCastException {

	public static void main(String[] args) {
		String s=new String("bhavya");
		Object o=(Object)s;
		System.out.println(o);
		//Object j=new Object();
		//String p=(String)j;
		try {
			Object j=new Object();
			String p=(String)j;
		}catch(java.lang.ClassCastException e)
		{
			e.printStackTrace();
		}
		System.out.println("can't be done");
		Object k=new String("ramya");
		String t=(String)k;
	  System.out.println(t);
		
	}

}
