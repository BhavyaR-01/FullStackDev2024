package com.gentech.Static_instance_constractor_blocks;
abstract class Demo10 {
    static void display() {
        System.out.println("Static Method Can Be Displayed In Abstract Class");
    }
    static
    {
    	System.out.println("ddddddddd");
    }
    
}

class Demo2 extends Demo10 {
    void display1() {
        System.out.println("Method of child class");
    }
}

public class Static {
	public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.display1();
        Demo10 k= new Demo2();
        k.display();//Demo10.display();
        
        
      
    }

}
