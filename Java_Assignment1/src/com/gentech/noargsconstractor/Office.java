package com.gentech.noargsconstractor;

class Employee1
{
   String Empname;
   int age;
   
   Employee1()
   {
     Empname = "Bhavya";
	 age=20;
	 System.out.println("Ename:  "+Empname);
	 System.out.println("Age:  "+ age);
	 System.out.println("+++++++++");

}
}
   class Department1
	{
		String Depname;
		int Depid;
		
		 Department1()
		 {
			 Depname="Acccounts";
			 Depid=1;
			 System.out.println("Depname: "+Depname);
			 System.out.println("Depid:  "+ Depid);
			 System.out.println("+++++++++");
		 }
	}
   
   class Insurence1
	{
		String InsName;
		int Insid;
		
		Insurence1()
		{
			 InsName= "yearly";
			 Insid= 10;
			 System.out.println("InsName: "+InsName);
			 System.out.println("Insid:  "+Insid);
		}
		
	}
   

public class Office {

	public static void main(String[] args) {
		Employee1 bhav = new Employee1();
		Department1 dep = new Department1();
		Insurence1 ins=new Insurence1();

	}

}


