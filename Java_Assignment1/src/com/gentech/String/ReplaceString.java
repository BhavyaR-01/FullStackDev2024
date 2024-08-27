package com.gentech.String;

public class ReplaceString {
		    public static void main(String[] args) {
		        String s = "Hi my name is bhavya";
		        String arr[] = s.split(" ");
		        String Old = "bhavya";
		        String New = "ramya";

		        for (int i = 0; i < arr.length; i++) {
		            if(arr[i].equals(Old)){
		                arr[i] = New;
		            }
		        }
		        String result = String.join(" ", arr);
		        System.out.println(result);
		    }
		}

	


