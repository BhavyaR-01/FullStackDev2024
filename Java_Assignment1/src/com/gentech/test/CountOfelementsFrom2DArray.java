package com.gentech.test;

public class CountOfelementsFrom2DArray {
	
int dispaly()
{
	short b[][]= {{1,2},{1,5},{4,8}};
	int count=0;
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++) {
			count=count+1;
		}
		
	}
	return count;
	
	
}

	public static void main(String[] args) {
		CountOfelementsFrom2DArray s=new CountOfelementsFrom2DArray();
		int g=s.dispaly();
		System.out.println(g);

	}

}
