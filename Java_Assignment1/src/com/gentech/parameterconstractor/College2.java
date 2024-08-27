package com.gentech.parameterconstractor;

class Student2
{
	String sname;
	int usn;
	Student2(String sn,int un)
	{
		sname =sn;
		usn=un;
		System.out.println("sname:"+sname);
		System.out.println("uns: "+usn);
		System.out.println("=================");
	}
  
}
class Library2
{
	String bookname;
	int bookid;
	 Library2(String bn,int bi)
	 {
		 bookname= bn;
		 bookid=bi;
		    System.out.println("Bookname: "+bookname);
			System.out.println("Bookid: "+bookid);
			System.out.println("***********");
		 
	 }
	
}

class Sports2
{
	String sportname;
	int stdid;
	Sports2(String sp,int si)
	{
		sportname=sp;
		 stdid=si;
		 System.out.println("sportname: "+sportname);
		 System.out.println("studentid: "+stdid);
		 System.out.println("***********");
		
	 	
	}
	
}
public class College2 {

	public static void main(String[] args) {
		Student2 std=new Student2("bhavya",20);
		Library2 lib=new Library2("java",90);
		Sports2 spo=new Sports2("vallyball",20);
		Student2 std1=new Student2("bhavya",21);

	}

}
