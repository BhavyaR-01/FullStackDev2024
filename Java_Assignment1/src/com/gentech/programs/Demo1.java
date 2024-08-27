package com.gentech.programs;

		class Employee
		{
		   String Empname;
		   int age;
		
		}
		class Department
		{
			String Depname;
			int Depid;
		}
		class Insurence
		{
			String InsName;
			int Insid;
			
		}
		
		public class Demo1 {

		public static void main(String[] args) {
			
			 Employee bhav = new Employee();
			 bhav.Empname = "Bhavya";
			 bhav.age=20;
			 System.out.println("Ename:  "+ bhav.Empname);
			 System.out.println("Age:  "+ bhav.age);
			 System.out.println("+++++++++");
			 
			 Department dep =new Department();
			 dep.Depname="Acccounts";
			 dep.Depid=1;
			 System.out.println("Depname: "+dep.Depname);
			 System.out.println("Depid:  "+ dep.Depid);
			 System.out.println("+++++++++");
			 
			 Insurence ins=new Insurence();
			 ins.InsName= "yearly";
			 ins.Insid= 10;
			 System.out.println("InsName: "+ins.InsName);
			 System.out.println("Insid:  "+ ins.Insid);
			

		}

	}


