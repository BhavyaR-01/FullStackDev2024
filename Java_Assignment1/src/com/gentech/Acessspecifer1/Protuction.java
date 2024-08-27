package com.gentech.Acessspecifer1;

public class Protuction {
	private int private_a=10;
	protected int Protected_b=100;
	int Default_C=1000;
	public int Public_d=10000;
	public static void main(String[] args) {
		Protuction p=new Protuction();
          System.out.println(p.private_a);
          System.out.println(p.Protected_b);
          System.out.println(p.Default_C);
          System.out.println(p.Public_d);
	}

}
