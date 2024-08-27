package com.gentech.String;

public class DeleteDay {

	public static void main(String[] args) {
		        String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < s.length()-2; i++) {
		            if(s.charAt(i) == 'D' && s.charAt(i+1) == 'A' && s.charAt(i+2) =='Y'){
		                i+=2;
		            }
		            else sb.append(s.charAt(i));
		        }
		        System.out.println(sb);
		    }
		}
