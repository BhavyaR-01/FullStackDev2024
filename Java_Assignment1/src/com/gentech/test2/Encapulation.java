package com.gentech.test2;
class Encp
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Encapulation {

	public static void main(String[] args) {
		Encp e=new Encp();
		e.setName("bhavya");
		e.setAge(20);
		 String r= e.getName();
		 int c=e.getAge();
		System.out.println(r);
		System.out.println(c);

	}

}
