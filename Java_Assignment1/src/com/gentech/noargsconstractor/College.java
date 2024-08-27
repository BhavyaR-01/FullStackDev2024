package com.gentech.noargsconstractor;

class Student1
{
	String Sname;
	int usn;
	Student1()
	{
		Sname="Bhavya";
		usn=12;
		System.out.println("Sname:"+Sname);
		System.out.println("usn:"+usn);
		System.out.println("***********");
	}
}

class Library1
{
	String bookname;
	int Bookid;
	Library1()
	{
		bookname="java";
		Bookid=12;
	System.out.println("Bookname: "+bookname);
	System.out.println("Bookid: "+Bookid);
	System.out.println("***********");
}
}

class Sports1
{
	String sportname;
	int studentid;
	 Sports1()
	 {
		 sportname="vallyball";
		 studentid=12;
		 System.out.println("sportname: "+sportname);
		 System.out.println("studentid: "+studentid);
		 System.out.println("***********");
	 }
	
}

public class College {

	public static void main(String[] args) {
		Student1 std=new Student1();
		Library1 lib=new Library1();
		Sports1 spo=new Sports1();
		

	}

}
