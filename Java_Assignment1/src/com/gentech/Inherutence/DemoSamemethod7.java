package com.gentech.Inherutence;

class DispCity {
    void display(String name) {
        System.out.println("1. City name in DispCity Parent Class: " + name);
    }
}
class DispArea extends DispCity {
    DispArea(String name){
        super.display(name);
    }

    void display(String name) {
        System.out.println("2. City name in DispArea Class: " + name);
    }
}

class DispLandmark extends DispArea {
    DispLandmark(String name){
    	super(name);
        super.display(name);
    }
    void display(String name){
        System.out.println("3. City name in DispLandMark Class: " + name);
    }
}
public class DemoSamemethod7 {

	public static void main(String[] args) {
		DispLandmark dispLandmark = new DispLandmark("Bangalore");
        dispLandmark.display("Kolkata");
	}

}
