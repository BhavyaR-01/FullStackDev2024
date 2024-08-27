package com.gentech.Inherutence;

class Student9 {
String bookName;
Student9(String bookName)
{
	System.out.println("Book Name in Student class :"+bookName);	
}

}
class Library2 extends Student9 {
String bookName;
Library2(String name){
	super(name);
super.bookName=name;
}
void display(){
System.out.println("book Name in Library class :"+bookName);
}
}
class Bookshelf extends Library2{
String bookName;
Bookshelf(String name){
super(name);
super.bookName = name;

}
void displayBook() {
System.out.println("book Name in Bookshelf class :"+bookName);
}
}
public class DemoVariablesame8 {

	public static void main(String[] args) {
		Bookshelf o = new Bookshelf("Postgres SQL");
		o.bookName="Java Complete Reference";
		o.display();
		o.displayBook();

	}

}

