package com.gentech.String;

public class CommanaAdding {

	public static void main(String[] args) {
		        String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		        StringBuffer sb = new StringBuffer(s);
		        for (int i = 0; i < sb.length(); i++) {
		            if(sb.charAt(i) == 'Y'){
		                sb.insert(i+1,",");
		                i +=2;
		            }
		        }
		        System.out.println(sb);
		    }
		}

