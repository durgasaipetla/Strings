package com.kodnest.Stringslevel4;

import java.util.Scanner;

public class FindCharacterFrequency {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a string to find frequency");
	String s= sc.next();
	String s1="";
	for(int i=0;i<s.length();i++) {
		if(!s1.contains(String.valueOf(s.charAt(i)))) {
			s1=s1+(s.charAt(i));
		}
	}
	System.out.println(s1);
	
	for (int i = 0; i <s1.length(); i++) {
		int count =0;
		for(int j=0;j<s.length();j++) {
			if(s1.charAt(i)==s.charAt(j)) {
				count++;
			}
		}
		System.out.println("The character: "+s1.charAt(i)+" frequency is: "+count);
	}
	
}
}
