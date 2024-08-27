package com.gentech.encapusalation;

class encapusalation
{
	private int studid;
	private int password;
	
	public int getStudid() {
		System.out.println("hii");
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid+1;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

}

public class Encapusalationdemo {

	public static void main(String[] args) {
		encapusalation e=new encapusalation();
		e.setStudid(20);
		e.setPassword(1234);
		int f=e.getStudid();
		int k=e.getPassword();
		System.out.println(f);
		System.out.println(k);

	}

}
