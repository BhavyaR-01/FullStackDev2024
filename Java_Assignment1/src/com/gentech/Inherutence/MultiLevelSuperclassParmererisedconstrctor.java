package com.gentech.Inherutence;

class School
{
	School(String Student_name,String teacher_name,String Class)
	{
		System.out.println("StudentNeme: "+Student_name);
		System.out.println("teacher_name: "+teacher_name);
		System.out.println("class: "+Class);
		
	}
}
class Teacher extends  School
{ 
	String Subject;
	Teacher( String name,String t_name,String Classn, String Sub)
	{
			
		super(name,t_name,Classn);
		Subject=Sub;
		System.out.println("Subject: "+ Subject);
	}
}

class Student extends Teacher
{
	int Sid;
	Student (String name,String t_name,String Classn,String Sub,int Stid)
	{
		super(name,t_name,Classn,Sub);
		Sid=Stid;
		System.out.println("Sid: "+ Sid);	
		
	}
}

public class MultiLevelSuperclassParmererisedconstrctor {

	public static void main(String[] args) {
		Student te=new Student("bhavya","radha","10th","english",10);
     
	}

}
