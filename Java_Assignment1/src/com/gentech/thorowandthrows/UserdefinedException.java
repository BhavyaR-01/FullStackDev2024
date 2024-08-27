package com.gentech.thorowandthrows;

class ToyoungException extends RuntimeException
{
	ToyoungException( String str)
	{
		super(str);
	}
}

class TooldException extends RuntimeException
{
	TooldException(String str)
	{
		super(str);
	}
}

public class UserdefinedException {
	
	static void Displaystatus( int age)
	{
		if(age>40)
		{
			throw new TooldException(" you are tooo old ");
		}
		else if(age<18)
		{
			throw new ToyoungException(" you are tooo young ");
		}
		else
		{
			System.out.println("proper age");
		}
	}

	public static void main(String[] args) {
		/*try {
		UserdefinedException.Displaystatus(99);
		} catch(RuntimeException e)
		{
			System.out.println("please go back");// no meaning in handling the custmozised exception
		}
		System.out.println("thankyou");*/
		UserdefinedException.Displaystatus(10);
	}

}
