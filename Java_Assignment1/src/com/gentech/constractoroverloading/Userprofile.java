package com.gentech.constractoroverloading;

class User
{
	 User( String name)
	 {
		 System.out.println("User name: "+name);
	 }
	 
	 User(int phoneno)
	 {
		 System.out.println("User Phoneno: "+phoneno);
	 }
	 
	 User(double salary)
	 {
		 System.out.println("User Salary: "+salary); 
	 }
	 
	 User(float age)
	 {
		 System.out.println("User age: "+age); 
	 }
	 
	 User(short doby)
	 {
		 System.out.println("User dob: "+doby); 
	 }	
}

public class Userprofile {

	public static void main(String[] args) {
	   User na = new User("Bhavya");
	   User ph = new User(9964);
	   User sl = new User(10000d);
	   User ag = new User(74f);
	   User db = new User(2003);
	   
	   

	}

}
