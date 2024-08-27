package com.gentech.innerouterclass;

class Outer1 {
    Inner1 In = new Inner1();
    void showouterinner()
    {
    	In.showinner();
    	In.age=20;
    	System.out.println("Ageis:"+In.age);
    }

    static class Inner1 {
        int Sid;
        String Stdname;
        int age;
        void showinner()
        {
        	Sid=10;
        	Stdname="bhavya";
        	int age=10;
            System.out.println("sid: "+Sid);
        	System.out.println("Stdname: "+Stdname);
        	System.out.println("Ageis:"+age);
        	
        	
        }
   
        }
   
}
    

public class StaticInner {

	public static void main(String[] args) {
		Outer1 o=new Outer1();
		o.showouterinner();

	}

}
