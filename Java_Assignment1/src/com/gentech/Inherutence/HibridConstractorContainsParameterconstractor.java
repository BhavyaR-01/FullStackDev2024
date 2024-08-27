package com.gentech.Inherutence;

class School2
{
	School2(String Student_name,String teacher_name,String Class)
	{
		System.out.println("StudentNeme: "+Student_name);
		System.out.println("teacher_name: "+teacher_name);
		System.out.println("class: "+Class);
		
	}
}
class Teacher2 extends  School2
{ 
	String Subject;
	Teacher2( String name,String t_name,String Classn, String Sub)
	{
			
		super(name,t_name,Classn);
		Subject=Sub;
		System.out.println("Subject: "+ Subject);
	}
}

class Student2 extends School2
{
	int Sid;
	Student2 (String name,String t_name,String Classn,int Stid)
	{
		super(name,t_name,Classn);
		Sid=Stid;
		System.out.println("Sid: "+ Sid);	
		
	}
}

class Parents extends Student2
{
	String parentname;
	Parents(String name,String t_name,String Classn,int Stid,String parentname)
	{
		super(name,t_name,Classn,Stid);
		System.out.println("parentname: "+parentname);
	}
}


public class HibridConstractorContainsParameterconstractor {

	public static void main(String[] args) {
		Teacher2 t=new Teacher2("bhavya","radha","10th","english");
		Parents p=new Parents("bhavya","radha","10th",10,"ravi");

	}

}
