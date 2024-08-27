package com.gentech.test;

class vote
{
	static String display(int a)
	{
		if(a<18)
		{
			return "noteligibale";
		}
		else 
		{
		return "yeseligibale";
         }
	}
}
public class PersonEligibaleforvoting {

	public static void main(String[] args) {
		String b=vote.display(10);
		System.out.println(b);

	}

}
