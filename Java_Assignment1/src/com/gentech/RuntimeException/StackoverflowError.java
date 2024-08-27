package com.gentech.RuntimeException;

public class StackoverflowError {
	 static void displayname()
	{
		System.out.println("bhavya");
		displayname();
	}

	public static void main(String[] args) {
		try {
			displayname();
		}catch(StackOverflowError e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("ok");
		}
	}

}
