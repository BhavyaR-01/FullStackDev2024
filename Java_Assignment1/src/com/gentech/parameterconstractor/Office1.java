package com.gentech.parameterconstractor;

class Employee2
{
   String Empname;
   int age;
   
   Employee2(String fn,int ag)
   {
     Empname = fn;
	 age=ag;
	 System.out.println("Ename:  "+Empname);
	 System.out.println("Age:  "+ age);
	 System.out.println("+++++++++");

}
}
   class Department2
	{
		String Depname;
		int Depid;
		
		 Department2(String dp,int di)
		 {
			 Depname=dp;
			 Depid=di;
			 System.out.println("Depname: "+Depname);
			 System.out.println("Depid:  "+ Depid);
			 System.out.println("+++++++++");
		 }
	}
   
   class Insurence2
	{
		String InsName;
		int Insid;
		
		Insurence2( String In,int Is )
		{
			 InsName= In;
			 Insid= Is;
			 System.out.println("InsName: "+InsName);
			 System.out.println("Insid:  "+Insid);
		}
		
	}
   

public class Office1 {

	public static void main(String[] args) {
		Employee2 bhav = new Employee2("Bhavya",20);
		Department2 dep = new Department2("Accounts",29);
		Insurence2 ins=new Insurence2("yearly",12);

	}

}