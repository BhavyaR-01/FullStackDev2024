package com.gentech.innerouterclass;

class Outer {
    Inner In = new Inner();
    void showouterinner()
    {
    	In.showinner();
    	In.age=20;
    	System.out.println("Ageis:"+In.age);
    }

    private class Inner {
        int Sid;
        String Stdname;
        int age;
        void showinner()
        {
        	Sid=10;
        	Stdname="bhavya";

        	System.out.println("sid: "+Sid);
        	System.out.println("Stdname: "+Stdname);
        	
        }
   
        }
}
    
public class InnerouterDemo {
    public static void main(String[] args) {
    	Outer o=new Outer();
       o.showouterinner();
    	
    }
}
       

