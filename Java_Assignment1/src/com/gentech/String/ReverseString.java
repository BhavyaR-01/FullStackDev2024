package com.gentech.String;

public class ReverseString {

	public static void main(String[] args) {
		        String s = "bhavya";
		        StringBuilder sb = new StringBuilder(s);
		        for (int i = 0; i < sb.length()/2; i++) {
		            char temp = sb.charAt(i);
		            sb.setCharAt(i, sb.charAt(sb.length()-1-i));
		            sb.setCharAt(sb.length()-1-i, temp);
		        }
		        System.out.println(sb);
		    }
		}

	


