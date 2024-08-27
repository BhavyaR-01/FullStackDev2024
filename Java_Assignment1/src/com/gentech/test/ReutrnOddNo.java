package com.gentech.test;

public class ReutrnOddNo {
	 int[] displayodd()
	 {
		 int b[]=new int[6];
		 int k=0;
		 int cont=0;
		 for(int i=21;i>=11;i--)
		 {
			 if(i%2 !=0)
			 {
				 cont++;
				 b[k]= i;
				 k++;
			 } 
		 }
		 System.out.println(cont);
		 return b;
	 }

	public static void main(String[] args) {
		ReutrnOddNo r=new ReutrnOddNo();
		int y[]=r.displayodd();
		for(int i=0;i<y.length;i++) {
		System.out.println(y[i]);

	}
	}

}
