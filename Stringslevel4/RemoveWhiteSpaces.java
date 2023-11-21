package com.kodnest.Stringslevel4;

import java.util.Scanner;

public class RemoveWhiteSpaces {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a string");
	String s1=sc.nextLine();
	StringBuffer sb= new StringBuffer();
	String arr[]=s1.split(" ");
	for(int i=0;i<arr.length;i++) {
		sb.append(arr[i]);
	}
	String s2= new String (sb);
	for (String string : arr) {
		System.out.print(string);
	}
	
}
}
