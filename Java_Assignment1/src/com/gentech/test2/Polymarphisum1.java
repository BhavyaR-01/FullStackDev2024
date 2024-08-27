package com.gentech.test2;
class Animal5 {
    void sound() 
    {
        System.out.println("This is an animal sound");
    }
}
class Dog5 extends Animal5 
{
    void sound() 
    {
        System.out.println("The dog barks");
    }
}

class Cat5 extends Animal5
{
    void sound() 
    {
        System.out.println("The cat meows");
    }
}


public class Polymarphisum1 {

	public static void main(String[] args) {
       Animal5 myAnimal=null;
        
        myAnimal = new Dog5(); 
        myAnimal.sound(); 
        
        myAnimal = new Cat5();
        myAnimal.sound(); 
	}

}
