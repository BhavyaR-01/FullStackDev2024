package com.gentech.programs;


class Student
{
	 String Sname;
	 int usn;
}

class Library
{
	String Booksname;
	int bookid;
	
}

class Sports
{
	String sportname;
	int studentid;
}

class Computerlab
{
	String Labname;
	int NoofSeats;
}
public class Demo5 {

	public static void main(String[] args) {
		Student std=new Student();
		std.Sname="Bhavay";
		std.usn=12;
		
	    System.out.println("Sname: "+std.Sname);
	    System.out.println("USN"+ std.usn);
	    System.out.println("==============");
	    
	    Library lib=new  Library();
	    lib.Booksname="java";
	    lib.bookid=19;
	    System.out.println("Booksname: "+lib.Booksname);
	    System.out.println("bookid"+lib.bookid);
	    System.out.println("==============");
	    
	    Sports spe= new Sports();
	    spe.sportname="vallyball";
	    spe.studentid=10;
	    System.out.println("sportname: "+spe.sportname);
	    System.out.println("studentid"+ spe.studentid);
	    System.out.println("==============");
	    


	    Computerlab  comp=new Computerlab();
	    comp.Labname ="dataStructres";
	    comp.NoofSeats =99;
	    System.out.println("Labname: "+  comp.Labname);
	    System.out.println("NoofSeats"+  comp.NoofSeats);
	    System.out.println("==============");
	    

	}

}
