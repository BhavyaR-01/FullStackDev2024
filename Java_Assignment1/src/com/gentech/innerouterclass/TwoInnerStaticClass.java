package com.gentech.innerouterclass;

class Outernew4
{
	 Inner3 In =new  Inner3();
	 Inner4 Inn = new  Inner4();	
	 void showtwoinnerclass()
	{
		In.Innerclass();
		Inn.Innerclass4();
	}
	 
	
	static class Inner3
	{
		void Innerclass()
		{
		String stdname="bhavya";
		int sid=10;
		System.out.println("sid: "+sid);
      	System.out.println("Stdname: "+stdname);
		}
		
			
	}
	static class Inner4
	{
		 void Innerclass4()
		{
			String stdname="kavya";
			int sid=20;
			System.out.println("sid: "+sid);
	      	System.out.println("Stdname: "+stdname);
			
		}
		
	}
	
}

public class TwoInnerStaticClass {

	public static void main(String[] args) {
		Outernew4 o=new Outernew4();
		o.showtwoinnerclass();


	}

}
